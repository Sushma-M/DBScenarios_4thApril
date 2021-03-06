/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.dbscenarios_30mar.allo2m_o2o.service.BigdecMany2oneCService;
import com.dbscenarios_30mar.allo2m_o2o.service.BigdecMany2onePService;
import java.math.BigDecimal;
import java.io.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.TypeMismatchException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.util.WMMultipartUtils;
import com.wavemaker.runtime.util.WMRuntimeUtils;
import com.wavemaker.runtime.file.model.DownloadResponse;
import com.wordnik.swagger.annotations.*;
import com.dbscenarios_30mar.allo2m_o2o.*;
import com.dbscenarios_30mar.allo2m_o2o.service.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

/**
 * Controller object for domain model class BigdecMany2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.BigdecMany2oneP
 */
@RestController(value = "AllO2M_O2O.BigdecMany2onePController")
@RequestMapping("/AllO2M_O2O/BigdecMany2oneP")
@Api(description = "Exposes APIs to work with BigdecMany2oneP resource.", value = "BigdecMany2onePController")
public class BigdecMany2onePController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BigdecMany2onePController.class);

    @Autowired
    @Qualifier("AllO2M_O2O.BigdecMany2onePService")
    private BigdecMany2onePService bigdecMany2onePService;

    @Autowired
    @Qualifier("AllO2M_O2O.BigdecMany2oneCService")
    private BigdecMany2oneCService bigdecMany2oneCService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of BigdecMany2oneP instances matching the search criteria.")
    public Page<BigdecMany2oneP> findBigdecMany2onePs(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering BigdecMany2onePs list");
        return bigdecMany2onePService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of BigdecMany2oneP instances.")
    public Page<BigdecMany2oneP> getBigdecMany2onePs(Pageable pageable) {
        LOGGER.debug("Rendering BigdecMany2onePs list");
        return bigdecMany2onePService.findAll(pageable);
    }

    @RequestMapping(value = "/{id:.+}/bigdecMany2oneCs", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the bigdecMany2oneCs instance associated with the given id.")
    public Page<BigdecMany2oneC> findAssociatedbigdecMany2oneCs(Pageable pageable, @PathVariable("id") BigDecimal id) {
        LOGGER.debug("Fetching all associated bigdecMany2oneCs");
        return bigdecMany2oneCService.findAssociatedValues(id, "bigdecMany2oneP", "bigdecId", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setBigdecMany2onePService(BigdecMany2onePService service) {
        this.bigdecMany2onePService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new BigdecMany2oneP instance.")
    public BigdecMany2oneP createBigdecMany2oneP(@RequestBody BigdecMany2oneP instance) {
        LOGGER.debug("Create BigdecMany2oneP with information: {}", instance);
        instance = bigdecMany2onePService.create(instance);
        LOGGER.debug("Created BigdecMany2oneP with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of BigdecMany2oneP instances.")
    public Long countAllBigdecMany2onePs() {
        LOGGER.debug("counting BigdecMany2onePs");
        Long count = bigdecMany2onePService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the BigdecMany2oneP instance associated with the given id.")
    public BigdecMany2oneP getBigdecMany2oneP(@PathVariable(value = "id") BigDecimal id) throws EntityNotFoundException {
        LOGGER.debug("Getting BigdecMany2oneP with id: {}", id);
        BigdecMany2oneP instance = bigdecMany2onePService.findById(id);
        LOGGER.debug("BigdecMany2oneP details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the BigdecMany2oneP instance associated with the given id.")
    public BigdecMany2oneP editBigdecMany2oneP(@PathVariable(value = "id") BigDecimal id, @RequestBody BigdecMany2oneP instance) throws EntityNotFoundException {
        LOGGER.debug("Editing BigdecMany2oneP with id: {}", instance.getBigdecId());
        instance.setBigdecId(id);
        instance = bigdecMany2onePService.update(instance);
        LOGGER.debug("BigdecMany2oneP details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the BigdecMany2oneP instance associated with the given id.")
    public boolean deleteBigdecMany2oneP(@PathVariable(value = "id") BigDecimal id) throws EntityNotFoundException {
        LOGGER.debug("Deleting BigdecMany2oneP with id: {}", id);
        BigdecMany2oneP deleted = bigdecMany2onePService.delete(id);
        return deleted != null;
    }
}
