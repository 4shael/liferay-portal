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

package com.liferay.headless.document.library.internal.graphql.mutation.v1_0;

import com.liferay.headless.document.library.dto.v1_0.Document;
import com.liferay.headless.document.library.dto.v1_0.Folder;
import com.liferay.headless.document.library.resource.v1_0.DocumentResource;
import com.liferay.headless.document.library.resource.v1_0.FolderResource;
import com.liferay.portal.vulcan.multipart.MultipartBody;

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
	public boolean deleteDocument( @GraphQLName("document-id") Long documentId ) throws Exception {
return _getDocumentResource().deleteDocument( documentId );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public boolean postDocumentCategories( @GraphQLName("document-id") Long documentId , @GraphQLName("Long") Long referenceId ) throws Exception {
return _getDocumentResource().postDocumentCategories( documentId , referenceId );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public boolean postDocumentCategoriesBatchCreate( @GraphQLName("document-id") Long documentId , @GraphQLName("Long") Long referenceId ) throws Exception {
return _getDocumentResource().postDocumentCategoriesBatchCreate( documentId , referenceId );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Document postDocumentsRepositoryDocument( @GraphQLName("documents-repository-id") Long documentsRepositoryId , @GraphQLName("Document") Document document ) throws Exception {
return _getDocumentResource().postDocumentsRepositoryDocument( documentsRepositoryId , document );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Document postDocumentsRepositoryDocumentBatchCreate( @GraphQLName("documents-repository-id") Long documentsRepositoryId , @GraphQLName("Document") Document document ) throws Exception {
return _getDocumentResource().postDocumentsRepositoryDocumentBatchCreate( documentsRepositoryId , document );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Document postFolderDocument( @GraphQLName("folder-id") Long folderId , @GraphQLName("MultipartBody") MultipartBody multipartBody ) throws Exception {
return _getDocumentResource().postFolderDocument( folderId , multipartBody );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Document postFolderDocumentBatchCreate( @GraphQLName("folder-id") Long folderId , @GraphQLName("MultipartBody") MultipartBody multipartBody ) throws Exception {
return _getDocumentResource().postFolderDocumentBatchCreate( folderId , multipartBody );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Folder postDocumentsRepositoryFolder( @GraphQLName("documents-repository-id") Long documentsRepositoryId , @GraphQLName("Folder") Folder folder ) throws Exception {
return _getFolderResource().postDocumentsRepositoryFolder( documentsRepositoryId , folder );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Folder postDocumentsRepositoryFolderBatchCreate( @GraphQLName("documents-repository-id") Long documentsRepositoryId , @GraphQLName("Folder") Folder folder ) throws Exception {
return _getFolderResource().postDocumentsRepositoryFolderBatchCreate( documentsRepositoryId , folder );
	}

	@GraphQLInvokeDetached
	public boolean deleteFolder( @GraphQLName("folder-id") Long folderId ) throws Exception {
return _getFolderResource().deleteFolder( folderId );
	}

	@GraphQLInvokeDetached
	public Folder putFolder( @GraphQLName("folder-id") Long folderId , @GraphQLName("Folder") Folder folder ) throws Exception {
return _getFolderResource().putFolder( folderId , folder );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Folder postFolderFolder( @GraphQLName("folder-id") Long folderId , @GraphQLName("Folder") Folder folder ) throws Exception {
return _getFolderResource().postFolderFolder( folderId , folder );
	}

	@GraphQLField
	@GraphQLInvokeDetached
	public Folder postFolderFolderBatchCreate( @GraphQLName("folder-id") Long folderId , @GraphQLName("Folder") Folder folder ) throws Exception {
return _getFolderResource().postFolderFolderBatchCreate( folderId , folder );
	}

	private static DocumentResource _getDocumentResource() {
			return _documentResourceServiceTracker.getService();
	}

	private static final ServiceTracker<DocumentResource, DocumentResource> _documentResourceServiceTracker;
	private static FolderResource _getFolderResource() {
			return _folderResourceServiceTracker.getService();
	}

	private static final ServiceTracker<FolderResource, FolderResource> _folderResourceServiceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(Mutation.class);

			ServiceTracker<DocumentResource, DocumentResource> documentResourceServiceTracker =
				new ServiceTracker<>(bundle.getBundleContext(), DocumentResource.class, null);

			documentResourceServiceTracker.open();

			_documentResourceServiceTracker = documentResourceServiceTracker;
			ServiceTracker<FolderResource, FolderResource> folderResourceServiceTracker =
				new ServiceTracker<>(bundle.getBundleContext(), FolderResource.class, null);

			folderResourceServiceTracker.open();

			_folderResourceServiceTracker = folderResourceServiceTracker;
	}

}