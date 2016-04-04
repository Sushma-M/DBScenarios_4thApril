/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.joda.time.LocalDateTime;



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
 * ServiceImpl object for domain model class DatetimeMany2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.DatetimeMany2oneC
 */
@Service("AllO2M_O2O.DatetimeMany2oneCService")
public class DatetimeMany2oneCServiceImpl implements DatetimeMany2oneCService {


    private static final Logger LOGGER = LoggerFactory.getLogger(DatetimeMany2oneCServiceImpl.class);

    @Autowired
    @Qualifier("AllO2M_O2O.DatetimeMany2oneCDao")
    private WMGenericDao<DatetimeMany2oneC, LocalDateTime> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<DatetimeMany2oneC, LocalDateTime> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
     public Page<DatetimeMany2oneC> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AllO2M_O2OTransactionManager")
    @Override
    public DatetimeMany2oneC create(DatetimeMany2oneC datetimemany2onec) {
        LOGGER.debug("Creating a new datetimemany2onec with information: {}" , datetimemany2onec);
        return this.wmGenericDao.create(datetimemany2onec);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public DatetimeMany2oneC delete(LocalDateTime datetimemany2onecId) throws EntityNotFoundException {
        LOGGER.debug("Deleting datetimemany2onec with id: {}" , datetimemany2onecId);
        DatetimeMany2oneC deleted = this.wmGenericDao.findById(datetimemany2onecId);
        if (deleted == null) {
            LOGGER.debug("No datetimemany2onec found with id: {}" , datetimemany2onecId);
            throw new EntityNotFoundException(String.valueOf(datetimemany2onecId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<DatetimeMany2oneC> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all datetimemany2onecs");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<DatetimeMany2oneC> findAll(Pageable pageable) {
        LOGGER.debug("Finding all datetimemany2onecs");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public DatetimeMany2oneC findById(LocalDateTime id) throws EntityNotFoundException {
        LOGGER.debug("Finding datetimemany2onec by id: {}" , id);
        DatetimeMany2oneC datetimemany2onec=this.wmGenericDao.findById(id);
        if(datetimemany2onec==null){
            LOGGER.debug("No datetimemany2onec found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return datetimemany2onec;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public DatetimeMany2oneC update(DatetimeMany2oneC updated) throws EntityNotFoundException {
        LOGGER.debug("Updating datetimemany2onec with information: {}" , updated);
        this.wmGenericDao.update(updated);

        LocalDateTime id = (LocalDateTime)updated.getDatetimeId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


