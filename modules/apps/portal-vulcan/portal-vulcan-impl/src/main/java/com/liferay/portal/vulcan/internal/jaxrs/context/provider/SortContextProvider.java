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
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.odata.sort.SortField;
import com.liferay.portal.odata.sort.SortParser;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.internal.accept.language.AcceptLanguageImpl;

import java.util.List;

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
public class SortContextProvider implements ContextProvider<Sort[]> {

	public SortContextProvider(BundleContext bundleContext, Portal portal) {
		_bundleContext = bundleContext;
		_portal = portal;
	}

	@Override
	public Sort[] createContext(Message message) {
		try {
			return _createContext(message);
		}
		catch (Exception e) {
			throw new ServerErrorException(500, e);
		}
	}

	private Sort[] _createContext(Message message) throws Exception {
		HttpServletRequest httpServletRequest =
			ContextProviderUtil.getHttpServletRequest(message);

		String sortString = ParamUtil.getString(httpServletRequest, "sort");

		if (_log.isDebugEnabled()) {
			_log.debug("Sort parameter value: " + sortString);
		}

		if (Validator.isNull(sortString)) {
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

		SortParser sortParser = ContextProviderUtil.getODataEntityModelService(
			_bundleContext, SortParser.class, oDataEntityModelName);

		if (sortParser == null) {
			return null;
		}

		if (_log.isDebugEnabled()) {
			_log.debug("OData sort parser: " + sortParser);
		}

		com.liferay.portal.odata.sort.Sort oDataSort =
			new com.liferay.portal.odata.sort.Sort(
				sortParser.parse(sortString));

		if (_log.isDebugEnabled()) {
			_log.debug("OData sort: " + oDataSort);
		}

		AcceptLanguage acceptLanguage = new AcceptLanguageImpl(
			httpServletRequest, _portal);

		List<SortField> sortFields = oDataSort.getSortFields();

		Sort[] sorts = new Sort[sortFields.size()];

		for (int i = 0; i < sortFields.size(); i++) {
			SortField sortField = sortFields.get(i);

			sorts[i] = new Sort(
				sortField.getSortableFieldName(
					acceptLanguage.getPreferredLocale()),
				!sortField.isAscending());
		}

		return sorts;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		SortContextProvider.class);

	private final BundleContext _bundleContext;
	private final Portal _portal;

}