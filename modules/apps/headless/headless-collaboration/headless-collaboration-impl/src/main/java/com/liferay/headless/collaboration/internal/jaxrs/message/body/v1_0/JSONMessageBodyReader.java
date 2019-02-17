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

package com.liferay.headless.collaboration.internal.jaxrs.message.body.v1_0;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

import com.liferay.headless.collaboration.dto.v1_0.AggregateRating;
import com.liferay.headless.collaboration.dto.v1_0.BlogPosting;
import com.liferay.headless.collaboration.dto.v1_0.BlogPostingImage;
import com.liferay.headless.collaboration.dto.v1_0.Comment;
import com.liferay.headless.collaboration.dto.v1_0.Creator;
import com.liferay.headless.collaboration.dto.v1_0.Image;
import com.liferay.headless.collaboration.dto.v1_0.ImageObjectRepository;
import com.liferay.headless.collaboration.internal.dto.v1_0.AggregateRatingImpl;
import com.liferay.headless.collaboration.internal.dto.v1_0.BlogPostingImageImpl;
import com.liferay.headless.collaboration.internal.dto.v1_0.BlogPostingImpl;
import com.liferay.headless.collaboration.internal.dto.v1_0.CommentImpl;
import com.liferay.headless.collaboration.internal.dto.v1_0.CreatorImpl;
import com.liferay.headless.collaboration.internal.dto.v1_0.ImageImpl;
import com.liferay.headless.collaboration.internal.dto.v1_0.ImageObjectRepositoryImpl;

import java.io.IOException;
import java.io.InputStream;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.annotation.Generated;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import org.osgi.service.component.annotations.Component;

/**
 * @author Javier Gamarra
 * @generated
 */
@Component(
	property = {
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Headless.Collaboration)",
		"osgi.jaxrs.name=Liferay.Headless.Collaboration.v1_0.JSONMessageBodyReader"
	},
	service = MessageBodyReader.class
)
@Consumes(MediaType.APPLICATION_JSON)
@Generated("")
@Provider
public class JSONMessageBodyReader implements MessageBodyReader<Object> {

	@Override
	public boolean isReadable(
		Class<?> clazz, Type genericType, Annotation[] annotations,
		MediaType mediaType) {

			if (clazz.equals(AggregateRating.class)) {
				return true;
	}
			if (clazz.equals(BlogPosting.class)) {
				return true;
	}
			if (clazz.equals(BlogPostingImage.class)) {
				return true;
	}
			if (clazz.equals(Comment.class)) {
				return true;
	}
			if (clazz.equals(Creator.class)) {
				return true;
	}
			if (clazz.equals(Image.class)) {
				return true;
	}
			if (clazz.equals(ImageObjectRepository.class)) {
				return true;
	}

		return false;
	}

	@Override
	public Object readFrom(
			Class<Object> clazz, Type genericType, Annotation[] annotations,
			MediaType mediaType, MultivaluedMap<String, String> multivaluedMap,
			InputStream inputStream)
		throws IOException, WebApplicationException {

			if (clazz.equals(AggregateRating.class)) {
				return _objectMapper.readValue(inputStream, AggregateRatingImpl.class);
	}
			if (clazz.equals(BlogPosting.class)) {
				return _objectMapper.readValue(inputStream, BlogPostingImpl.class);
	}
			if (clazz.equals(BlogPostingImage.class)) {
				return _objectMapper.readValue(inputStream, BlogPostingImageImpl.class);
	}
			if (clazz.equals(Comment.class)) {
				return _objectMapper.readValue(inputStream, CommentImpl.class);
	}
			if (clazz.equals(Creator.class)) {
				return _objectMapper.readValue(inputStream, CreatorImpl.class);
	}
			if (clazz.equals(Image.class)) {
				return _objectMapper.readValue(inputStream, ImageImpl.class);
	}
			if (clazz.equals(ImageObjectRepository.class)) {
				return _objectMapper.readValue(inputStream, ImageObjectRepositoryImpl.class);
	}

		return null;
	}

	private static final ObjectMapper _objectMapper = new ObjectMapper() {
		{
			setDateFormat(new ISO8601DateFormat());
	}
	};

}