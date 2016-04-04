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
 * ServiceImpl object for domain model class TimeStampOne2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.TimeStampOne2oneP
 */
@Service("AllO2M_O2O.TimeStampOne2onePService")
public class TimeStampOne2onePServiceImpl implements TimeStampOne2onePService {


    private static final Logger LOGGER = LoggerFactory.getLogger(TimeStampOne2onePServiceImpl.class);

    @Autowired
    @Qualifier("AllO2M_O2O.TimeStampOne2onePDao")
    private WMGenericDao<TimeStampOne2oneP, Date> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<TimeStampOne2oneP, Date> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
     public Page<TimeStampOne2oneP> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AllO2M_O2OTransactionManager")
    @Override
    public TimeStampOne2oneP create(TimeStampOne2oneP timestampone2onep) {
        LOGGER.debug("Creating a new timestampone2onep with information: {}" , timestampone2onep);
        return this.wmGenericDao.create(timestampone2onep);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public TimeStampOne2oneP delete(Date timestampone2onepId) throws EntityNotFoundException {
        LOGGER.debug("Deleting timestampone2onep with id: {}" , timestampone2onepId);
        TimeStampOne2oneP deleted = this.wmGenericDao.findById(timestampone2onepId);
        if (deleted == null) {
            LOGGER.debug("No timestampone2onep found with id: {}" , timestampone2onepId);
            throw new EntityNotFoundException(String.valueOf(timestampone2onepId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<TimeStampOne2oneP> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all timestampone2oneps");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<TimeStampOne2oneP> findAll(Pageable pageable) {
        LOGGER.debug("Finding all timestampone2oneps");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public TimeStampOne2oneP findById(Date id) throws EntityNotFoundException {
        LOGGER.debug("Finding timestampone2onep by id: {}" , id);
        TimeStampOne2oneP timestampone2onep=this.wmGenericDao.findById(id);
        if(timestampone2onep==null){
            LOGGER.debug("No timestampone2onep found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return timestampone2onep;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public TimeStampOne2oneP update(TimeStampOne2oneP updated) throws EntityNotFoundException {
        LOGGER.debug("Updating timestampone2onep with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Date id = (Date)updated.getTimeStamp();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


