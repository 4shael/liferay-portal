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

import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "WebUrl")
public class WebUrl {

	public Long getId() {
		return _id;
	}

	public String getUrl() {
		return _url;
	}

	public String getUrlType() {
		return _urlType;
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setId(Supplier<Long> idSupplier) {
		_id = idSupplier.get();
	}

	public void setUrl(String url) {
		_url = url;
	}

	public void setUrl(Supplier<String> urlSupplier) {
		_url = urlSupplier.get();
	}

	public void setUrlType(String urlType) {
		_urlType = urlType;
	}

	public void setUrlType(Supplier<String> urlTypeSupplier) {
		_urlType = urlTypeSupplier.get();
	}

	private Long _id;
	private String _url;
	private String _urlType;

}