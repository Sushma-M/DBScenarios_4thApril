/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.Date;



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

import com.dbscenarios_30mar.allo2m_o2o.*;


/**
 * ServiceImpl object for domain model class TimeStampMany2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.TimeStampMany2oneP
 */
@Service("AllO2M_O2O.TimeStampMany2onePService")
public class TimeStampMany2onePServiceImpl implements TimeStampMany2onePService {


    private static final Logger LOGGER = LoggerFactory.getLogger(TimeStampMany2onePServiceImpl.class);

    @Autowired
    @Qualifier("AllO2M_O2O.TimeStampMany2onePDao")
    private WMGenericDao<TimeStampMany2oneP, Date> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<TimeStampMany2oneP, Date> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
     public Page<TimeStampMany2oneP> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AllO2M_O2OTransactionManager")
    @Override
    public TimeStampMany2oneP create(TimeStampMany2oneP timestampmany2onep) {
        LOGGER.debug("Creating a new timestampmany2onep with information: {}" , timestampmany2onep);
        return this.wmGenericDao.create(timestampmany2onep);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public TimeStampMany2oneP delete(Date timestampmany2onepId) throws EntityNotFoundException {
        LOGGER.debug("Deleting timestampmany2onep with id: {}" , timestampmany2onepId);
        TimeStampMany2oneP deleted = this.wmGenericDao.findById(timestampmany2onepId);
        if (deleted == null) {
            LOGGER.debug("No timestampmany2onep found with id: {}" , timestampmany2onepId);
            throw new EntityNotFoundException(String.valueOf(timestampmany2onepId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<TimeStampMany2oneP> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all timestampmany2oneps");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<TimeStampMany2oneP> findAll(Pageable pageable) {
        LOGGER.debug("Finding all timestampmany2oneps");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public TimeStampMany2oneP findById(Date id) throws EntityNotFoundException {
        LOGGER.debug("Finding timestampmany2onep by id: {}" , id);
        TimeStampMany2oneP timestampmany2onep=this.wmGenericDao.findById(id);
        if(timestampmany2onep==null){
            LOGGER.debug("No timestampmany2onep found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return timestampmany2onep;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public TimeStampMany2oneP update(TimeStampMany2oneP updated) throws EntityNotFoundException {
        LOGGER.debug("Updating timestampmany2onep with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Date id = (Date)updated.getTimeStampId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


