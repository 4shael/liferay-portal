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

package com.liferay.headless.collaboration.dto.v1_0;

import java.util.function.Supplier;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@XmlRootElement(name = "Comment")
public class Comment {

	public Comment[] getComments() {
		return _comments;
	}

	public Creator getCreator() {
		return _creator;
	}

	public Long getId() {
		return _id;
	}

	public String getText() {
		return _text;
	}

	public void setComments(Comment[] comments) {
		_comments = comments;
	}

	public void setComments(Supplier<Comment[]> commentsSupplier) {
		_comments = commentsSupplier.get();
	}

	public void setCreator(Creator creator) {
		_creator = creator;
	}

	public void setCreator(Supplier<Creator> creatorSupplier) {
		_creator = creatorSupplier.get();
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setId(Supplier<Long> idSupplier) {
		_id = idSupplier.get();
	}

	public void setText(String text) {
		_text = text;
	}

	public void setText(Supplier<String> textSupplier) {
		_text = textSupplier.get();
	}

	private Comment[] _comments;
	private Creator _creator;
	private Long _id;
	private String _text;

}