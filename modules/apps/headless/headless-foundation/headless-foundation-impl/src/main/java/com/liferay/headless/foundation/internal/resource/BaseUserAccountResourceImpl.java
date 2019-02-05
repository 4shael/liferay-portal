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

package com.liferay.headless.foundation.internal.resource;

import com.liferay.headless.foundation.dto.UserAccount;
import com.liferay.headless.foundation.resource.UserAccountResource;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.vulcan.context.Pagination;
import com.liferay.portal.vulcan.dto.Page;
import com.liferay.portal.vulcan.util.TransformUtil;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import javax.annotation.Generated;

import javax.ws.rs.core.Response;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseUserAccountResourceImpl
	implements UserAccountResource {

	@Override
	public Response deleteUserAccount(Long userAccountId, Company company)
		throws Exception {

		Response.ResponseBuilder responseBuilder = Response.ok();

		return responseBuilder.build();
	}

	@Override
	public UserAccount getMyUserAccount(Long myUserAccountId, Company company)
		throws Exception {

		return new UserAccount();
	}

	@Override
	public Page<UserAccount> getMyUserAccountPage(
			Company company, Pagination pagination)
		throws Exception {

		return new Page<>(Collections.emptyList(), 0);
	}

	@Override
	public Page<UserAccount> getOrganizationUserAccountPage(
			Long organizationId, Company company, Pagination pagination)
		throws Exception {

		return new Page<>(Collections.emptyList(), 0);
	}

	@Override
	public UserAccount getUserAccount(Long userAccountId, Company company)
		throws Exception {

		return new UserAccount();
	}

	@Override
	public Page<UserAccount> getUserAccountPage(
			String fullnamequery, Company company, Pagination pagination)
		throws Exception {

		return new Page<>(Collections.emptyList(), 0);
	}

	@Override
	public Page<UserAccount> getWebSiteUserAccountPage(
			Long webSiteId, Company company, Pagination pagination)
		throws Exception {

		return new Page<>(Collections.emptyList(), 0);
	}

	@Override
	public UserAccount postUserAccount(Company company) throws Exception {
		return new UserAccount();
	}

	@Override
	public UserAccount postUserAccountBatchCreate(Company company)
		throws Exception {

		return new UserAccount();
	}

	@Override
	public UserAccount putUserAccount(Long userAccountId, Company company)
		throws Exception {

		return new UserAccount();
	}

	protected <T, R> List<R> transform(
		List<T> list, Function<T, R> transformFunction) {

		return TransformUtil.transform(list, transformFunction);
	}

}