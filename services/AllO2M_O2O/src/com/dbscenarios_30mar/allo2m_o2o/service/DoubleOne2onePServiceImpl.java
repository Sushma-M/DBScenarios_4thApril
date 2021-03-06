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
 * ServiceImpl object for domain model class DoubleOne2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.DoubleOne2oneP
 */
@Service("AllO2M_O2O.DoubleOne2onePService")
public class DoubleOne2onePServiceImpl implements DoubleOne2onePService {


    private static final Logger LOGGER = LoggerFactory.getLogger(DoubleOne2onePServiceImpl.class);

    @Autowired
    @Qualifier("AllO2M_O2O.DoubleOne2onePDao")
    private WMGenericDao<DoubleOne2oneP, Double> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<DoubleOne2oneP, Double> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
     public Page<DoubleOne2oneP> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AllO2M_O2OTransactionManager")
    @Override
    public DoubleOne2oneP create(DoubleOne2oneP doubleone2onep) {
        LOGGER.debug("Creating a new doubleone2onep with information: {}" , doubleone2onep);
        return this.wmGenericDao.create(doubleone2onep);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public DoubleOne2oneP delete(Double doubleone2onepId) throws EntityNotFoundException {
        LOGGER.debug("Deleting doubleone2onep with id: {}" , doubleone2onepId);
        DoubleOne2oneP deleted = this.wmGenericDao.findById(doubleone2onepId);
        if (deleted == null) {
            LOGGER.debug("No doubleone2onep found with id: {}" , doubleone2onepId);
            throw new EntityNotFoundException(String.valueOf(doubleone2onepId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<DoubleOne2oneP> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all doubleone2oneps");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<DoubleOne2oneP> findAll(Pageable pageable) {
        LOGGER.debug("Finding all doubleone2oneps");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public DoubleOne2oneP findById(Double id) throws EntityNotFoundException {
        LOGGER.debug("Finding doubleone2onep by id: {}" , id);
        DoubleOne2oneP doubleone2onep=this.wmGenericDao.findById(id);
        if(doubleone2onep==null){
            LOGGER.debug("No doubleone2onep found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return doubleone2onep;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public DoubleOne2oneP update(DoubleOne2oneP updated) throws EntityNotFoundException {
        LOGGER.debug("Updating doubleone2onep with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Double id = (Double)updated.getDoubleId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


