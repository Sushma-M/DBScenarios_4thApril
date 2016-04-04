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
 * ServiceImpl object for domain model class Productlines.
 * @see com.dbscenarios_30mar.classicmodels.Productlines
 */
@Service("classicmodels.ProductlinesService")
public class ProductlinesServiceImpl implements ProductlinesService {


    private static final Logger LOGGER = LoggerFactory.getLogger(ProductlinesServiceImpl.class);

    @Autowired
    @Qualifier("classicmodels.ProductlinesDao")
    private WMGenericDao<Productlines, String> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<Productlines, String> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
     public Page<Productlines> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "classicmodelsTransactionManager")
    @Override
    public Productlines create(Productlines productlines) {
        LOGGER.debug("Creating a new productlines with information: {}" , productlines);
        return this.wmGenericDao.create(productlines);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "classicmodelsTransactionManager")
    @Override
    public Productlines delete(String productlinesId) throws EntityNotFoundException {
        LOGGER.debug("Deleting productlines with id: {}" , productlinesId);
        Productlines deleted = this.wmGenericDao.findById(productlinesId);
        if (deleted == null) {
            LOGGER.debug("No productlines found with id: {}" , productlinesId);
            throw new EntityNotFoundException(String.valueOf(productlinesId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<Productlines> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all productliness");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Page<Productlines> findAll(Pageable pageable) {
        LOGGER.debug("Finding all productliness");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public Productlines findById(String id) throws EntityNotFoundException {
        LOGGER.debug("Finding productlines by id: {}" , id);
        Productlines productlines=this.wmGenericDao.findById(id);
        if(productlines==null){
            LOGGER.debug("No productlines found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return productlines;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "classicmodelsTransactionManager")
    @Override
    public Productlines update(Productlines updated) throws EntityNotFoundException {
        LOGGER.debug("Updating productlines with information: {}" , updated);
        this.wmGenericDao.update(updated);

        String id = (String)updated.getProductLine();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "classicmodelsTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}


