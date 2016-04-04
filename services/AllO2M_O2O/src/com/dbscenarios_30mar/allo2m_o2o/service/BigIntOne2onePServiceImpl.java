/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.math.BigInteger;



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
 * ServiceImpl object for domain model class BigIntOne2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.BigIntOne2oneP
 */
@Service("AllO2M_O2O.BigIntOne2onePService")
public class BigIntOne2onePServiceImpl implements BigIntOne2onePService {


    private static final Logger LOGGER = LoggerFactory.getLogger(BigIntOne2onePServiceImpl.class);

    @Autowired
    @Qualifier("AllO2M_O2O.BigIntOne2onePDao")
    private WMGenericDao<BigIntOne2oneP, BigInteger> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<BigIntOne2oneP, BigInteger> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
     public Page<BigIntOne2oneP> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AllO2M_O2OTransactionManager")
    @Override
    public BigIntOne2oneP create(BigIntOne2oneP bigintone2onep) {
        LOGGER.debug("Creating a new bigintone2onep with information: {}" , bigintone2onep);
        return this.wmGenericDao.create(bigintone2onep);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public BigIntOne2oneP delete(BigInteger bigintone2onepId) throws EntityNotFoundException {
        LOGGER.debug("Deleting bigintone2onep with id: {}" , bigintone2onepId);
        BigIntOne2oneP deleted = this.wmGenericDao.findById(bigintone2onepId);
        if (deleted == null) {
            LOGGER.debug("No bigintone2onep found with id: {}" , bigintone2onepId);
            throw new EntityNotFoundException(String.valueOf(bigintone2onepId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<BigIntOne2oneP> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all bigintone2oneps");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<BigIntOne2oneP> findAll(Pageable pageable) {
        LOGGER.debug("Finding all bigintone2oneps");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public BigIntOne2oneP findById(BigInteger id) throws EntityNotFoundException {
        LOGGER.debug("Finding bigintone2onep by id: {}" , id);
        BigIntOne2oneP bigintone2onep=this.wmGenericDao.findById(id);
        if(bigintone2onep==null){
            LOGGER.debug("No bigintone2onep found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return bigintone2onep;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public BigIntOne2oneP update(BigIntOne2oneP updated) throws EntityNotFoundException {
        LOGGER.debug("Updating bigintone2onep with information: {}" , updated);
        this.wmGenericDao.update(updated);

        BigInteger id = (BigInteger)updated.getBigIntId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


