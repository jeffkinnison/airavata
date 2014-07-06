/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.aiaravata.application.catalog.data.resources;

import org.airavata.appcatalog.cpi.AppCatalogException;
import org.apache.aiaravata.application.catalog.data.model.ComputeResource;
import org.apache.aiaravata.application.catalog.data.util.AppCatalogJPAUtils;
import org.apache.aiaravata.application.catalog.data.util.AppCatalogQueryGenerator;
import org.apache.aiaravata.application.catalog.data.util.AppCatalogResourceType;
import org.apache.airavata.common.exception.ApplicationSettingsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ComputeResourceResource extends AbstractResource {
	private final static Logger logger = LoggerFactory.getLogger(ComputeResourceResource.class);
	private String resourceDescription;
	private String resourceId;
	private String hostName;
	
	@Override
	public void remove(Object identifier) throws AppCatalogException {
		EntityManager em = null;
		try {
			em = AppCatalogJPAUtils.getEntityManager();
			em.getTransaction().begin();
			AppCatalogQueryGenerator generator = new AppCatalogQueryGenerator(COMPUTE_RESOURCE);
			generator.setParameter(ComputeResourceConstants.RESOURCE_ID, identifier);
			Query q = generator.deleteQuery(em);
			q.executeUpdate();
			em.getTransaction().commit();
			em.close();
		} catch (ApplicationSettingsException e) {
			logger.error(e.getMessage(), e);
			throw new AppCatalogException(e);
		} finally {
			if (em != null && em.isOpen()) {
				if (em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}
				em.close();
			}
		}
	}
	
	@Override
	public Resource get(Object identifier) throws AppCatalogException {
		EntityManager em = null;
		try {
			em = AppCatalogJPAUtils.getEntityManager();
			em.getTransaction().begin();
			AppCatalogQueryGenerator generator = new AppCatalogQueryGenerator(COMPUTE_RESOURCE);
			generator.setParameter(ComputeResourceConstants.RESOURCE_ID, identifier);
			Query q = generator.selectQuery(em);
			ComputeResource computeResource = (ComputeResource) q.getSingleResult();
			ComputeResourceResource computeResourceResource = (ComputeResourceResource) AppCatalogJPAUtils.getResource(AppCatalogResourceType.COMPUTE_RESOURCE, computeResource);
			em.getTransaction().commit();
			em.close();
			return computeResourceResource;
		} catch (ApplicationSettingsException e) {
			logger.error(e.getMessage(), e);
			throw new AppCatalogException(e);
		} finally {
			if (em != null && em.isOpen()) {
				if (em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}
				em.close();
			}
		}
	}
	
	@Override
	public List<Resource> get(String fieldName, Object value) throws AppCatalogException {
		List<Resource> computeResourceResources = new ArrayList<Resource>();
		EntityManager em = null;
		try {
			em = AppCatalogJPAUtils.getEntityManager();
			em.getTransaction().begin();
			AppCatalogQueryGenerator generator = new AppCatalogQueryGenerator(COMPUTE_RESOURCE);
			Query q;
			if ((fieldName.equals(ComputeResourceConstants.RESOURCE_DESCRIPTION)) || (fieldName.equals(ComputeResourceConstants.RESOURCE_ID)) || (fieldName.equals(ComputeResourceConstants.HOST_NAME))) {
				generator.setParameter(fieldName, value);
				q = generator.selectQuery(em);
				List<?> results = q.getResultList();
				for (Object result : results) {
					ComputeResource computeResource = (ComputeResource) result;
					ComputeResourceResource computeResourceResource = (ComputeResourceResource) AppCatalogJPAUtils.getResource(AppCatalogResourceType.COMPUTE_RESOURCE, computeResource);
					computeResourceResources.add(computeResourceResource);
				}
			} else {
				em.getTransaction().commit();
					em.close();
				logger.error("Unsupported field name for Compute Resource Resource.", new IllegalArgumentException());
				throw new IllegalArgumentException("Unsupported field name for Compute Resource Resource.");
			}
			em.getTransaction().commit();
			em.close();
		} catch (ApplicationSettingsException e) {
			logger.error(e.getMessage(), e);
			throw new AppCatalogException(e);
		} finally {
			if (em != null && em.isOpen()) {
				if (em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}
				em.close();
			}
		}
		return computeResourceResources;
	}
	
	@Override
	public List<String> getIds(String fieldName, Object value) throws AppCatalogException {
		List<String> computeResourceResourceIDs = new ArrayList<String>();
		EntityManager em = null;
		try {
			em = AppCatalogJPAUtils.getEntityManager();
			em.getTransaction().begin();
			AppCatalogQueryGenerator generator = new AppCatalogQueryGenerator(COMPUTE_RESOURCE);
			Query q;
			if ((fieldName.equals(ComputeResourceConstants.RESOURCE_DESCRIPTION)) || (fieldName.equals(ComputeResourceConstants.RESOURCE_ID)) || (fieldName.equals(ComputeResourceConstants.HOST_NAME))) {
				generator.setParameter(fieldName, value);
				q = generator.selectQuery(em);
				List<?> results = q.getResultList();
				for (Object result : results) {
					ComputeResource computeResource = (ComputeResource) result;
					ComputeResourceResource computeResourceResource = (ComputeResourceResource) AppCatalogJPAUtils.getResource(AppCatalogResourceType.COMPUTE_RESOURCE, computeResource);
					computeResourceResourceIDs.add(computeResourceResource.getResourceId());
				}
			} else {
				em.getTransaction().commit();
					em.close();
				logger.error("Unsupported field name for Compute Resource Resource.", new IllegalArgumentException());
				throw new IllegalArgumentException("Unsupported field name for Compute Resource Resource.");
			}
			em.getTransaction().commit();
			em.close();
		} catch (ApplicationSettingsException e) {
			logger.error(e.getMessage(), e);
			throw new AppCatalogException(e);
		} finally {
			if (em != null && em.isOpen()) {
				if (em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}
				em.close();
			}
		}
		return computeResourceResourceIDs;
	}
	
	@Override
	public void save() throws AppCatalogException {
		EntityManager em = null;
		try {
			em = AppCatalogJPAUtils.getEntityManager();
			ComputeResource existingComputeResource = em.find(ComputeResource.class, resourceId);
			em.close();
			ComputeResource computeResource;
			em = AppCatalogJPAUtils.getEntityManager();
			em.getTransaction().begin();
			if (existingComputeResource == null) {
				computeResource = new ComputeResource();
			} else {
				computeResource = existingComputeResource;
			}
			computeResource.setResourceDescription(getResourceDescription());
			computeResource.setResourceId(getResourceId());
			computeResource.setHostName(getHostName());
			if (existingComputeResource == null) {
				em.persist(computeResource);
			} else {
				em.merge(computeResource);
			}
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new AppCatalogException(e);
		} finally {
			if (em != null && em.isOpen()) {
				if (em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}
				em.close();
			}
		}
	}
	
	@Override
	public boolean isExists(Object identifier) throws AppCatalogException {
		EntityManager em = null;
		try {
			em = AppCatalogJPAUtils.getEntityManager();
			ComputeResource computeResource = em.find(ComputeResource.class, identifier);
			em.close();
			return computeResource != null;
		} catch (ApplicationSettingsException e) {
			logger.error(e.getMessage(), e);
			throw new AppCatalogException(e);
		} finally {
			if (em != null && em.isOpen()) {
				if (em.getTransaction().isActive()) {
					em.getTransaction().rollback();
				}
				em.close();
			}
		}
	}
	
	public String getResourceDescription() {
		return resourceDescription;
	}
	
	public String getResourceId() {
		return resourceId;
	}
	
	public String getHostName() {
		return hostName;
	}
	
	public void setResourceDescription(String resourceDescription) {
		this.resourceDescription=resourceDescription;
	}
	
	public void setResourceId(String resourceId) {
		this.resourceId=resourceId;
	}
	
	public void setHostName(String hostName) {
		this.hostName=hostName;
	}
}