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
 * ServiceImpl object for domain model class DateMany2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.DateMany2oneC
 */
@Service("AllO2M_O2O.DateMany2oneCService")
public class DateMany2oneCServiceImpl implements DateMany2oneCService {


    private static final Logger LOGGER = LoggerFactory.getLogger(DateMany2oneCServiceImpl.class);

    @Autowired
    @Qualifier("AllO2M_O2O.DateMany2oneCDao")
    private WMGenericDao<DateMany2oneC, Date> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<DateMany2oneC, Date> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
     public Page<DateMany2oneC> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AllO2M_O2OTransactionManager")
    @Override
    public DateMany2oneC create(DateMany2oneC datemany2onec) {
        LOGGER.debug("Creating a new datemany2onec with information: {}" , datemany2onec);
        return this.wmGenericDao.create(datemany2onec);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public DateMany2oneC delete(Date datemany2onecId) throws EntityNotFoundException {
        LOGGER.debug("Deleting datemany2onec with id: {}" , datemany2onecId);
        DateMany2oneC deleted = this.wmGenericDao.findById(datemany2onecId);
        if (deleted == null) {
            LOGGER.debug("No datemany2onec found with id: {}" , datemany2onecId);
            throw new EntityNotFoundException(String.valueOf(datemany2onecId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<DateMany2oneC> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all datemany2onecs");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<DateMany2oneC> findAll(Pageable pageable) {
        LOGGER.debug("Finding all datemany2onecs");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public DateMany2oneC findById(Date id) throws EntityNotFoundException {
        LOGGER.debug("Finding datemany2onec by id: {}" , id);
        DateMany2oneC datemany2onec=this.wmGenericDao.findById(id);
        if(datemany2onec==null){
            LOGGER.debug("No datemany2onec found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return datemany2onec;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public DateMany2oneC update(DateMany2oneC updated) throws EntityNotFoundException {
        LOGGER.debug("Updating datemany2onec with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Date id = (Date)updated.getDateId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}

