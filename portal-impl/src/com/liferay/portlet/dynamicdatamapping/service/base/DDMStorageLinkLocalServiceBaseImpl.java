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

package com.liferay.portlet.dynamicdatamapping.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBFactoryUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink;
import com.liferay.portlet.dynamicdatamapping.service.DDMStorageLinkLocalService;
import com.liferay.portlet.dynamicdatamapping.service.persistence.DDMStorageLinkPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the d d m storage link local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.portlet.dynamicdatamapping.service.impl.DDMStorageLinkLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.portlet.dynamicdatamapping.service.impl.DDMStorageLinkLocalServiceImpl
 * @see com.liferay.portlet.dynamicdatamapping.service.DDMStorageLinkLocalServiceUtil
 * @generated
 */
public abstract class DDMStorageLinkLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements DDMStorageLinkLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.portlet.dynamicdatamapping.service.DDMStorageLinkLocalServiceUtil} to access the d d m storage link local service.
	 */

	/**
	 * Adds the d d m storage link to the database. Also notifies the appropriate model listeners.
	 *
	 * @param ddmStorageLink the d d m storage link
	 * @return the d d m storage link that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DDMStorageLink addDDMStorageLink(DDMStorageLink ddmStorageLink)
		throws SystemException {
		ddmStorageLink.setNew(true);

		return ddmStorageLinkPersistence.update(ddmStorageLink);
	}

	/**
	 * Creates a new d d m storage link with the primary key. Does not add the d d m storage link to the database.
	 *
	 * @param storageLinkId the primary key for the new d d m storage link
	 * @return the new d d m storage link
	 */
	@Override
	public DDMStorageLink createDDMStorageLink(long storageLinkId) {
		return ddmStorageLinkPersistence.create(storageLinkId);
	}

	/**
	 * Deletes the d d m storage link with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param storageLinkId the primary key of the d d m storage link
	 * @return the d d m storage link that was removed
	 * @throws PortalException if a d d m storage link with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DDMStorageLink deleteDDMStorageLink(long storageLinkId)
		throws PortalException, SystemException {
		return ddmStorageLinkPersistence.remove(storageLinkId);
	}

	/**
	 * Deletes the d d m storage link from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ddmStorageLink the d d m storage link
	 * @return the d d m storage link that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DDMStorageLink deleteDDMStorageLink(DDMStorageLink ddmStorageLink)
		throws SystemException {
		return ddmStorageLinkPersistence.remove(ddmStorageLink);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(DDMStorageLink.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return ddmStorageLinkPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return ddmStorageLinkPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return ddmStorageLinkPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return ddmStorageLinkPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return ddmStorageLinkPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public DDMStorageLink fetchDDMStorageLink(long storageLinkId)
		throws SystemException {
		return ddmStorageLinkPersistence.fetchByPrimaryKey(storageLinkId);
	}

	/**
	 * Returns the d d m storage link with the primary key.
	 *
	 * @param storageLinkId the primary key of the d d m storage link
	 * @return the d d m storage link
	 * @throws PortalException if a d d m storage link with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DDMStorageLink getDDMStorageLink(long storageLinkId)
		throws PortalException, SystemException {
		return ddmStorageLinkPersistence.findByPrimaryKey(storageLinkId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery()
		throws SystemException {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(this);
		actionableDynamicQuery.setClass(DDMStorageLink.class);
		actionableDynamicQuery.setClassLoader(getClassLoader());

		actionableDynamicQuery.setPrimaryKeyPropertyName("storageLinkId");

		return actionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery)
		throws SystemException {
		actionableDynamicQuery.setBaseLocalService(this);
		actionableDynamicQuery.setClass(DDMStorageLink.class);
		actionableDynamicQuery.setClassLoader(getClassLoader());

		actionableDynamicQuery.setPrimaryKeyPropertyName("storageLinkId");
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return ddmStorageLinkPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the d d m storage links.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of d d m storage links
	 * @param end the upper bound of the range of d d m storage links (not inclusive)
	 * @return the range of d d m storage links
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DDMStorageLink> getDDMStorageLinks(int start, int end)
		throws SystemException {
		return ddmStorageLinkPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of d d m storage links.
	 *
	 * @return the number of d d m storage links
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getDDMStorageLinksCount() throws SystemException {
		return ddmStorageLinkPersistence.countAll();
	}

	/**
	 * Updates the d d m storage link in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param ddmStorageLink the d d m storage link
	 * @return the d d m storage link that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DDMStorageLink updateDDMStorageLink(DDMStorageLink ddmStorageLink)
		throws SystemException {
		return ddmStorageLinkPersistence.update(ddmStorageLink);
	}

	/**
	 * Returns the d d m storage link local service.
	 *
	 * @return the d d m storage link local service
	 */
	public com.liferay.portlet.dynamicdatamapping.service.DDMStorageLinkLocalService getDDMStorageLinkLocalService() {
		return ddmStorageLinkLocalService;
	}

	/**
	 * Sets the d d m storage link local service.
	 *
	 * @param ddmStorageLinkLocalService the d d m storage link local service
	 */
	public void setDDMStorageLinkLocalService(
		com.liferay.portlet.dynamicdatamapping.service.DDMStorageLinkLocalService ddmStorageLinkLocalService) {
		this.ddmStorageLinkLocalService = ddmStorageLinkLocalService;
	}

	/**
	 * Returns the d d m storage link persistence.
	 *
	 * @return the d d m storage link persistence
	 */
	public DDMStorageLinkPersistence getDDMStorageLinkPersistence() {
		return ddmStorageLinkPersistence;
	}

	/**
	 * Sets the d d m storage link persistence.
	 *
	 * @param ddmStorageLinkPersistence the d d m storage link persistence
	 */
	public void setDDMStorageLinkPersistence(
		DDMStorageLinkPersistence ddmStorageLinkPersistence) {
		this.ddmStorageLinkPersistence = ddmStorageLinkPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink",
			ddmStorageLinkLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"com.liferay.portlet.dynamicdatamapping.model.DDMStorageLink");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	protected Class<?> getModelClass() {
		return DDMStorageLink.class;
	}

	protected String getModelClassName() {
		return DDMStorageLink.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = ddmStorageLinkPersistence.getDataSource();

			DB db = DBFactoryUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.portlet.dynamicdatamapping.service.DDMStorageLinkLocalService.class)
	protected com.liferay.portlet.dynamicdatamapping.service.DDMStorageLinkLocalService ddmStorageLinkLocalService;
	@BeanReference(type = DDMStorageLinkPersistence.class)
	protected DDMStorageLinkPersistence ddmStorageLinkPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
	private String _beanIdentifier;
}