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

package com.liferay.headless.web.experience.resource;

import com.liferay.headless.web.experience.dto.AggregateRating;
import com.liferay.headless.web.experience.dto.AggregateRatingCollection;
import com.liferay.oauth2.provider.scope.RequiresScope;
import com.liferay.portal.vulcan.context.Pagination;

import javax.annotation.Generated;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

/**
 * To access this resource, run:
 *
 *     curl -u your@email.com:yourpassword -D - http://localhost:8080/o/headless-web-experience/1.0.0/aggregate-rating
 *
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@Path("/1.0.0/aggregate-rating")
public interface AggregateRatingResource {

	@GET
	@Produces("application/json")
	@RequiresScope("headless-web-experience-application.read")
	public AggregateRatingCollection<AggregateRating> getAggregateRatingCollection(
			@Context Pagination pagination, @QueryParam("size") String size)
		throws Exception;

}