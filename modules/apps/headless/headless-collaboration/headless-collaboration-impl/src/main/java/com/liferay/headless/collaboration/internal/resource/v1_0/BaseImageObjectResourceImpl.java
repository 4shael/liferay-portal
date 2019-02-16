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

package com.liferay.headless.collaboration.internal.resource.v1_0;

import com.liferay.headless.collaboration.dto.v1_0.ImageObject;
import com.liferay.headless.collaboration.internal.dto.v1_0.ImageObjectImpl;
import com.liferay.headless.collaboration.resource.v1_0.ImageObjectResource;
import com.liferay.oauth2.provider.scope.RequiresScope;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.util.TransformUtil;

import java.util.Collections;
import java.util.List;

import javax.annotation.Generated;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@Path("/v1.0")
public abstract class BaseImageObjectResourceImpl implements ImageObjectResource {

	@GET
	@Path("/image-object-repositories/{image-object-repository-id}/image-objects")
	@Produces("application/json")
	@RequiresScope("everything.read")
	@Override
	public Page<ImageObject> getImageObjectRepositoryImageObjectsPage( @PathParam("image-object-repository-id") Long imageObjectRepositoryId , @Context Pagination pagination ) throws Exception {
			return Page.of(Collections.emptyList());

	}
	@Consumes("application/json")
	@POST
	@Path("/image-object-repositories/{image-object-repository-id}/image-objects")
	@Produces("application/json")
	@RequiresScope("everything.read")
	@Override
	public ImageObject postImageObjectRepositoryImageObject( @PathParam("image-object-repository-id") Long imageObjectRepositoryId , ImageObject imageObject ) throws Exception {
			return new ImageObjectImpl();

	}
	@Consumes("application/json")
	@POST
	@Path("/image-object-repositories/{image-object-repository-id}/image-objects/batch-create")
	@Produces("application/json")
	@RequiresScope("everything.write")
	@Override
	public ImageObject postImageObjectRepositoryImageObjectBatchCreate( @PathParam("image-object-repository-id") Long imageObjectRepositoryId , ImageObject imageObject ) throws Exception {
			return new ImageObjectImpl();

	}
	@DELETE
	@Path("/image-objects/{image-object-id}")
	@Produces("application/json")
	@RequiresScope("everything.read")
	@Override
	public boolean deleteImageObject( @PathParam("image-object-id") Long imageObjectId ) throws Exception {
			return false;

	}
	@GET
	@Path("/image-objects/{image-object-id}")
	@Produces("application/json")
	@RequiresScope("everything.read")
	@Override
	public ImageObject getImageObject( @PathParam("image-object-id") Long imageObjectId ) throws Exception {
			return new ImageObjectImpl();

	}

	protected <T, R> List<R> transform(List<T> list, UnsafeFunction<T, R, Throwable> unsafeFunction) {
		return TransformUtil.transform(list, unsafeFunction);
	}

	@Context
	protected AcceptLanguage acceptLanguage;

	@Context
	protected Company company;

}