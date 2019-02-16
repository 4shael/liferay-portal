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

package com.liferay.headless.web.experience.internal.dto.v1_0;

import com.liferay.headless.web.experience.dto.v1_0.*;
import com.liferay.petra.function.UnsafeSupplier;

import graphql.annotations.annotationTypes.GraphQLField;
import graphql.annotations.annotationTypes.GraphQLName;

import java.util.Date;

import javax.annotation.Generated;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
@GraphQLName("ContentStructure")
@XmlRootElement(name = "ContentStructure")
public class ContentStructureImpl implements ContentStructure {

	public String[] getAvailableLanguages() {
			return availableLanguages;
	}

	public void setAvailableLanguages(String[] availableLanguages) {
			this.availableLanguages = availableLanguages;
	}

	public void setAvailableLanguages(UnsafeSupplier<String[], Throwable> availableLanguagesUnsafeSupplier) {
			try {
				availableLanguages = availableLanguagesUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected String[] availableLanguages;
	public Long getContentSpace() {
			return contentSpace;
	}

	public void setContentSpace(Long contentSpace) {
			this.contentSpace = contentSpace;
	}

	public void setContentSpace(UnsafeSupplier<Long, Throwable> contentSpaceUnsafeSupplier) {
			try {
				contentSpace = contentSpaceUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected Long contentSpace;
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
	public Date getDateCreated() {
			return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
			this.dateCreated = dateCreated;
	}

	public void setDateCreated(UnsafeSupplier<Date, Throwable> dateCreatedUnsafeSupplier) {
			try {
				dateCreated = dateCreatedUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected Date dateCreated;
	public Date getDateModified() {
			return dateModified;
	}

	public void setDateModified(Date dateModified) {
			this.dateModified = dateModified;
	}

	public void setDateModified(UnsafeSupplier<Date, Throwable> dateModifiedUnsafeSupplier) {
			try {
				dateModified = dateModifiedUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected Date dateModified;
	public String getDescription() {
			return description;
	}

	public void setDescription(String description) {
			this.description = description;
	}

	public void setDescription(UnsafeSupplier<String, Throwable> descriptionUnsafeSupplier) {
			try {
				description = descriptionUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected String description;
	public Fields[] getFields() {
			return fields;
	}

	public void setFields(Fields[] fields) {
			this.fields = fields;
	}

	public void setFields(UnsafeSupplier<Fields[], Throwable> fieldsUnsafeSupplier) {
			try {
				fields = fieldsUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected Fields[] fields;
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
	public String getName() {
			return name;
	}

	public void setName(String name) {
			this.name = name;
	}

	public void setName(UnsafeSupplier<String, Throwable> nameUnsafeSupplier) {
			try {
				name = nameUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected String name;

}