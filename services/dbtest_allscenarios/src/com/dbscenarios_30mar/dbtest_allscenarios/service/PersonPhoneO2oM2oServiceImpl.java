/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.dbtest_allscenarios.service;

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

import com.dbscenarios_30mar.dbtest_allscenarios.*;


/**
 * ServiceImpl object for domain model class PersonPhoneO2oM2o.
 * @see com.dbscenarios_30mar.dbtest_allscenarios.PersonPhoneO2oM2o
 */
@Service("dbtest_allscenarios.PersonPhoneO2oM2oService")
public class PersonPhoneO2oM2oServiceImpl implements PersonPhoneO2oM2oService {


    private static final Logger LOGGER = LoggerFactory.getLogger(PersonPhoneO2oM2oServiceImpl.class);

    @Autowired
    @Qualifier("dbtest_allscenarios.PersonPhoneO2oM2oDao")
    private WMGenericDao<PersonPhoneO2oM2o, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<PersonPhoneO2oM2o, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
     public Page<PersonPhoneO2oM2o> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "dbtest_allscenariosTransactionManager")
    @Override
    public PersonPhoneO2oM2o create(PersonPhoneO2oM2o personphoneo2om2o) {
        LOGGER.debug("Creating a new personphoneo2om2o with information: {}" , personphoneo2om2o);
        return this.wmGenericDao.create(personphoneo2om2o);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "dbtest_allscenariosTransactionManager")
    @Override
    public PersonPhoneO2oM2o delete(Integer personphoneo2om2oId) throws EntityNotFoundException {
        LOGGER.debug("Deleting personphoneo2om2o with id: {}" , personphoneo2om2oId);
        PersonPhoneO2oM2o deleted = this.wmGenericDao.findById(personphoneo2om2oId);
        if (deleted == null) {
            LOGGER.debug("No personphoneo2om2o found with id: {}" , personphoneo2om2oId);
            throw new EntityNotFoundException(String.valueOf(personphoneo2om2oId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public Page<PersonPhoneO2oM2o> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all personphoneo2om2os");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public Page<PersonPhoneO2oM2o> findAll(Pageable pageable) {
        LOGGER.debug("Finding all personphoneo2om2os");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public PersonPhoneO2oM2o findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding personphoneo2om2o by id: {}" , id);
        PersonPhoneO2oM2o personphoneo2om2o=this.wmGenericDao.findById(id);
        if(personphoneo2om2o==null){
            LOGGER.debug("No personphoneo2om2o found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return personphoneo2om2o;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "dbtest_allscenariosTransactionManager")
    @Override
    public PersonPhoneO2oM2o update(PersonPhoneO2oM2o updated) throws EntityNotFoundException {
        LOGGER.debug("Updating personphoneo2om2o with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Integer id = (Integer)updated.getPhoneNumberTypeId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


