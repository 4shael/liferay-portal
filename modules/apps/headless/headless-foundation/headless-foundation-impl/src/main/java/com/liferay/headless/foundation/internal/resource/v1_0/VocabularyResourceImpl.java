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

package com.liferay.headless.foundation.internal.resource.v1_0;

import com.liferay.asset.kernel.model.AssetCategory;
import com.liferay.asset.kernel.model.AssetVocabulary;
import com.liferay.asset.kernel.service.AssetVocabularyService;
import com.liferay.headless.foundation.dto.v1_0.Vocabulary;
import com.liferay.headless.foundation.internal.odata.entity.v1_0.VocabularyEntityModel;
import com.liferay.headless.foundation.resource.v1_0.VocabularyResource;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.ClassName;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.IndexerRegistry;
import com.liferay.portal.kernel.search.SearchResultPermissionFilterFactory;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.search.filter.Filter;
import com.liferay.portal.kernel.service.ClassNameService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.odata.entity.EntityModel;
import com.liferay.portal.vulcan.pagination.Page;
import com.liferay.portal.vulcan.pagination.Pagination;
import com.liferay.portal.vulcan.resource.EntityModelResource;
import com.liferay.portal.vulcan.util.SearchUtil;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;

/**
 * @author Javier Gamarra
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/vocabulary.properties",
	scope = ServiceScope.PROTOTYPE, service = VocabularyResource.class
)
public class VocabularyResourceImpl
	extends BaseVocabularyResourceImpl implements EntityModelResource {

	@Override
	public Response deleteVocabulary(Long vocabularyId) throws Exception {
		_assetVocabularyService.deleteVocabulary(vocabularyId);

		return buildNoContentResponse();
	}

	@Override
	public Page<Vocabulary> getContentSpaceVocabulariesPage(
			Long contentSpaceId, Filter filter, Pagination pagination,
			Sort[] sorts)
		throws Exception {

		List<AssetVocabulary> assetVocabularies = new ArrayList<>();

		ClassName className = _classNameService.fetchClassName(
			AssetVocabulary.class.getName());

		Hits hits = SearchUtil.getHits(
			filter, _indexerRegistry.nullSafeGetIndexer(AssetVocabulary.class),
			pagination,
			booleanQuery -> {
			},
			queryConfig -> {
				queryConfig.setSelectedFieldNames(Field.ASSET_VOCABULARY_ID);
			},
			searchContext -> {
				searchContext.setAttribute(
					Field.CLASS_NAME_ID, className.getClassNameId());
				searchContext.setAttribute("head", Boolean.TRUE);
				searchContext.setCompanyId(company.getCompanyId());
				searchContext.setGroupIds(new long[] {contentSpaceId});
			},
			_searchResultPermissionFilterFactory, sorts);

		for (Document document : hits.getDocs()) {
			AssetVocabulary vocabulary = _assetVocabularyService.getVocabulary(
				GetterUtil.getLong(document.get(Field.ASSET_VOCABULARY_ID)));

			assetVocabularies.add(vocabulary);
		}

		return Page.of(
			transform(assetVocabularies, this::_toVocabulary), pagination,
			assetVocabularies.size());
	}

	@Override
	public EntityModel getEntityModel(MultivaluedMap multivaluedMap) {
		return _vocabularyEntityModel;
	}

	@Override
	public Vocabulary getVocabulary(Long vocabularyId) throws Exception {
		return _toVocabulary(
			_assetVocabularyService.getVocabulary(vocabularyId));
	}

	@Override
	public Vocabulary postContentSpaceVocabulary(
			Long contentSpaceId, Vocabulary vocabulary)
		throws Exception {

		return _toVocabulary(_addAssetVocabulary(contentSpaceId, vocabulary));
	}

	@Override
	public Vocabulary putVocabulary(Long vocabularyId, Vocabulary vocabulary)
		throws Exception {

		AssetVocabulary assetVocabulary = _assetVocabularyService.getVocabulary(
			vocabularyId);

		return _toVocabulary(
			_assetVocabularyService.updateVocabulary(
				assetVocabulary.getVocabularyId(), null,
				_merge(
					assetVocabulary.getTitleMap(),
					new AbstractMap.SimpleEntry<>(
						acceptLanguage.getPreferredLocale(),
						vocabulary.getName())),
				_merge(
					assetVocabulary.getDescriptionMap(),
					new AbstractMap.SimpleEntry<>(
						acceptLanguage.getPreferredLocale(),
						vocabulary.getDescription())),
				null, new ServiceContext()));
	}

	private AssetVocabulary _addAssetVocabulary(
			long groupId, Vocabulary vocabulary)
		throws PortalException {

		return _assetVocabularyService.addVocabulary(
			groupId, null,
			Collections.singletonMap(
				acceptLanguage.getPreferredLocale(), vocabulary.getName()),
			Collections.singletonMap(
				acceptLanguage.getPreferredLocale(),
				vocabulary.getDescription()),
			null, new ServiceContext());
	}

	private Map<Locale, String> _merge(
		Map<Locale, String> map, Map.Entry<Locale, String> mapEntry) {

		if (map == null) {
			return Stream.of(
				mapEntry
			).collect(
				Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)
			);
		}

		if (mapEntry == null) {
			return map;
		}

		if (mapEntry.getValue() == null) {
			map.remove(mapEntry.getValue());

			return map;
		}

		Set<Map.Entry<Locale, String>> mapEntries = map.entrySet();

		return Stream.concat(
			mapEntries.stream(), Stream.of(mapEntry)
		).collect(
			Collectors.toMap(
				Map.Entry::getKey, Map.Entry::getValue,
				(value1, value2) -> value2)
		);
	}

	private Vocabulary _toVocabulary(AssetVocabulary assetVocabulary) {
		return new Vocabulary() {
			{
				setAvailableLanguages(
					assetVocabulary.getAvailableLanguageIds());
				setContentSpace(assetVocabulary.getGroupId());
				setDateCreated(assetVocabulary.getCreateDate());
				setDateModified(assetVocabulary.getModifiedDate());
				setDescription(
					assetVocabulary.getDescription(
						acceptLanguage.getPreferredLocale()));
				setId(assetVocabulary.getVocabularyId());
				setName(
					assetVocabulary.getTitle(
						acceptLanguage.getPreferredLocale()));
				setVocabularyCategoriesIds(
					ListUtil.toArray(
						assetVocabulary.getCategories(),
						AssetCategory.CATEGORY_ID_ACCESSOR));
			}
		};
	}

	private static final VocabularyEntityModel _vocabularyEntityModel =
		new VocabularyEntityModel();

	@Reference
	private AssetVocabularyService _assetVocabularyService;

	@Reference
	private ClassNameService _classNameService;

	@Reference
	private IndexerRegistry _indexerRegistry;

	@Reference
	private SearchResultPermissionFilterFactory
		_searchResultPermissionFilterFactory;

}