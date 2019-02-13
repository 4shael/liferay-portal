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

package com.liferay.headless.workflow.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.liferay.headless.workflow.dto.v1_0.WorkflowTask;
import com.liferay.portal.vulcan.pagination.Pagination;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSender;

import java.net.URL;

import javax.annotation.Generated;

import org.jboss.arquillian.test.api.ArquillianResource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseWorkflowTaskResourceTestCase {

	@BeforeClass
	public static void setUpClass() {
		RestAssured.defaultParser = Parser.JSON;
	}

	@Before
	public void setUp() throws Exception {
		_resourceURL = new URL(
			_url.toExternalForm() + "/o/headless-workflow/v1.0");
	}

	@Test
	public void testGetRolesWorkflowTasksPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetWorkflowTasks() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testGetWorkflowTasksPage() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostWorkflowTasksAssignToMe() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostWorkflowTasksAssignToUser() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostWorkflowTasksChangeTransition() throws Exception {
		Assert.assertTrue(true);
	}

	@Test
	public void testPostWorkflowTasksUpdateDueDate() throws Exception {
		Assert.assertTrue(true);
	}

	protected void invokeGetRolesWorkflowTasksPage(
			Long roleId, Pagination pagination)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/roles/{role-id}/workflow-tasks");
	}

	protected void invokeGetWorkflowTasks(Long workflowTaskId)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/workflow-tasks/{workflow-task-id}");
	}

	protected void invokeGetWorkflowTasksPage(
			Object genericParentId, Pagination pagination)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post("/workflow-tasks");
	}

	protected void invokePostWorkflowTasksAssignToMe(
			Long workflowTaskId, WorkflowTask workflowTask)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/workflow-tasks/{workflow-task-id}/assign-to-me");
	}

	protected void invokePostWorkflowTasksAssignToUser(
			Long workflowTaskId, WorkflowTask workflowTask)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/workflow-tasks/{workflow-task-id}/assign-to-user");
	}

	protected void invokePostWorkflowTasksChangeTransition(
			Long workflowTaskId, WorkflowTask workflowTask)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/workflow-tasks/{workflow-task-id}/change-transition");
	}

	protected void invokePostWorkflowTasksUpdateDueDate(
			Long workflowTaskId, WorkflowTask workflowTask)
		throws Exception {

			RequestSender requestSender = _createRequestSender();

			requestSender.post(
				"/workflow-tasks/{workflow-task-id}/update-due-date");
	}

	private RequestSender _createRequestSender() {
		return RestAssured.given(
		).auth(
		).preemptive(
		).basic(
			"test@liferay.com", "test"
		).header(
			"Accept", "application/json"
		).header(
			"Content-Type", "application/json"
		).when();
	}

	private static final ObjectMapper _inputObjectMapper = new ObjectMapper() {
		{
			setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
	};
	private static final ObjectMapper _outputObjectMapper = new ObjectMapper();

	private URL _resourceURL;

	@ArquillianResource
	private URL _url;

}