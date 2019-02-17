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

import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.headless.document.library.dto.v1_0.Creator;
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
@GraphQLName("Creator")
@XmlRootElement(name = "Creator")
public class CreatorImpl implements Creator {

	public String getAdditionalName() {
			return additionalName;
	}

	public void setAdditionalName(String additionalName) {
			this.additionalName = additionalName;
	}

	public void setAdditionalName(UnsafeSupplier<String, Throwable> additionalNameUnsafeSupplier) {
			try {
				additionalName = additionalNameUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	@JsonProperty
	protected String additionalName;
	public String getAlternateName() {
			return alternateName;
	}

	public void setAlternateName(String alternateName) {
			this.alternateName = alternateName;
	}

	public void setAlternateName(UnsafeSupplier<String, Throwable> alternateNameUnsafeSupplier) {
			try {
				alternateName = alternateNameUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	@JsonProperty
	protected String alternateName;
	public String getEmail() {
			return email;
	}

	public void setEmail(String email) {
			this.email = email;
	}

	public void setEmail(UnsafeSupplier<String, Throwable> emailUnsafeSupplier) {
			try {
				email = emailUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	@JsonProperty
	protected String email;
	public String getFamilyName() {
			return familyName;
	}

	public void setFamilyName(String familyName) {
			this.familyName = familyName;
	}

	public void setFamilyName(UnsafeSupplier<String, Throwable> familyNameUnsafeSupplier) {
			try {
				familyName = familyNameUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	@JsonProperty
	protected String familyName;
	public String getGivenName() {
			return givenName;
	}

	public void setGivenName(String givenName) {
			this.givenName = givenName;
	}

	public void setGivenName(UnsafeSupplier<String, Throwable> givenNameUnsafeSupplier) {
			try {
				givenName = givenNameUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	@JsonProperty
	protected String givenName;
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
	@JsonProperty
	protected Long id;
	public String getImage() {
			return image;
	}

	public void setImage(String image) {
			this.image = image;
	}

	public void setImage(UnsafeSupplier<String, Throwable> imageUnsafeSupplier) {
			try {
				image = imageUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	@JsonProperty
	protected String image;
	public String getJobTitle() {
			return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
	}

	public void setJobTitle(UnsafeSupplier<String, Throwable> jobTitleUnsafeSupplier) {
			try {
				jobTitle = jobTitleUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	@JsonProperty
	protected String jobTitle;
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
	@JsonProperty
	protected String name;
	public String getProfileURL() {
			return profileURL;
	}

	public void setProfileURL(String profileURL) {
			this.profileURL = profileURL;
	}

	public void setProfileURL(UnsafeSupplier<String, Throwable> profileURLUnsafeSupplier) {
			try {
				profileURL = profileURLUnsafeSupplier.get();
	}
			catch (Throwable t) {
				throw new RuntimeException(t);
	}
	}

	@GraphQLField
	@JsonProperty
	protected String profileURL;

}