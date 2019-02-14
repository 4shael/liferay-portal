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

package com.liferay.headless.document.library.dto.v1_0;

import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "AdaptedMedia")
public class AdaptedMedia {

	public String getContentUrl() {
		return _contentUrl;
	}

	public Number getHeight() {
		return _height;
	}

	public Long getId() {
		return _id;
	}

	public String getResolutionName() {
		return _resolutionName;
	}

	public Number getSizeInBytes() {
		return _sizeInBytes;
	}

	public Number getWidth() {
		return _width;
	}

	public void setContentUrl(String contentUrl) {
		_contentUrl = contentUrl;
	}

	public void setContentUrl(Supplier<String> contentUrlSupplier) {
		_contentUrl = contentUrlSupplier.get();
	}

	public void setHeight(Number height) {
		_height = height;
	}

	public void setHeight(Supplier<Number> heightSupplier) {
		_height = heightSupplier.get();
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setId(Supplier<Long> idSupplier) {
		_id = idSupplier.get();
	}

	public void setResolutionName(String resolutionName) {
		_resolutionName = resolutionName;
	}

	public void setResolutionName(Supplier<String> resolutionNameSupplier) {
		_resolutionName = resolutionNameSupplier.get();
	}

	public void setSizeInBytes(Number sizeInBytes) {
		_sizeInBytes = sizeInBytes;
	}

	public void setSizeInBytes(Supplier<Number> sizeInBytesSupplier) {
		_sizeInBytes = sizeInBytesSupplier.get();
	}

	public void setWidth(Number width) {
		_width = width;
	}

	public void setWidth(Supplier<Number> widthSupplier) {
		_width = widthSupplier.get();
	}

	private String _contentUrl;
	private Number _height;
	private Long _id;
	private String _resolutionName;
	private Number _sizeInBytes;
	private Number _width;

}