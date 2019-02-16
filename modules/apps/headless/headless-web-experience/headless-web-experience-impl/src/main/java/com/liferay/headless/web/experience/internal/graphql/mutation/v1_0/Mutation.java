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

package com.liferay.headless.web.experience.internal.graphql.mutation.v1_0;

import com.liferay.headless.web.experience.dto.v1_0.StructuredContent;
import com.liferay.headless.web.experience.resource.v1_0.ContentDocumentResource;
import com.liferay.headless.web.experience.resource.v1_0.StructuredContentResource;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLInvokeDetached;
import graphql.annotations.annotationTypes.GraphQLName;

import javax.annotation.Generated;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class Mutation {

	@GraphQLInvokeDetached
	public boolean deleteContentDocument( @GraphQLName("content-document-id") Long contentDocumentId ) throws Exception {
return _getContentDocumentResource().deleteContentDocument( contentDocumentId );
	}

	@GraphQLInvokeDetached
	public StructuredContent patchContentSpaceStructuredContents( @GraphQLName("content-space-id") Long contentSpaceId , @GraphQLName("StructuredContent") StructuredContent structuredContent ) throws Exception {
return _getStructuredContentResource().patchContentSpaceStructuredContents( contentSpaceId , structuredContent );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public StructuredContent postContentSpaceStructuredContent( @GraphQLName("content-space-id") Long contentSpaceId , @GraphQLName("StructuredContent") StructuredContent structuredContent ) throws Exception {
return _getStructuredContentResource().postContentSpaceStructuredContent( contentSpaceId , structuredContent );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public StructuredContent postContentSpaceStructuredContentBatchCreate( @GraphQLName("content-space-id") Long contentSpaceId , @GraphQLName("StructuredContent") StructuredContent structuredContent ) throws Exception {
return _getStructuredContentResource().postContentSpaceStructuredContentBatchCreate( contentSpaceId , structuredContent );
	}

	@GraphQLInvokeDetached
	public boolean deleteStructuredContent( @GraphQLName("structured-content-id") Long structuredContentId ) throws Exception {
return _getStructuredContentResource().deleteStructuredContent( structuredContentId );
	}

	@GraphQLInvokeDetached
	public StructuredContent putStructuredContent( @GraphQLName("structured-content-id") Long structuredContentId , @GraphQLName("StructuredContent") StructuredContent structuredContent ) throws Exception {
return _getStructuredContentResource().putStructuredContent( structuredContentId , structuredContent );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public boolean postStructuredContentCategories( @GraphQLName("structured-content-id") Long structuredContentId , @GraphQLName("Long") Long referenceId ) throws Exception {
return _getStructuredContentResource().postStructuredContentCategories( structuredContentId , referenceId );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public boolean postStructuredContentCategoriesBatchCreate( @GraphQLName("structured-content-id") Long structuredContentId , @GraphQLName("Long") Long referenceId ) throws Exception {
return _getStructuredContentResource().postStructuredContentCategoriesBatchCreate( structuredContentId , referenceId );
	}

	private static ContentDocumentResource _getContentDocumentResource() {
			return _contentDocumentResourceServiceTracker.getService();
	}

	private static final ServiceTracker<ContentDocumentResource, ContentDocumentResource> _contentDocumentResourceServiceTracker;
	private static StructuredContentResource _getStructuredContentResource() {
			return _structuredContentResourceServiceTracker.getService();
	}

	private static final ServiceTracker<StructuredContentResource, StructuredContentResource> _structuredContentResourceServiceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(Mutation.class);

			ServiceTracker<ContentDocumentResource, ContentDocumentResource> contentDocumentResourceServiceTracker =
				new ServiceTracker<>(bundle.getBundleContext(), ContentDocumentResource.class, null);

			contentDocumentResourceServiceTracker.open();

			_contentDocumentResourceServiceTracker = contentDocumentResourceServiceTracker;
			ServiceTracker<StructuredContentResource, StructuredContentResource> structuredContentResourceServiceTracker =
				new ServiceTracker<>(bundle.getBundleContext(), StructuredContentResource.class, null);

			structuredContentResourceServiceTracker.open();

			_structuredContentResourceServiceTracker = structuredContentResourceServiceTracker;
	}

}