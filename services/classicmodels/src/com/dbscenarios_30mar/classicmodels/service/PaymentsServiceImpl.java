/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.classicmodels.service;

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

import com.dbscenarios_30mar.classicmodels.*;


/**
 * ServiceImpl object for domain model class Payments.
 * @see com.dbscenarios_30mar.classicmodels.Payments
 */
@Service("classicmodels.PaymentsService")
public class PaymentsServiceImpl implements PaymentsService {


    private static final Logger LOGGER = LoggerFactory.getLogger(PaymentsServiceImpl.class);

    @Autowired
    @Qualifier("classicmodels.PaymentsDao")
    private WMGenericDao<Payments, PaymentsId> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Payments, PaymentsId> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
     public Page<Payments> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public Payments create(Payments payments) {
        LOGGER.debug("Creating a new payments with information: {}" , payments);
        return this.wmGenericDao.create(payments);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "classicmodelsTransactionManager")
    @Override
    public Payments delete(PaymentsId paymentsId) throws EntityNotFoundException {
        LOGGER.debug("Deleting payments with id: {}" , paymentsId);
        Payments deleted = this.wmGenericDao.findById(paymentsId);
        if (deleted == null) {
            LOGGER.debug("No payments found with id: {}" , paymentsId);
            throw new EntityNotFoundException(String.valueOf(paymentsId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<Payments> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all paymentss");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<Payments> findAll(Pageable pageable) {
        LOGGER.debug("Finding all paymentss");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Payments findById(PaymentsId id) throws EntityNotFoundException {
        LOGGER.debug("Finding payments by id: {}" , id);
        Payments payments=this.wmGenericDao.findById(id);
        if(payments==null){
            LOGGER.debug("No payments found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return payments;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "classicmodelsTransactionManager")
    @Override
    public Payments update(Payments updated) throws EntityNotFoundException {
        LOGGER.debug("Updating payments with information: {}" , updated);
        this.wmGenericDao.update(updated);

        PaymentsId id = new PaymentsId();
        id.setCustomerNumber(updated.getCustomerNumber());
        id.setCheckNumber(updated.getCheckNumber());

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


