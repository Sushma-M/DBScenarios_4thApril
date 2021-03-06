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
 * ServiceImpl object for domain model class Shift2rM2ovirtualParentForDepartment.
 * @see com.dbscenarios_30mar.dbtest_allscenarios.Shift2rM2ovirtualParentForDepartment
 */
@Service("dbtest_allscenarios.Shift2rM2ovirtualParentForDepartmentService")
public class Shift2rM2ovirtualParentForDepartmentServiceImpl implements Shift2rM2ovirtualParentForDepartmentService {


    private static final Logger LOGGER = LoggerFactory.getLogger(Shift2rM2ovirtualParentForDepartmentServiceImpl.class);

    @Autowired
    @Qualifier("dbtest_allscenarios.Shift2rM2ovirtualParentForDepartmentDao")
    private WMGenericDao<Shift2rM2ovirtualParentForDepartment, Short> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Shift2rM2ovirtualParentForDepartment, Short> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
     public Page<Shift2rM2ovirtualParentForDepartment> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "dbtest_allscenariosTransactionManager")
    @Override
    public Shift2rM2ovirtualParentForDepartment create(Shift2rM2ovirtualParentForDepartment shift2rm2ovirtualparentfordepartment) {
        LOGGER.debug("Creating a new shift2rm2ovirtualparentfordepartment with information: {}" , shift2rm2ovirtualparentfordepartment);
        return this.wmGenericDao.create(shift2rm2ovirtualparentfordepartment);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "dbtest_allscenariosTransactionManager")
    @Override
    public Shift2rM2ovirtualParentForDepartment delete(Short shift2rm2ovirtualparentfordepartmentId) throws EntityNotFoundException {
        LOGGER.debug("Deleting shift2rm2ovirtualparentfordepartment with id: {}" , shift2rm2ovirtualparentfordepartmentId);
        Shift2rM2ovirtualParentForDepartment deleted = this.wmGenericDao.findById(shift2rm2ovirtualparentfordepartmentId);
        if (deleted == null) {
            LOGGER.debug("No shift2rm2ovirtualparentfordepartment found with id: {}" , shift2rm2ovirtualparentfordepartmentId);
            throw new EntityNotFoundException(String.valueOf(shift2rm2ovirtualparentfordepartmentId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public Page<Shift2rM2ovirtualParentForDepartment> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all shift2rm2ovirtualparentfordepartments");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public Page<Shift2rM2ovirtualParentForDepartment> findAll(Pageable pageable) {
        LOGGER.debug("Finding all shift2rm2ovirtualparentfordepartments");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public Shift2rM2ovirtualParentForDepartment findById(Short id) throws EntityNotFoundException {
        LOGGER.debug("Finding shift2rm2ovirtualparentfordepartment by id: {}" , id);
        Shift2rM2ovirtualParentForDepartment shift2rm2ovirtualparentfordepartment=this.wmGenericDao.findById(id);
        if(shift2rm2ovirtualparentfordepartment==null){
            LOGGER.debug("No shift2rm2ovirtualparentfordepartment found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return shift2rm2ovirtualparentfordepartment;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "dbtest_allscenariosTransactionManager")
    @Override
    public Shift2rM2ovirtualParentForDepartment update(Shift2rM2ovirtualParentForDepartment updated) throws EntityNotFoundException {
        LOGGER.debug("Updating shift2rm2ovirtualparentfordepartment with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Short id = (Short)updated.getShiftId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


