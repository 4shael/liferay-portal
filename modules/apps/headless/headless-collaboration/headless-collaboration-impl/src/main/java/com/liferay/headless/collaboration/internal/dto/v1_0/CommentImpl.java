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

package com.liferay.headless.collaboration.internal.dto.v1_0;

import com.liferay.headless.collaboration.dto.v1_0.*;
import com.liferay.petra.function.UnsafeSupplier;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("Comment")
@XmlRootElement(name = "Comment")
public class CommentImpl implements Comment {

	public Comment[] getComments() {
			return comments;
	}

	public void setComments(Comment[] comments) {
			this.comments = comments;
	}

	public void setComments(UnsafeSupplier<Comment[], Throwable> commentsUnsafeSupplier) {
			try {
				comments = commentsUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected Comment[] comments;
	public Creator getCreator() {
			return creator;
	}

	public void setCreator(Creator creator) {
			this.creator = creator;
	}

	public void setCreator(UnsafeSupplier<Creator, Throwable> creatorUnsafeSupplier) {
			try {
				creator = creatorUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected Creator creator;
	public Long getId() {
			return id;
	}

	public void setId(Long id) {
			this.id = id;
	}

	public void setId(UnsafeSupplier<Long, Throwable> idUnsafeSupplier) {
			try {
				id = idUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected Long id;
	public String getText() {
			return text;
	}

	public void setText(String text) {
			this.text = text;
	}

	public void setText(UnsafeSupplier<String, Throwable> textUnsafeSupplier) {
			try {
				text = textUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected String text;

}