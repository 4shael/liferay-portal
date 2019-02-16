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

package com.liferay.headless.document.library.internal.dto.v1_0;

import com.liferay.headless.document.library.dto.v1_0.*;
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
@GraphQLName("Document")
@XmlRootElement(name = "Document")
public class DocumentImpl implements Document {

	public AdaptedMedia[] getAdaptedMedia() {
			return adaptedMedia;
	}

	public void setAdaptedMedia(AdaptedMedia[] adaptedMedia) {
			this.adaptedMedia = adaptedMedia;
	}

	public void setAdaptedMedia(UnsafeSupplier<AdaptedMedia[], Throwable> adaptedMediaUnsafeSupplier) {
			try {
				adaptedMedia = adaptedMediaUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected AdaptedMedia[] adaptedMedia;
	public Long[] getCategory() {
			return category;
	}

	public void setCategory(Long[] category) {
			this.category = category;
	}

	public void setCategory(UnsafeSupplier<Long[], Throwable> categoryUnsafeSupplier) {
			try {
				category = categoryUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected Long[] category;
	public String getContentUrl() {
			return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
			this.contentUrl = contentUrl;
	}

	public void setContentUrl(UnsafeSupplier<String, Throwable> contentUrlUnsafeSupplier) {
			try {
				contentUrl = contentUrlUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected String contentUrl;
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
	public String getEncodingFormat() {
			return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat) {
			this.encodingFormat = encodingFormat;
	}

	public void setEncodingFormat(UnsafeSupplier<String, Throwable> encodingFormatUnsafeSupplier) {
			try {
				encodingFormat = encodingFormatUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected String encodingFormat;
	public String getFileExtension() {
			return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
			this.fileExtension = fileExtension;
	}

	public void setFileExtension(UnsafeSupplier<String, Throwable> fileExtensionUnsafeSupplier) {
			try {
				fileExtension = fileExtensionUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected String fileExtension;
	public Long getFolderId() {
			return folderId;
	}

	public void setFolderId(Long folderId) {
			this.folderId = folderId;
	}

	public void setFolderId(UnsafeSupplier<Long, Throwable> folderIdUnsafeSupplier) {
			try {
				folderId = folderIdUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected Long folderId;
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
	public String[] getKeywords() {
			return keywords;
	}

	public void setKeywords(String[] keywords) {
			this.keywords = keywords;
	}

	public void setKeywords(UnsafeSupplier<String[], Throwable> keywordsUnsafeSupplier) {
			try {
				keywords = keywordsUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected String[] keywords;
	public Number getSizeInBytes() {
			return sizeInBytes;
	}

	public void setSizeInBytes(Number sizeInBytes) {
			this.sizeInBytes = sizeInBytes;
	}

	public void setSizeInBytes(UnsafeSupplier<Number, Throwable> sizeInBytesUnsafeSupplier) {
			try {
				sizeInBytes = sizeInBytesUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected Number sizeInBytes;
	public String getTitle() {
			return title;
	}

	public void setTitle(String title) {
			this.title = title;
	}

	public void setTitle(UnsafeSupplier<String, Throwable> titleUnsafeSupplier) {
			try {
				title = titleUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	protected String title;

}