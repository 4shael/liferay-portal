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

package com.liferay.headless.document.library.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.liferay.headless.document.library.dto.v1_0.Document;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.vulcan.multipart.MultipartBody;
import com.liferay.portal.vulcan.pagination.Pagination;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.net.URL;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseDocumentResourceTestCase {

	@BeforeClass
	public static void setUpClass() {
		RestAssured.defaultParser = Parser.JSON;
	}

	@Before
	public void setUp() throws Exception {
		testGroup = GroupTestUtil.addGroup();

		_resourceURL = new URL(
			"http://localhost:8080/o/headless-document-library/v1.0");
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testDeleteDocument() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetDocument() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetDocumentCategoriesPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetDocumentsRepositoryDocumentsPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetFolderDocumentsPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostDocumentCategories() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostDocumentCategoriesBatchCreate() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostDocumentsRepositoryDocument() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostDocumentsRepositoryDocumentBatchCreate()
		throws Exception {

			Assert.assertTrue(true);
	}

	@Test
	public void testPostFolderDocument() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostFolderDocumentBatchCreate() throws Exception {
		Assert.assertTrue(true);
	}

	protected Response invokeDeleteDocument(Long documentId) throws Exception {
		RequestSpecification requestSpecification =
			_createRequestSpecification();

			return requestSpecification.when(
			).delete(
				_resourceURL + "/documents/{document-id}", documentId
			);
	}

	protected Response invokeGetDocument(Long documentId) throws Exception {
		RequestSpecification requestSpecification =
			_createRequestSpecification();

			return requestSpecification.when(
			).get(
				_resourceURL + "/documents/{document-id}", documentId
			);
	}

	protected Response invokeGetDocumentCategoriesPage(
			Long documentId, Pagination pagination)
		throws Exception {

		RequestSpecification requestSpecification =
			_createRequestSpecification();

			return requestSpecification.when(
			).get(
				_resourceURL + "/documents/{document-id}/categories", documentId
			);
	}

	protected Response invokeGetDocumentsRepositoryDocumentsPage(
			Long documentsRepositoryId, Pagination pagination)
		throws Exception {

		RequestSpecification requestSpecification =
			_createRequestSpecification();

			return requestSpecification.when(
			).get(
				_resourceURL + "/documents-repositories/{documents-repository-id}/documents",
				documentsRepositoryId
			);
	}

	protected Response invokeGetFolderDocumentsPage(
			Long folderId, Pagination pagination)
		throws Exception {

		RequestSpecification requestSpecification =
			_createRequestSpecification();

			return requestSpecification.when(
			).get(
				_resourceURL + "/folders/{folder-id}/documents", folderId
			);
	}

	protected Response invokePostDocumentCategories(
			Long documentId, Long referenceId)
		throws Exception {

		RequestSpecification requestSpecification =
			_createRequestSpecification();

			return requestSpecification.when(
			).post(
				_resourceURL + "/documents/{document-id}/categories",
				documentId, referenceId
			);
	}

	protected Response invokePostDocumentCategoriesBatchCreate(
			Long documentId, Long referenceId)
		throws Exception {

		RequestSpecification requestSpecification =
			_createRequestSpecification();

			return requestSpecification.when(
			).post(
				_resourceURL + "/documents/{document-id}/categories/batch-create",
				documentId, referenceId
			);
	}

	protected Response invokePostDocumentsRepositoryDocument(
			Long documentsRepositoryId, Document document)
		throws Exception {

		RequestSpecification requestSpecification =
			_createRequestSpecification();

			return requestSpecification.body(
				document
			).when(
			).post(
				_resourceURL + "/documents-repositories/{documents-repository-id}/documents",
				documentsRepositoryId
			);
	}

	protected Response invokePostDocumentsRepositoryDocumentBatchCreate(
			Long documentsRepositoryId, Document document)
		throws Exception {

		RequestSpecification requestSpecification =
			_createRequestSpecification();

			return requestSpecification.body(
				document
			).when(
			).post(
				_resourceURL + "/documents-repositories/{documents-repository-id}/documents/batch-create",
				documentsRepositoryId
			);
	}

	protected Response invokePostFolderDocument(
			Long folderId, MultipartBody multipartBody)
		throws Exception {

		RequestSpecification requestSpecification =
			_createRequestSpecification();

			return requestSpecification.when(
			).post(
				_resourceURL + "/folders/{folder-id}/documents", folderId,
				multipartBody
			);
	}

	protected Response invokePostFolderDocumentBatchCreate(
			Long folderId, MultipartBody multipartBody)
		throws Exception {

		RequestSpecification requestSpecification =
			_createRequestSpecification();

			return requestSpecification.when(
			).post(
				_resourceURL + "/folders/{folder-id}/documents/batch-create",
				folderId, multipartBody
			);
	}

	protected Document randomDocument() {
		Document document = new Document();

document.setContentUrl(RandomTestUtil.randomString());
document.setDateCreated(RandomTestUtil.nextDate());
document.setDateModified(RandomTestUtil.nextDate());
document.setDescription(RandomTestUtil.randomString());
document.setEncodingFormat(RandomTestUtil.randomString());
document.setFileExtension(RandomTestUtil.randomString());
document.setFolderId(RandomTestUtil.randomLong());
document.setId(RandomTestUtil.randomLong());
document.setTitle(RandomTestUtil.randomString());
		return document;
	}

	protected Group testGroup;

	private RequestSpecification _createRequestSpecification() {
		return RestAssured.given(
		).auth(
		).preemptive(
		).basic(
			"test@liferay.com", "test"
		).header(
			"Accept", "application/json"
		).header(
			"Content-Type", "application/json"
		);
	}

	private static final ObjectMapper _inputObjectMapper = new ObjectMapper() {
		{
			setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
	};
	private static final ObjectMapper _outputObjectMapper = new ObjectMapper();

	private URL _resourceURL;

}