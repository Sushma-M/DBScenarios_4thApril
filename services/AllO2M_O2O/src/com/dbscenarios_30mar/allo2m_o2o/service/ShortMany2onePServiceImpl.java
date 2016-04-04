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
 * ServiceImpl object for domain model class ShortMany2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.ShortMany2oneP
 */
@Service("AllO2M_O2O.ShortMany2onePService")
public class ShortMany2onePServiceImpl implements ShortMany2onePService {


    private static final Logger LOGGER = LoggerFactory.getLogger(ShortMany2onePServiceImpl.class);

    @Autowired
    @Qualifier("AllO2M_O2O.ShortMany2onePDao")
    private WMGenericDao<ShortMany2oneP, Short> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<ShortMany2oneP, Short> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
     public Page<ShortMany2oneP> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AllO2M_O2OTransactionManager")
    @Override
    public ShortMany2oneP create(ShortMany2oneP shortmany2onep) {
        LOGGER.debug("Creating a new shortmany2onep with information: {}" , shortmany2onep);
        return this.wmGenericDao.create(shortmany2onep);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public ShortMany2oneP delete(Short shortmany2onepId) throws EntityNotFoundException {
        LOGGER.debug("Deleting shortmany2onep with id: {}" , shortmany2onepId);
        ShortMany2oneP deleted = this.wmGenericDao.findById(shortmany2onepId);
        if (deleted == null) {
            LOGGER.debug("No shortmany2onep found with id: {}" , shortmany2onepId);
            throw new EntityNotFoundException(String.valueOf(shortmany2onepId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<ShortMany2oneP> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all shortmany2oneps");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<ShortMany2oneP> findAll(Pageable pageable) {
        LOGGER.debug("Finding all shortmany2oneps");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public ShortMany2oneP findById(Short id) throws EntityNotFoundException {
        LOGGER.debug("Finding shortmany2onep by id: {}" , id);
        ShortMany2oneP shortmany2onep=this.wmGenericDao.findById(id);
        if(shortmany2onep==null){
            LOGGER.debug("No shortmany2onep found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return shortmany2onep;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public ShortMany2oneP update(ShortMany2oneP updated) throws EntityNotFoundException {
        LOGGER.debug("Updating shortmany2onep with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Short id = (Short)updated.getShortId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


