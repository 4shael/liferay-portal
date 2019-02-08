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

package com.liferay.headless.form.dto.v1_0;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "Validation")
public class Validation {

	public String getErrorMessage() {
		return _errorMessage;
	}

	public String getExpression() {
		return _expression;
	}

	public Long getId() {
		return _id;
	}

	public String getSelf() {
		return _self;
	}

	public void setErrorMessage(String errorMessage) {
		_errorMessage = errorMessage;
	}

	public void setExpression(String expression) {
		_expression = expression;
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setSelf(String self) {
		_self = self;
	}

	private String _errorMessage;
	private String _expression;
	private Long _id;
	private String _self;

}