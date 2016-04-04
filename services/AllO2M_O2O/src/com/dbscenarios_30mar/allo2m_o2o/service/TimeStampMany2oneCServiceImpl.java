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
 * ServiceImpl object for domain model class TimeStampMany2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.TimeStampMany2oneC
 */
@Service("AllO2M_O2O.TimeStampMany2oneCService")
public class TimeStampMany2oneCServiceImpl implements TimeStampMany2oneCService {


    private static final Logger LOGGER = LoggerFactory.getLogger(TimeStampMany2oneCServiceImpl.class);

    @Autowired
    @Qualifier("AllO2M_O2O.TimeStampMany2oneCDao")
    private WMGenericDao<TimeStampMany2oneC, Date> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<TimeStampMany2oneC, Date> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
     public Page<TimeStampMany2oneC> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AllO2M_O2OTransactionManager")
    @Override
    public TimeStampMany2oneC create(TimeStampMany2oneC timestampmany2onec) {
        LOGGER.debug("Creating a new timestampmany2onec with information: {}" , timestampmany2onec);
        return this.wmGenericDao.create(timestampmany2onec);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public TimeStampMany2oneC delete(Date timestampmany2onecId) throws EntityNotFoundException {
        LOGGER.debug("Deleting timestampmany2onec with id: {}" , timestampmany2onecId);
        TimeStampMany2oneC deleted = this.wmGenericDao.findById(timestampmany2onecId);
        if (deleted == null) {
            LOGGER.debug("No timestampmany2onec found with id: {}" , timestampmany2onecId);
            throw new EntityNotFoundException(String.valueOf(timestampmany2onecId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<TimeStampMany2oneC> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all timestampmany2onecs");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<TimeStampMany2oneC> findAll(Pageable pageable) {
        LOGGER.debug("Finding all timestampmany2onecs");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public TimeStampMany2oneC findById(Date id) throws EntityNotFoundException {
        LOGGER.debug("Finding timestampmany2onec by id: {}" , id);
        TimeStampMany2oneC timestampmany2onec=this.wmGenericDao.findById(id);
        if(timestampmany2onec==null){
            LOGGER.debug("No timestampmany2onec found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return timestampmany2onec;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public TimeStampMany2oneC update(TimeStampMany2oneC updated) throws EntityNotFoundException {
        LOGGER.debug("Updating timestampmany2onec with information: {}" , updated);
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

