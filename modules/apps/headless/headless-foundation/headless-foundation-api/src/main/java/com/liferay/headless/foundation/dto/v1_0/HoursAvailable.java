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

package com.liferay.headless.foundation.dto.v1_0;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "HoursAvailable")
public class HoursAvailable {

	public String getCloses() {
		return _closes;
	}

	public String getDayOfWeek() {
		return _dayOfWeek;
	}

	public Long getId() {
		return _id;
	}

	public String getOpens() {
		return _opens;
	}

	public String getSelf() {
		return _self;
	}

	public void setCloses(String closes) {
		_closes = closes;
	}

	public void setDayOfWeek(String dayOfWeek) {
		_dayOfWeek = dayOfWeek;
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setOpens(String opens) {
		_opens = opens;
	}

	public void setSelf(String self) {
		_self = self;
	}

	private String _closes;
	private String _dayOfWeek;
	private Long _id;
	private String _opens;
	private String _self;

}