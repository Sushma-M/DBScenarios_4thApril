/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.service;

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

import com.dbscenarios_30mar.allo2m_o2o.*;


/**
 * ServiceImpl object for domain model class FloatMany2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.FloatMany2oneP
 */
@Service("AllO2M_O2O.FloatMany2onePService")
public class FloatMany2onePServiceImpl implements FloatMany2onePService {


    private static final Logger LOGGER = LoggerFactory.getLogger(FloatMany2onePServiceImpl.class);

    @Autowired
    @Qualifier("AllO2M_O2O.FloatMany2onePDao")
    private WMGenericDao<FloatMany2oneP, Double> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<FloatMany2oneP, Double> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
     public Page<FloatMany2oneP> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AllO2M_O2OTransactionManager")
    @Override
    public FloatMany2oneP create(FloatMany2oneP floatmany2onep) {
        LOGGER.debug("Creating a new floatmany2onep with information: {}" , floatmany2onep);
        return this.wmGenericDao.create(floatmany2onep);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public FloatMany2oneP delete(Double floatmany2onepId) throws EntityNotFoundException {
        LOGGER.debug("Deleting floatmany2onep with id: {}" , floatmany2onepId);
        FloatMany2oneP deleted = this.wmGenericDao.findById(floatmany2onepId);
        if (deleted == null) {
            LOGGER.debug("No floatmany2onep found with id: {}" , floatmany2onepId);
            throw new EntityNotFoundException(String.valueOf(floatmany2onepId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<FloatMany2oneP> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all floatmany2oneps");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<FloatMany2oneP> findAll(Pageable pageable) {
        LOGGER.debug("Finding all floatmany2oneps");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public FloatMany2oneP findById(Double id) throws EntityNotFoundException {
        LOGGER.debug("Finding floatmany2onep by id: {}" , id);
        FloatMany2oneP floatmany2onep=this.wmGenericDao.findById(id);
        if(floatmany2onep==null){
            LOGGER.debug("No floatmany2onep found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return floatmany2onep;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public FloatMany2oneP update(FloatMany2oneP updated) throws EntityNotFoundException {
        LOGGER.debug("Updating floatmany2onep with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Double id = (Double)updated.getId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


