/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.vulcan.internal.jaxrs.context.provider;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.odata.filter.ExpressionConvert;
import com.liferay.portal.odata.filter.FilterParser;
import com.liferay.portal.vulcan.context.AcceptLanguage;
import com.liferay.portal.vulcan.internal.context.AcceptLanguageImpl;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.ServerErrorException;
import javax.ws.rs.ext.Provider;

import org.apache.cxf.jaxrs.ext.ContextProvider;
import org.apache.cxf.message.Message;

import org.osgi.framework.BundleContext;

/**
 * @author Brian Wing Shun Chan
 */
@Provider
public class FilterContextProvider implements ContextProvider<Filter> {

	public FilterContextProvider(
		BundleContext bundleContext,
		ExpressionConvert<Filter> expressionConvert, Portal portal) {

		_bundleContext = bundleContext;
		_expressionConvert = expressionConvert;
		_portal = portal;
	}

	@Override
	public Filter createContext(Message message) {
		try {
			return _createContext(message);
		}
		catch (Exception e) {
			throw new ServerErrorException(500, e);
		}
	}

	private Filter _createContext(Message message) throws Exception {
		HttpServletRequest httpServletRequest =
			ContextProviderUtil.getHttpServletRequest(message);

		String filterString = ParamUtil.getString(httpServletRequest, "filter");

		if (_log.isDebugEnabled()) {
			_log.debug("Filter parameter value: " + filterString);
		}

		if (Validator.isNull(filterString)) {
			return null;
		}

		String oDataEntityModelName =
			ContextProviderUtil.getODataEntityModelName(message);

		if (_log.isDebugEnabled()) {
			_log.debug("OData entity model name: " + oDataEntityModelName);
		}

		if (oDataEntityModelName == null) {
			return null;
		}

		FilterParser filterParser =
			ContextProviderUtil.getODataEntityModelService(
				_bundleContext, FilterParser.class, oDataEntityModelName);

		if (filterParser == null) {
			return null;
		}

		if (_log.isDebugEnabled()) {
			_log.debug("OData filter parser: " + filterParser);
		}

		com.liferay.portal.odata.filter.Filter oDataFilter =
			new com.liferay.portal.odata.filter.Filter(
				filterParser.parse(filterString));

		if (_log.isDebugEnabled()) {
			_log.debug("OData filter: " + oDataFilter);
		}

		EntityModel entityModel =
			ContextProviderUtil.getODataEntityModelService(
				_bundleContext, EntityModel.class, oDataEntityModelName);

		if (_log.isDebugEnabled()) {
			_log.debug("Entity model: " + entityModel);
		}

		if (entityModel == null) {
			return null;
		}

		AcceptLanguage acceptLanguage = new AcceptLanguageImpl(
			httpServletRequest, _portal);

		Filter filter = _expressionConvert.convert(
			oDataFilter.getExpression(), acceptLanguage.getPreferredLocale(),
			entityModel);

		if (_log.isDebugEnabled()) {
			_log.debug("Search filter: " + filter);
		}

		return filter;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		FilterContextProvider.class);

	private final BundleContext _bundleContext;
	private final ExpressionConvert<Filter> _expressionConvert;
	private final Portal _portal;

}