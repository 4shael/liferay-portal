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

package com.liferay.source.formatter.checks;

import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.tools.ImportsFormatter;
import com.liferay.source.formatter.JSPImportsFormatter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Hugo Huijser
 */
public class JSPImportsCheck extends BaseFileCheck {

	public JSPImportsCheck(boolean portalSource, boolean subrepository) {
		_portalSource = portalSource;
		_subrepository = subrepository;
	}

	@Override
	protected String doProcess(
			String fileName, String absolutePath, String content)
		throws Exception {

		content = _formatJSPImportsOrTaglibs(
			fileName, content, _compressedJSPImportPattern,
			_uncompressedJSPImportPattern);
		content = _formatJSPImportsOrTaglibs(
			fileName, content, _compressedJSPTaglibPattern,
			_uncompressedJSPTaglibPattern);

		if ((_portalSource || _subrepository) &&
			content.contains("page import=") &&
			!fileName.contains("init.jsp") &&
			!fileName.contains("init-ext.jsp") &&
			!fileName.contains("/taglib/aui/") &&
			!fileName.endsWith("touch.jsp") &&
			(fileName.endsWith(".jspf") || content.contains("include file="))) {

			addMessage(fileName, "Move imports to init.jsp");
		}

		content = _compressImportsOrTaglibs(
			fileName, content, "<%@ page import=");
		content = _compressImportsOrTaglibs(
			fileName, content, "<%@ taglib uri=");

		return content;
	}

	private String _compressImportsOrTaglibs(
		String fileName, String content, String attributePrefix) {

		if (!fileName.endsWith("init.jsp") && !fileName.endsWith("init.jspf")) {
			return content;
		}

		int x = content.indexOf(attributePrefix);

		int y = content.lastIndexOf(attributePrefix);

		y = content.indexOf("%>", y);

		if ((x == -1) || (y == -1) || (x > y)) {
			return content;
		}

		String importsOrTaglibs = content.substring(x, y);

		importsOrTaglibs = StringUtil.replace(
			importsOrTaglibs, new String[] {"%>\r\n<%@ ", "%>\n<%@ "},
			new String[] {"%><%@\r\n", "%><%@\n"});

		return content.substring(0, x) + importsOrTaglibs +
			content.substring(y);
	}

	private String _formatJSPImportsOrTaglibs(
			String fileName, String content, Pattern compressedPattern,
			Pattern uncompressedPattern)
		throws Exception {

		if (fileName.endsWith("init-ext.jsp")) {
			return content;
		}

		Matcher matcher = compressedPattern.matcher(content);

		if (!matcher.find()) {
			return content;
		}

		String imports = matcher.group();

		String newImports = StringUtil.replace(
			imports, new String[] {"<%@\r\n", "<%@\n", " %><%@ "},
			new String[] {"\r\n<%@ ", "\n<%@ ", " %>\n<%@ "});

		content = StringUtil.replaceFirst(content, imports, newImports);

		ImportsFormatter importsFormatter = new JSPImportsFormatter();

		return importsFormatter.format(content, uncompressedPattern);
	}

	private final Pattern _compressedJSPImportPattern = Pattern.compile(
		"(<.*\n*page import=\".*>\n*)+", Pattern.MULTILINE);
	private final Pattern _compressedJSPTaglibPattern = Pattern.compile(
		"(<.*\n*taglib uri=\".*>\n*)+", Pattern.MULTILINE);
	private final boolean _portalSource;
	private final boolean _subrepository;
	private final Pattern _uncompressedJSPImportPattern = Pattern.compile(
		"(<.*page import=\".*>\n*)+", Pattern.MULTILINE);
	private final Pattern _uncompressedJSPTaglibPattern = Pattern.compile(
		"(<.*taglib uri=\".*>\n*)+", Pattern.MULTILINE);

}