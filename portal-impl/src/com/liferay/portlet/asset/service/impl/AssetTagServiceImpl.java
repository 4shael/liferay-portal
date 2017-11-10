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

package com.liferay.portlet.asset.service.impl;

import com.liferay.asset.kernel.model.AssetTag;
import com.liferay.asset.kernel.model.AssetTagDisplay;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.security.permission.ActionKeys;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.Autocomplete;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portlet.asset.service.base.AssetTagServiceBaseImpl;
import com.liferay.portlet.asset.service.permission.AssetTagPermission;
import com.liferay.portlet.asset.service.permission.AssetTagsPermission;
import com.liferay.portlet.asset.util.comparator.AssetTagNameComparator;
import com.liferay.util.dao.orm.CustomSQLUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Provides the remote service for accessing, adding, checking, deleting,
 * merging, and updating asset tags. Its methods include permission checks.
 *
 * @author Brian Wing Shun Chan
 * @author Jorge Ferrer
 * @author Alvaro del Castillo
 * @author Eduardo Lundgren
 * @author Bruno Farache
 * @author Juan Fernández
 */
public class AssetTagServiceImpl extends AssetTagServiceBaseImpl {

	@Override
	public AssetTag addTag(
			long groupId, String name, ServiceContext serviceContext)
		throws PortalException {

		AssetTagsPermission.check(
			getPermissionChecker(), groupId, ActionKeys.ADD_TAG);

		return assetTagLocalService.addTag(
			getUserId(), groupId, name, serviceContext);
	}

	@Override
	public void deleteTag(long tagId) throws PortalException {
		AssetTagPermission.check(
			getPermissionChecker(), tagId, ActionKeys.DELETE);

		assetTagLocalService.deleteTag(tagId);
	}

	@Override
	public void deleteTags(long[] tagIds) throws PortalException {
		for (long tagId : tagIds) {
			AssetTagPermission.check(
				getPermissionChecker(), tagId, ActionKeys.DELETE);

			assetTagLocalService.deleteTag(tagId);
		}
	}

	@Override
	public List<AssetTag> getGroupsTags(long[] groupIds) {
		Set<AssetTag> groupsTags = new TreeSet<>(new AssetTagNameComparator());

		for (long groupId : groupIds) {
			List<AssetTag> groupTags = getGroupTags(groupId);

			groupsTags.addAll(groupTags);
		}

		return new ArrayList<>(groupsTags);
	}

	@Override
	public List<AssetTag> getGroupTags(long groupId) {
		return stripUserInformation(
			assetTagPersistence.filterFindByGroupId(groupId));
	}

	@Override
	public List<AssetTag> getGroupTags(
		long groupId, int start, int end, OrderByComparator<AssetTag> obc) {

		return stripUserInformation(
			assetTagPersistence.filterFindByGroupId(groupId, start, end, obc));
	}

	@Override
	public int getGroupTagsCount(long groupId) {
		return assetTagPersistence.filterCountByGroupId(groupId);
	}

	@Override
	public AssetTagDisplay getGroupTagsDisplay(
		long groupId, String name, int start, int end) {

		List<AssetTag> tags = null;
		int total = 0;

		if (Validator.isNotNull(name)) {
			name = (CustomSQLUtil.keywords(name))[0];

			tags = getTags(groupId, name, start, end);
			total = getTagsCount(groupId, name);
		}
		else {
			tags = getGroupTags(groupId, start, end, null);
			total = getGroupTagsCount(groupId);
		}

		return new AssetTagDisplay(tags, total, start, end);
	}

	@Override
	public AssetTag getTag(long tagId) throws PortalException {
		AssetTag assetTag = assetTagLocalService.getTag(tagId);

		AssetTagPermission.check(
			getPermissionChecker(), assetTag, ActionKeys.VIEW);

		return stripUserInformation(assetTag);
	}

	@Override
	public List<AssetTag> getTags(long groupId, long classNameId, String name) {
		return stripUserInformation(
			filterTags(
				assetTagFinder.findByG_C_N(
					groupId, classNameId, name, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)));
	}

	@Override
	public List<AssetTag> getTags(
		long groupId, long classNameId, String name, int start, int end,
		OrderByComparator<AssetTag> obc) {

		return stripUserInformation(
			filterTags(
				assetTagFinder.findByG_C_N(
					groupId, classNameId, name, start, end, obc)));
	}

	@Override
	public List<AssetTag> getTags(
		long groupId, String name, int start, int end) {

		return getTags(new long[] {groupId}, name, start, end);
	}

	@Override
	public List<AssetTag> getTags(
		long groupId, String name, int start, int end,
		OrderByComparator<AssetTag> obc) {

		return getTags(new long[] {groupId}, name, start, end, obc);
	}

	@Override
	public List<AssetTag> getTags(
		long[] groupIds, String name, int start, int end) {

		return getTags(
			groupIds, name, start, end, new AssetTagNameComparator());
	}

	@Override
	public List<AssetTag> getTags(
		long[] groupIds, String name, int start, int end,
		OrderByComparator<AssetTag> obc) {

		if (Validator.isNull(name)) {
			return stripUserInformation(
				assetTagPersistence.filterFindByGroupId(
					groupIds, start, end, obc));
		}

		return stripUserInformation(
			assetTagPersistence.filterFindByG_LikeN(
				groupIds, name, start, end, obc));
	}

	@Override
	public List<AssetTag> getTags(String className, long classPK) {
		return stripUserInformation(
			filterTags(assetTagLocalService.getTags(className, classPK)));
	}

	@Override
	public int getTagsCount(long groupId, String name) {
		if (Validator.isNull(name)) {
			return assetTagPersistence.filterCountByGroupId(groupId);
		}

		return assetTagPersistence.filterCountByG_LikeN(groupId, name);
	}

	@Override
	public int getVisibleAssetsTagsCount(
		long groupId, long classNameId, String name) {

		return assetTagFinder.countByG_C_N(groupId, classNameId, name);
	}

	@Override
	public int getVisibleAssetsTagsCount(long groupId, String name) {
		return assetTagFinder.countByG_N(groupId, name);
	}

	@Override
	public void mergeTags(long fromTagId, long toTagId) throws PortalException {
		AssetTagPermission.check(
			getPermissionChecker(), toTagId, ActionKeys.UPDATE);

		assetTagLocalService.mergeTags(fromTagId, toTagId);
	}

	@Override
	public void mergeTags(long[] fromTagIds, long toTagId)
		throws PortalException {

		for (long fromTagId : fromTagIds) {
			mergeTags(fromTagId, toTagId);
		}
	}

	@Override
	public JSONArray search(long groupId, String name, int start, int end) {
		return search(new long[] {groupId}, name, start, end);
	}

	@Override
	public JSONArray search(long[] groupIds, String name, int start, int end) {
		List<AssetTag> tags = getTags(groupIds, name, start, end);

		return Autocomplete.arrayToJSONArray(tags, "name", "name");
	}

	@Override
	public AssetTag updateTag(
			long tagId, String name, ServiceContext serviceContext)
		throws PortalException {

		AssetTagPermission.check(
			getPermissionChecker(), tagId, ActionKeys.UPDATE);

		return assetTagLocalService.updateTag(
			getUserId(), tagId, name, serviceContext);
	}

	protected List<AssetTag> filterTags(List<AssetTag> tags) {
		Stream<AssetTag> tagsStream = tags.stream();

		return tagsStream.filter(
			this::hasAssetTagViewPermission
		).collect(
			Collectors.toList()
		);
	}

	protected boolean hasAssetTagViewPermission(AssetTag assetTag) {
		try {
			return AssetTagPermission.contains(
				getPermissionChecker(), assetTag, ActionKeys.VIEW);
		}
		catch (PrincipalException pe) {
			_log.error(pe);
		}

		return false;
	}

	protected AssetTag stripUserInformation(AssetTag assetTag) {
		if (assetTag == null) {
			return null;
		}

		try {
			if (getPermissionChecker().isCompanyAdmin(
					assetTag.getCompanyId()) ||
				(assetTag.getUserId() == getPermissionChecker().getUserId())) {

				return assetTag;
			}
		}
		catch (PrincipalException pe) {
			_log.error(pe);
		}

		assetTag.setUserId(0);
		assetTag.setUserName(StringPool.BLANK);
		assetTag.setUserUuid(StringPool.BLANK);

		return assetTag;
	}

	protected List<AssetTag> stripUserInformation(List<AssetTag> assetTags) {
		for (AssetTag assetTag : assetTags) {
			stripUserInformation(assetTag);
		}

		return assetTags;
	}

	private static final Log _log = LogFactoryUtil.getLog(
		AssetTagServiceImpl.class);

}