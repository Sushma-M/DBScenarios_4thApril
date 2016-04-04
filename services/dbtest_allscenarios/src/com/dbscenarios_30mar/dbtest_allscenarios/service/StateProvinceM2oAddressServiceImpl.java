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
 * ServiceImpl object for domain model class StateProvinceM2oAddress.
 * @see com.dbscenarios_30mar.dbtest_allscenarios.StateProvinceM2oAddress
 */
@Service("dbtest_allscenarios.StateProvinceM2oAddressService")
public class StateProvinceM2oAddressServiceImpl implements StateProvinceM2oAddressService {


    private static final Logger LOGGER = LoggerFactory.getLogger(StateProvinceM2oAddressServiceImpl.class);

    @Autowired
    @Qualifier("dbtest_allscenarios.StateProvinceM2oAddressDao")
    private WMGenericDao<StateProvinceM2oAddress, Integer> wmGenericDao;

    public void setWMGenericDao(WMGenericDao<StateProvinceM2oAddress, Integer> wmGenericDao){
        this.wmGenericDao = wmGenericDao;
    }
     @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
     public Page<StateProvinceM2oAddress> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable){
          LOGGER.debug("Fetching all associated");
          return this.wmGenericDao.getAssociatedObjects(value, entityName, key, pageable);
     }

    @Transactional(value = "dbtest_allscenariosTransactionManager")
    @Override
    public StateProvinceM2oAddress create(StateProvinceM2oAddress stateprovincem2oaddress) {
        LOGGER.debug("Creating a new stateprovincem2oaddress with information: {}" , stateprovincem2oaddress);
        return this.wmGenericDao.create(stateprovincem2oaddress);
    }

    @Transactional(rollbackFor = EntityNotFoundException.class, value = "dbtest_allscenariosTransactionManager")
    @Override
    public StateProvinceM2oAddress delete(Integer stateprovincem2oaddressId) throws EntityNotFoundException {
        LOGGER.debug("Deleting stateprovincem2oaddress with id: {}" , stateprovincem2oaddressId);
        StateProvinceM2oAddress deleted = this.wmGenericDao.findById(stateprovincem2oaddressId);
        if (deleted == null) {
            LOGGER.debug("No stateprovincem2oaddress found with id: {}" , stateprovincem2oaddressId);
            throw new EntityNotFoundException(String.valueOf(stateprovincem2oaddressId));
        }
        this.wmGenericDao.delete(deleted);
        return deleted;
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public Page<StateProvinceM2oAddress> findAll(QueryFilter[] queryFilters, Pageable pageable) {
        LOGGER.debug("Finding all stateprovincem2oaddresss");
        return this.wmGenericDao.search(queryFilters, pageable);
    }
    
    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public Page<StateProvinceM2oAddress> findAll(Pageable pageable) {
        LOGGER.debug("Finding all stateprovincem2oaddresss");
        return this.wmGenericDao.search(null, pageable);
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public StateProvinceM2oAddress findById(Integer id) throws EntityNotFoundException {
        LOGGER.debug("Finding stateprovincem2oaddress by id: {}" , id);
        StateProvinceM2oAddress stateprovincem2oaddress=this.wmGenericDao.findById(id);
        if(stateprovincem2oaddress==null){
            LOGGER.debug("No stateprovincem2oaddress found with id: {}" , id);
            throw new EntityNotFoundException(String.valueOf(id));
        }
        return stateprovincem2oaddress;
    }
    @Transactional(rollbackFor = EntityNotFoundException.class, value = "dbtest_allscenariosTransactionManager")
    @Override
    public StateProvinceM2oAddress update(StateProvinceM2oAddress updated) throws EntityNotFoundException {
        LOGGER.debug("Updating stateprovincem2oaddress with information: {}" , updated);
        this.wmGenericDao.update(updated);

        Integer id = (Integer)updated.getStateProvinceId();

        return this.wmGenericDao.findById(id);
    }

    @Transactional(readOnly = true, value = "dbtest_allscenariosTransactionManager")
    @Override
    public long countAll() {
        return this.wmGenericDao.count();
    }
}

