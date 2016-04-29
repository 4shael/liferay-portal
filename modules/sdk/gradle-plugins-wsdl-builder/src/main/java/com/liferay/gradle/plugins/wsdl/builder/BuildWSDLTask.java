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

package com.liferay.gradle.plugins.wsdl.builder;

import com.liferay.gradle.util.GradleUtil;

import groovy.lang.Closure;

import java.io.File;

import java.util.HashMap;
import java.util.Map;

import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.file.FileCollection;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Nested;
import org.gradle.api.tasks.SkipWhenEmpty;

/**
 * @author Andrea Di Giorgi
 */
public class BuildWSDLTask extends DefaultTask {

	public void generateOptions(Closure<?> closure) {
		Project project = getProject();

		project.configure(getGenerateOptions(), closure);
	}

	@Input
	public File getDestinationDir() {
		return GradleUtil.toFile(getProject(), _destinationDir);
	}

	@Nested
	public GenerateOptions getGenerateOptions() {
		return _generateOptions;
	}

	@Input
	public File getInputDir() {
		return GradleUtil.toFile(getProject(), _inputDir);
	}

	@InputFiles
	@SkipWhenEmpty
	public FileCollection getInputFiles() {
		Project project = getProject();

		Map<String, Object> args = new HashMap<>();

		args.put("dir", getInputDir());
		args.put("include", "*.wsdl");

		return project.fileTree(args);
	}

	@Input
	public boolean isBuildLibs() {
		return _buildLibs;
	}

	@Input
	public boolean isIncludeSource() {
		return _includeSource;
	}

	public void setBuildLibs(boolean buildLibs) {
		_buildLibs = buildLibs;
	}

	public void setDestinationDir(Object destinationDir) {
		_destinationDir = destinationDir;
	}

	public void setIncludeSource(boolean includeSource) {
		_includeSource = includeSource;
	}

	public void setInputDir(Object inputDir) {
		_inputDir = inputDir;
	}

	private boolean _buildLibs = true;
	private Object _destinationDir;
	private final GenerateOptions _generateOptions = new GenerateOptions();
	private boolean _includeSource = true;
	private Object _inputDir;

}