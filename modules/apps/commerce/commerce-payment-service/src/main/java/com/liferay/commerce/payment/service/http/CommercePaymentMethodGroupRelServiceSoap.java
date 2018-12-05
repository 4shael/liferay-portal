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

package com.liferay.commerce.payment.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.commerce.payment.service.CommercePaymentMethodGroupRelServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link CommercePaymentMethodGroupRelServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel}, that is translated to a
 * {@link com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Luca Pellizzon
 * @see CommercePaymentMethodGroupRelServiceHttp
 * @see com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap
 * @see CommercePaymentMethodGroupRelServiceUtil
 * @generated
 */
@ProviderType
public class CommercePaymentMethodGroupRelServiceSoap {
	public static com.liferay.commerce.model.CommerceAddressRestriction addCommerceAddressRestriction(
		long classPK, long commerceCountryId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.commerce.model.CommerceAddressRestriction returnValue = CommercePaymentMethodGroupRelServiceUtil.addCommerceAddressRestriction(classPK,
					commerceCountryId, serviceContext);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap createCommercePaymentMethodGroupRel(
		long commercePaymentMethodGroupRelId) throws RemoteException {
		try {
			com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel returnValue =
				CommercePaymentMethodGroupRelServiceUtil.createCommercePaymentMethodGroupRel(commercePaymentMethodGroupRelId);

			return com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCommerceAddressRestriction(
		long commerceAddressRestrictionId, long groupId)
		throws RemoteException {
		try {
			CommercePaymentMethodGroupRelServiceUtil.deleteCommerceAddressRestriction(commerceAddressRestrictionId,
				groupId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static void deleteCommercePaymentMethodGroupRel(
		long commercePaymentMethodGroupRelId) throws RemoteException {
		try {
			CommercePaymentMethodGroupRelServiceUtil.deleteCommercePaymentMethodGroupRel(commercePaymentMethodGroupRelId);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.model.CommerceAddressRestrictionSoap[] getCommerceAddressRestrictions(
		long classPK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.commerce.model.CommerceAddressRestriction> orderByComparator,
		long groupId) throws RemoteException {
		try {
			java.util.List<com.liferay.commerce.model.CommerceAddressRestriction> returnValue =
				CommercePaymentMethodGroupRelServiceUtil.getCommerceAddressRestrictions(classPK,
					start, end, orderByComparator, groupId);

			return com.liferay.commerce.model.CommerceAddressRestrictionSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getCommerceAddressRestrictionsCount(long classPK,
		long groupId) throws RemoteException {
		try {
			int returnValue = CommercePaymentMethodGroupRelServiceUtil.getCommerceAddressRestrictionsCount(classPK,
					groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap getCommercePaymentMethodGroupRel(
		long commercePaymentMethodGroupRelId) throws RemoteException {
		try {
			com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel returnValue =
				CommercePaymentMethodGroupRelServiceUtil.getCommercePaymentMethodGroupRel(commercePaymentMethodGroupRelId);

			return com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap getCommercePaymentMethodGroupRel(
		long groupId, String engineKey) throws RemoteException {
		try {
			com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel returnValue =
				CommercePaymentMethodGroupRelServiceUtil.getCommercePaymentMethodGroupRel(groupId,
					engineKey);

			return com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap[] getCommercePaymentMethodGroupRels(
		long groupId) throws RemoteException {
		try {
			java.util.List<com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel> returnValue =
				CommercePaymentMethodGroupRelServiceUtil.getCommercePaymentMethodGroupRels(groupId);

			return com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap[] getCommercePaymentMethodGroupRels(
		long groupId, boolean active) throws RemoteException {
		try {
			java.util.List<com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel> returnValue =
				CommercePaymentMethodGroupRelServiceUtil.getCommercePaymentMethodGroupRels(groupId,
					active);

			return com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap[] getCommercePaymentMethodGroupRels(
		long groupId, long commerceCountryId, boolean active)
		throws RemoteException {
		try {
			java.util.List<com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel> returnValue =
				CommercePaymentMethodGroupRelServiceUtil.getCommercePaymentMethodGroupRels(groupId,
					commerceCountryId, active);

			return com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getCommercePaymentMethodGroupRelsCount(long groupId,
		boolean active) throws RemoteException {
		try {
			int returnValue = CommercePaymentMethodGroupRelServiceUtil.getCommercePaymentMethodGroupRelsCount(groupId,
					active);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap setActive(
		long commercePaymentMethodGroupRelId, boolean active)
		throws RemoteException {
		try {
			com.liferay.commerce.payment.model.CommercePaymentMethodGroupRel returnValue =
				CommercePaymentMethodGroupRelServiceUtil.setActive(commercePaymentMethodGroupRelId,
					active);

			return com.liferay.commerce.payment.model.CommercePaymentMethodGroupRelSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(CommercePaymentMethodGroupRelServiceSoap.class);
}