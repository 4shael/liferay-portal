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

import com.liferay.petra.function.UnsafeSupplier;

import java.util.Date;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public interface BlogPosting {

	public AggregateRating getAggregateRating();

	public String getAlternativeHeadline();

	public String getArticleBody();

	public String getCaption();

	public Long[] getCategory();

	public Comment[] getComment();

	public Long getContentSpace();

	public Creator getCreator();

	public Date getDateCreated();

	public Date getDateModified();

	public Date getDatePublished();

	public String getDescription();

	public String getEncodingFormat();

	public String getFriendlyUrlPath();

	public String getHeadline();

	public Long getId();

	public ImageObject getImage();

	public Long getImageId();

	public String[] getKeywords();

	public ImageObjectRepository getRepository();

	public Long getRepositoryId();

	public void setAggregateRating(AggregateRating aggregateRating);

	public void setAggregateRating(
		UnsafeSupplier<AggregateRating, Throwable>
			aggregateRatingUnsafeSupplier);

	public void setAlternativeHeadline(String alternativeHeadline);

	public void setAlternativeHeadline(
		UnsafeSupplier<String, Throwable> alternativeHeadlineUnsafeSupplier);

	public void setArticleBody(String articleBody);

	public void setArticleBody(
		UnsafeSupplier<String, Throwable> articleBodyUnsafeSupplier);

	public void setCaption(String caption);

	public void setCaption(
		UnsafeSupplier<String, Throwable> captionUnsafeSupplier);

	public void setCategory(Long[] category);

	public void setCategory(
		UnsafeSupplier<Long[], Throwable> categoryUnsafeSupplier);

	public void setComment(Comment[] comment);

	public void setComment(
		UnsafeSupplier<Comment[], Throwable> commentUnsafeSupplier);

	public void setContentSpace(Long contentSpace);

	public void setContentSpace(
		UnsafeSupplier<Long, Throwable> contentSpaceUnsafeSupplier);

	public void setCreator(Creator creator);

	public void setCreator(
		UnsafeSupplier<Creator, Throwable> creatorUnsafeSupplier);

	public void setDateCreated(Date dateCreated);

	public void setDateCreated(
		UnsafeSupplier<Date, Throwable> dateCreatedUnsafeSupplier);

	public void setDateModified(Date dateModified);

	public void setDateModified(
		UnsafeSupplier<Date, Throwable> dateModifiedUnsafeSupplier);

	public void setDatePublished(Date datePublished);

	public void setDatePublished(
		UnsafeSupplier<Date, Throwable> datePublishedUnsafeSupplier);

	public void setDescription(String description);

	public void setDescription(
		UnsafeSupplier<String, Throwable> descriptionUnsafeSupplier);

	public void setEncodingFormat(String encodingFormat);

	public void setEncodingFormat(
		UnsafeSupplier<String, Throwable> encodingFormatUnsafeSupplier);

	public void setFriendlyUrlPath(String friendlyUrlPath);

	public void setFriendlyUrlPath(
		UnsafeSupplier<String, Throwable> friendlyUrlPathUnsafeSupplier);

	public void setHeadline(String headline);

	public void setHeadline(
		UnsafeSupplier<String, Throwable> headlineUnsafeSupplier);

	public void setId(Long id);

	public void setId(UnsafeSupplier<Long, Throwable> idUnsafeSupplier);

	public void setImage(ImageObject image);

	public void setImage(
		UnsafeSupplier<ImageObject, Throwable> imageUnsafeSupplier);

	public void setImageId(Long imageId);

	public void setImageId(
		UnsafeSupplier<Long, Throwable> imageIdUnsafeSupplier);

	public void setKeywords(String[] keywords);

	public void setKeywords(
		UnsafeSupplier<String[], Throwable> keywordsUnsafeSupplier);

	public void setRepository(ImageObjectRepository repository);

	public void setRepository(
		UnsafeSupplier<ImageObjectRepository, Throwable>
			repositoryUnsafeSupplier);

	public void setRepositoryId(Long repositoryId);

	public void setRepositoryId(
		UnsafeSupplier<Long, Throwable> repositoryIdUnsafeSupplier);

}