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

package com.liferay.headless.collaboration.internal.resource;

import com.liferay.headless.collaboration.dto.BlogPosting;
import com.liferay.headless.collaboration.resource.BlogPostingResource;
import com.liferay.portal.vulcan.context.Pagination;
import com.liferay.portal.vulcan.dto.Page;

import java.util.Collections;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseBlogPostingResourceImpl
	implements BlogPostingResource {

	@Override
	public BlogPosting getBlogPosting(Long id) throws Exception {
		return new BlogPosting();
	}

	@Override
	public Page<BlogPosting> getContentSpaceBlogPostingPage(
			Long parentId, Pagination pagination)
		throws Exception {

		return new Page(Collections.emptyList(), 0);
	}

	@Override
	public BlogPosting postContentSpaceBlogPosting(Long parentId)
		throws Exception {

		return new BlogPosting();
	}

	@Override
	public BlogPosting postContentSpaceBlogPostingBatchCreate(Long parentId)
		throws Exception {

		return new BlogPosting();
	}

	@Override
	public BlogPosting putBlogPosting(Long id) throws Exception {
		return new BlogPosting();
	}

}