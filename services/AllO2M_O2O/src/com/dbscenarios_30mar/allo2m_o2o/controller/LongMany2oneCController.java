/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.dbscenarios_30mar.allo2m_o2o.service.LongMany2oneCService;
import java.math.BigInteger;
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
 * Controller object for domain model class LongMany2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.LongMany2oneC
 */
@RestController(value = "AllO2M_O2O.LongMany2oneCController")
@RequestMapping("/AllO2M_O2O/LongMany2oneC")
@Api(description = "Exposes APIs to work with LongMany2oneC resource.", value = "LongMany2oneCController")
public class LongMany2oneCController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LongMany2oneCController.class);

    @Autowired
    @Qualifier("AllO2M_O2O.LongMany2oneCService")
    private LongMany2oneCService longMany2oneCService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of LongMany2oneC instances matching the search criteria.")
    public Page<LongMany2oneC> findLongMany2oneCs(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering LongMany2oneCs list");
        return longMany2oneCService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of LongMany2oneC instances.")
    public Page<LongMany2oneC> getLongMany2oneCs(Pageable pageable) {
        LOGGER.debug("Rendering LongMany2oneCs list");
        return longMany2oneCService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setLongMany2oneCService(LongMany2oneCService service) {
        this.longMany2oneCService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new LongMany2oneC instance.")
    public LongMany2oneC createLongMany2oneC(@RequestBody LongMany2oneC instance) {
        LOGGER.debug("Create LongMany2oneC with information: {}", instance);
        instance = longMany2oneCService.create(instance);
        LOGGER.debug("Created LongMany2oneC with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of LongMany2oneC instances.")
    public Long countAllLongMany2oneCs() {
        LOGGER.debug("counting LongMany2oneCs");
        Long count = longMany2oneCService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the LongMany2oneC instance associated with the given id.")
    public LongMany2oneC getLongMany2oneC(@PathVariable(value = "id") BigInteger id) throws EntityNotFoundException {
        LOGGER.debug("Getting LongMany2oneC with id: {}", id);
        LongMany2oneC instance = longMany2oneCService.findById(id);
        LOGGER.debug("LongMany2oneC details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the LongMany2oneC instance associated with the given id.")
    public LongMany2oneC editLongMany2oneC(@PathVariable(value = "id") BigInteger id, @RequestBody LongMany2oneC instance) throws EntityNotFoundException {
        LOGGER.debug("Editing LongMany2oneC with id: {}", instance.getLongId());
        instance.setLongId(id);
        instance = longMany2oneCService.update(instance);
        LOGGER.debug("LongMany2oneC details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the LongMany2oneC instance associated with the given id.")
    public boolean deleteLongMany2oneC(@PathVariable(value = "id") BigInteger id) throws EntityNotFoundException {
        LOGGER.debug("Deleting LongMany2oneC with id: {}", id);
        LongMany2oneC deleted = longMany2oneCService.delete(id);
        return deleted != null;
    }
}