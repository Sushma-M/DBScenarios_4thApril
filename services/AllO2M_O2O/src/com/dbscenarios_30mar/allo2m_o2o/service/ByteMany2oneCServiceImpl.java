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
 * ServiceImpl object for domain model class ByteMany2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.ByteMany2oneC
 */
@Service("AllO2M_O2O.ByteMany2oneCService")
public class ByteMany2oneCServiceImpl implements ByteMany2oneCService {


    private static final Logger LOGGER = LoggerFactory.getLogger(ByteMany2oneCServiceImpl.class);

    @Autowired
    @Qualifier("AllO2M_O2O.ByteMany2oneCDao")
    private WMGenericDao<ByteMany2oneC, Byte> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<ByteMany2oneC, Byte> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
     public Page<ByteMany2oneC> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AllO2M_O2OTransactionManager")
    @Override
    public ByteMany2oneC create(ByteMany2oneC bytemany2onec) {
        LOGGER.debug("Creating a new bytemany2onec with information: {}" , bytemany2onec);
        return this.wmGenericDao.create(bytemany2onec);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public ByteMany2oneC delete(Byte bytemany2onecId) throws EntityNotFoundException {
        LOGGER.debug("Deleting bytemany2onec with id: {}" , bytemany2onecId);
        ByteMany2oneC deleted = this.wmGenericDao.findById(bytemany2onecId);
        if (deleted == null) {
            LOGGER.debug("No bytemany2onec found with id: {}" , bytemany2onecId);
            throw new EntityNotFoundException(String.valueOf(bytemany2onecId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<ByteMany2oneC> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all bytemany2onecs");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<ByteMany2oneC> findAll(Pageable pageable) {
        LOGGER.debug("Finding all bytemany2onecs");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public ByteMany2oneC findById(Byte id) throws EntityNotFoundException {
        LOGGER.debug("Finding bytemany2onec by id: {}" , id);
        ByteMany2oneC bytemany2onec=this.wmGenericDao.findById(id);
        if(bytemany2onec==null){
            LOGGER.debug("No bytemany2onec found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return bytemany2onec;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public ByteMany2oneC update(ByteMany2oneC updated) throws EntityNotFoundException {
        LOGGER.debug("Updating bytemany2onec with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Byte id = (Byte)updated.getByteId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


