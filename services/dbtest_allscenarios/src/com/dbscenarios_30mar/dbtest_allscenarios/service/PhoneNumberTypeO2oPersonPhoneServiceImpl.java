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
 * ServiceImpl object for domain model class PhoneNumberTypeO2oPersonPhone.
 * @see com.dbscenarios_30mar.dbtest_allscenarios.PhoneNumberTypeO2oPersonPhone
 */
@Service("dbtest_allscenarios.PhoneNumberTypeO2oPersonPhoneService")
public class PhoneNumberTypeO2oPersonPhoneServiceImpl implements PhoneNumberTypeO2oPersonPhoneService {


    private static final Logger LOGGER = LoggerFactory.getLogger(PhoneNumberTypeO2oPersonPhoneServiceImpl.class);

    @Autowired
    @Qualifier("dbtest_allscenarios.PhoneNumberTypeO2oPersonPhoneDao")
    private WMGenericDao<PhoneNumberTypeO2oPersonPhone, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<PhoneNumberTypeO2oPersonPhone, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
     public Page<PhoneNumberTypeO2oPersonPhone> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "dbtest_allscenariosTransactionManager")
    @Override
    public PhoneNumberTypeO2oPersonPhone create(PhoneNumberTypeO2oPersonPhone phonenumbertypeo2opersonphone) {
        LOGGER.debug("Creating a new phonenumbertypeo2opersonphone with information: {}" , phonenumbertypeo2opersonphone);
        return this.wmGenericDao.create(phonenumbertypeo2opersonphone);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "dbtest_allscenariosTransactionManager")
    @Override
    public PhoneNumberTypeO2oPersonPhone delete(Integer phonenumbertypeo2opersonphoneId) throws EntityNotFoundException {
        LOGGER.debug("Deleting phonenumbertypeo2opersonphone with id: {}" , phonenumbertypeo2opersonphoneId);
        PhoneNumberTypeO2oPersonPhone deleted = this.wmGenericDao.findById(phonenumbertypeo2opersonphoneId);
        if (deleted == null) {
            LOGGER.debug("No phonenumbertypeo2opersonphone found with id: {}" , phonenumbertypeo2opersonphoneId);
            throw new EntityNotFoundException(String.valueOf(phonenumbertypeo2opersonphoneId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public Page<PhoneNumberTypeO2oPersonPhone> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all phonenumbertypeo2opersonphones");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public Page<PhoneNumberTypeO2oPersonPhone> findAll(Pageable pageable) {
        LOGGER.debug("Finding all phonenumbertypeo2opersonphones");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public PhoneNumberTypeO2oPersonPhone findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding phonenumbertypeo2opersonphone by id: {}" , id);
        PhoneNumberTypeO2oPersonPhone phonenumbertypeo2opersonphone=this.wmGenericDao.findById(id);
        if(phonenumbertypeo2opersonphone==null){
            LOGGER.debug("No phonenumbertypeo2opersonphone found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return phonenumbertypeo2opersonphone;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "dbtest_allscenariosTransactionManager")
    @Override
    public PhoneNumberTypeO2oPersonPhone update(PhoneNumberTypeO2oPersonPhone updated) throws EntityNotFoundException {
        LOGGER.debug("Updating phonenumbertypeo2opersonphone with information: {}" , updated);
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


