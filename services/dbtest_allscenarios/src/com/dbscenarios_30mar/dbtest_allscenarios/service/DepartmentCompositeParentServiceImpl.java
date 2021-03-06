/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.dbtest_allscenarios.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wavemaker.runtime.data.dao.*;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.dbscenarios_30mar.dbtest_allscenarios.*;


/**
 * ServiceImpl object for domain model class DepartmentCompositeParent.
 * @see com.dbscenarios_30mar.dbtest_allscenarios.DepartmentCompositeParent
 */
@Service("dbtest_allscenarios.DepartmentCompositeParentService")
public class DepartmentCompositeParentServiceImpl implements DepartmentCompositeParentService {


    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentCompositeParentServiceImpl.class);

    @Autowired
    @Qualifier("dbtest_allscenarios.DepartmentCompositeParentDao")
    private WMGenericDao<DepartmentCompositeParent, Short> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<DepartmentCompositeParent, Short> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
     public Page<DepartmentCompositeParent> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "dbtest_allscenariosTransactionManager")
    @Override
    public DepartmentCompositeParent create(DepartmentCompositeParent departmentcompositeparent) {
        LOGGER.debug("Creating a new departmentcompositeparent with information: {}" , departmentcompositeparent);
        return this.wmGenericDao.create(departmentcompositeparent);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "dbtest_allscenariosTransactionManager")
    @Override
    public DepartmentCompositeParent delete(Short departmentcompositeparentId) throws EntityNotFoundException {
        LOGGER.debug("Deleting departmentcompositeparent with id: {}" , departmentcompositeparentId);
        DepartmentCompositeParent deleted = this.wmGenericDao.findById(departmentcompositeparentId);
        if (deleted == null) {
            LOGGER.debug("No departmentcompositeparent found with id: {}" , departmentcompositeparentId);
            throw new EntityNotFoundException(String.valueOf(departmentcompositeparentId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public Page<DepartmentCompositeParent> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all departmentcompositeparents");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public Page<DepartmentCompositeParent> findAll(Pageable pageable) {
        LOGGER.debug("Finding all departmentcompositeparents");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public DepartmentCompositeParent findById(Short id) throws EntityNotFoundException {
        LOGGER.debug("Finding departmentcompositeparent by id: {}" , id);
        DepartmentCompositeParent departmentcompositeparent=this.wmGenericDao.findById(id);
        if(departmentcompositeparent==null){
            LOGGER.debug("No departmentcompositeparent found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return departmentcompositeparent;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "dbtest_allscenariosTransactionManager")
    @Override
    public DepartmentCompositeParent update(DepartmentCompositeParent updated) throws EntityNotFoundException {
        LOGGER.debug("Updating departmentcompositeparent with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Short id = (Short)updated.getDepartmentId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


