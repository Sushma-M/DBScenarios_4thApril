/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.dbscenarios_30mar.allo2m_o2o.service.FloatOne2oneCService;
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
 * Controller object for domain model class FloatOne2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.FloatOne2oneC
 */
@RestController(value = "AllO2M_O2O.FloatOne2oneCController")
@RequestMapping("/AllO2M_O2O/FloatOne2oneC")
@Api(description = "Exposes APIs to work with FloatOne2oneC resource.", value = "FloatOne2oneCController")
public class FloatOne2oneCController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FloatOne2oneCController.class);

    @Autowired
    @Qualifier("AllO2M_O2O.FloatOne2oneCService")
    private FloatOne2oneCService floatOne2oneCService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of FloatOne2oneC instances matching the search criteria.")
    public Page<FloatOne2oneC> findFloatOne2oneCs(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering FloatOne2oneCs list");
        return floatOne2oneCService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of FloatOne2oneC instances.")
    public Page<FloatOne2oneC> getFloatOne2oneCs(Pageable pageable) {
        LOGGER.debug("Rendering FloatOne2oneCs list");
        return floatOne2oneCService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setFloatOne2oneCService(FloatOne2oneCService service) {
        this.floatOne2oneCService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new FloatOne2oneC instance.")
    public FloatOne2oneC createFloatOne2oneC(@RequestBody FloatOne2oneC instance) {
        LOGGER.debug("Create FloatOne2oneC with information: {}", instance);
        instance = floatOne2oneCService.create(instance);
        LOGGER.debug("Created FloatOne2oneC with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of FloatOne2oneC instances.")
    public Long countAllFloatOne2oneCs() {
        LOGGER.debug("counting FloatOne2oneCs");
        Long count = floatOne2oneCService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the FloatOne2oneC instance associated with the given id.")
    public FloatOne2oneC getFloatOne2oneC(@PathVariable(value = "id") Double id) throws EntityNotFoundException {
        LOGGER.debug("Getting FloatOne2oneC with id: {}", id);
        FloatOne2oneC instance = floatOne2oneCService.findById(id);
        LOGGER.debug("FloatOne2oneC details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the FloatOne2oneC instance associated with the given id.")
    public FloatOne2oneC editFloatOne2oneC(@PathVariable(value = "id") Double id, @RequestBody FloatOne2oneC instance) throws EntityNotFoundException {
        LOGGER.debug("Editing FloatOne2oneC with id: {}", instance.getFloatId());
        instance.setFloatId(id);
        instance = floatOne2oneCService.update(instance);
        LOGGER.debug("FloatOne2oneC details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the FloatOne2oneC instance associated with the given id.")
    public boolean deleteFloatOne2oneC(@PathVariable(value = "id") Double id) throws EntityNotFoundException {
        LOGGER.debug("Deleting FloatOne2oneC with id: {}", id);
        FloatOne2oneC deleted = floatOne2oneCService.delete(id);
        return deleted != null;
    }
}