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
 * ServiceImpl object for domain model class CharMany2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.CharMany2oneP
 */
@Service("AllO2M_O2O.CharMany2onePService")
public class CharMany2onePServiceImpl implements CharMany2onePService {


    private static final Logger LOGGER = LoggerFactory.getLogger(CharMany2onePServiceImpl.class);

    @Autowired
    @Qualifier("AllO2M_O2O.CharMany2onePDao")
    private WMGenericDao<CharMany2oneP, Character> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<CharMany2oneP, Character> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
     public Page<CharMany2oneP> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AllO2M_O2OTransactionManager")
    @Override
    public CharMany2oneP create(CharMany2oneP charmany2onep) {
        LOGGER.debug("Creating a new charmany2onep with information: {}" , charmany2onep);
        return this.wmGenericDao.create(charmany2onep);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public CharMany2oneP delete(Character charmany2onepId) throws EntityNotFoundException {
        LOGGER.debug("Deleting charmany2onep with id: {}" , charmany2onepId);
        CharMany2oneP deleted = this.wmGenericDao.findById(charmany2onepId);
        if (deleted == null) {
            LOGGER.debug("No charmany2onep found with id: {}" , charmany2onepId);
            throw new EntityNotFoundException(String.valueOf(charmany2onepId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<CharMany2oneP> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all charmany2oneps");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<CharMany2oneP> findAll(Pageable pageable) {
        LOGGER.debug("Finding all charmany2oneps");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public CharMany2oneP findById(Character id) throws EntityNotFoundException {
        LOGGER.debug("Finding charmany2onep by id: {}" , id);
        CharMany2oneP charmany2onep=this.wmGenericDao.findById(id);
        if(charmany2onep==null){
            LOGGER.debug("No charmany2onep found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return charmany2onep;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public CharMany2oneP update(CharMany2oneP updated) throws EntityNotFoundException {
        LOGGER.debug("Updating charmany2onep with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Character id = (Character)updated.getCharId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


