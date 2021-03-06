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
 * ServiceImpl object for domain model class BigIntOne2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.BigIntOne2oneC
 */
@Service("AllO2M_O2O.BigIntOne2oneCService")
public class BigIntOne2oneCServiceImpl implements BigIntOne2oneCService {


    private static final Logger LOGGER = LoggerFactory.getLogger(BigIntOne2oneCServiceImpl.class);

    @Autowired
    @Qualifier("AllO2M_O2O.BigIntOne2oneCDao")
    private WMGenericDao<BigIntOne2oneC, BigInteger> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<BigIntOne2oneC, BigInteger> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
     public Page<BigIntOne2oneC> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AllO2M_O2OTransactionManager")
    @Override
    public BigIntOne2oneC create(BigIntOne2oneC bigintone2onec) {
        LOGGER.debug("Creating a new bigintone2onec with information: {}" , bigintone2onec);
        return this.wmGenericDao.create(bigintone2onec);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public BigIntOne2oneC delete(BigInteger bigintone2onecId) throws EntityNotFoundException {
        LOGGER.debug("Deleting bigintone2onec with id: {}" , bigintone2onecId);
        BigIntOne2oneC deleted = this.wmGenericDao.findById(bigintone2onecId);
        if (deleted == null) {
            LOGGER.debug("No bigintone2onec found with id: {}" , bigintone2onecId);
            throw new EntityNotFoundException(String.valueOf(bigintone2onecId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<BigIntOne2oneC> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all bigintone2onecs");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<BigIntOne2oneC> findAll(Pageable pageable) {
        LOGGER.debug("Finding all bigintone2onecs");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public BigIntOne2oneC findById(BigInteger id) throws EntityNotFoundException {
        LOGGER.debug("Finding bigintone2onec by id: {}" , id);
        BigIntOne2oneC bigintone2onec=this.wmGenericDao.findById(id);
        if(bigintone2onec==null){
            LOGGER.debug("No bigintone2onec found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return bigintone2onec;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public BigIntOne2oneC update(BigIntOne2oneC updated) throws EntityNotFoundException {
        LOGGER.debug("Updating bigintone2onec with information: {}" , updated);
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


