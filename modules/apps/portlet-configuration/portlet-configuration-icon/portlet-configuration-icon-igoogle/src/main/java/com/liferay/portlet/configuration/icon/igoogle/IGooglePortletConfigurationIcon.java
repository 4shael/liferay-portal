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

package com.liferay.portlet.configuration.icon.igoogle;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.portlet.PortletPreferencesFactoryUtil;
import com.liferay.portal.kernel.portlet.configuration.icon.BasePortletConfigurationIcon;
import com.liferay.portal.kernel.portlet.configuration.icon.PortletConfigurationIcon;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author Eudaldo Alonso
 */
@Component(immediate = true, service = PortletConfigurationIcon.class)
public class IGooglePortletConfigurationIcon
	extends BasePortletConfigurationIcon {

	@Override
	public String getCssClass() {
		return "expose-as-widget";
	}

	@Override
	public String getMessage(PortletRequest portletRequest) {
		return "add-to-igoogle";
	}

	@Override
	public String getURL(
		PortletRequest portletRequest, PortletResponse portletResponse) {

		try {
			Portlet portlet = (Portlet)portletRequest.getAttribute(
				WebKeys.RENDER_PORTLET);

			ThemeDisplay themeDisplay =
				(ThemeDisplay)portletRequest.getAttribute(
					WebKeys.THEME_DISPLAY);

			return "http://fusion.google.com/add?source=atgs&moduleurl=" +
				PortalUtil.getGoogleGadgetURL(portlet, themeDisplay);
		}
		catch (PortalException pe) {
			if (_log.isWarnEnabled()) {
				_log.warn(pe, pe);
			}

			return StringPool.BLANK;
		}
	}

	@Override
	public double getWeight() {
		return 3.0;
	}

	@Override
	public boolean isLabel() {
		return true;
	}

	@Override
	public boolean isShow(PortletRequest portletRequest) {
		ThemeDisplay themeDisplay = (ThemeDisplay)portletRequest.getAttribute(
			WebKeys.THEME_DISPLAY);

		PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();

		PortletPreferences portletSetup =
			PortletPreferencesFactoryUtil.getStrictLayoutPortletSetup(
				themeDisplay.getLayout(), portletDisplay.getId());

		boolean lfrIgoogleShowAddAppLink = GetterUtil.getBoolean(
			portletSetup.getValue(
				"lfrIgoogleShowAddAppLink", StringPool.BLANK));

		if (lfrIgoogleShowAddAppLink) {
			return true;
		}

		return false;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		IGooglePortletConfigurationIcon.class);

}