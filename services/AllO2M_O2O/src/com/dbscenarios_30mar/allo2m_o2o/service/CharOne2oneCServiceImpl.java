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
 * ServiceImpl object for domain model class CharOne2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.CharOne2oneC
 */
@Service("AllO2M_O2O.CharOne2oneCService")
public class CharOne2oneCServiceImpl implements CharOne2oneCService {


    private static final Logger LOGGER = LoggerFactory.getLogger(CharOne2oneCServiceImpl.class);

    @Autowired
    @Qualifier("AllO2M_O2O.CharOne2oneCDao")
    private WMGenericDao<CharOne2oneC, Character> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<CharOne2oneC, Character> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
     public Page<CharOne2oneC> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "AllO2M_O2OTransactionManager")
    @Override
    public CharOne2oneC create(CharOne2oneC charone2onec) {
        LOGGER.debug("Creating a new charone2onec with information: {}" , charone2onec);
        return this.wmGenericDao.create(charone2onec);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public CharOne2oneC delete(Character charone2onecId) throws EntityNotFoundException {
        LOGGER.debug("Deleting charone2onec with id: {}" , charone2onecId);
        CharOne2oneC deleted = this.wmGenericDao.findById(charone2onecId);
        if (deleted == null) {
            LOGGER.debug("No charone2onec found with id: {}" , charone2onecId);
            throw new EntityNotFoundException(String.valueOf(charone2onecId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<CharOne2oneC> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all charone2onecs");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public Page<CharOne2oneC> findAll(Pageable pageable) {
        LOGGER.debug("Finding all charone2onecs");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "AllO2M_O2OTransactionManager")
    @Override
    public CharOne2oneC findById(Character id) throws EntityNotFoundException {
        LOGGER.debug("Finding charone2onec by id: {}" , id);
        CharOne2oneC charone2onec=this.wmGenericDao.findById(id);
        if(charone2onec==null){
            LOGGER.debug("No charone2onec found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return charone2onec;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "AllO2M_O2OTransactionManager")
    @Override
    public CharOne2oneC update(CharOne2oneC updated) throws EntityNotFoundException {
        LOGGER.debug("Updating charone2onec with information: {}" , updated);
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

