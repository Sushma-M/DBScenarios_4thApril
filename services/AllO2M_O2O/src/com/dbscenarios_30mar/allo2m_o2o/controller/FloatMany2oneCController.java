/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.dbscenarios_30mar.allo2m_o2o.service.FloatMany2oneCService;
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
 * Controller object for domain model class FloatMany2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.FloatMany2oneC
 */
@RestController(value = "AllO2M_O2O.FloatMany2oneCController")
@RequestMapping("/AllO2M_O2O/FloatMany2oneC")
@Api(description = "Exposes APIs to work with FloatMany2oneC resource.", value = "FloatMany2oneCController")
public class FloatMany2oneCController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FloatMany2oneCController.class);

    @Autowired
    @Qualifier("AllO2M_O2O.FloatMany2oneCService")
    private FloatMany2oneCService floatMany2oneCService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of FloatMany2oneC instances matching the search criteria.")
    public Page<FloatMany2oneC> findFloatMany2oneCs(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering FloatMany2oneCs list");
        return floatMany2oneCService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of FloatMany2oneC instances.")
    public Page<FloatMany2oneC> getFloatMany2oneCs(Pageable pageable) {
        LOGGER.debug("Rendering FloatMany2oneCs list");
        return floatMany2oneCService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setFloatMany2oneCService(FloatMany2oneCService service) {
        this.floatMany2oneCService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new FloatMany2oneC instance.")
    public FloatMany2oneC createFloatMany2oneC(@RequestBody FloatMany2oneC instance) {
        LOGGER.debug("Create FloatMany2oneC with information: {}", instance);
        instance = floatMany2oneCService.create(instance);
        LOGGER.debug("Created FloatMany2oneC with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of FloatMany2oneC instances.")
    public Long countAllFloatMany2oneCs() {
        LOGGER.debug("counting FloatMany2oneCs");
        Long count = floatMany2oneCService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the FloatMany2oneC instance associated with the given id.")
    public FloatMany2oneC getFloatMany2oneC(@PathVariable(value = "id") Double id) throws EntityNotFoundException {
        LOGGER.debug("Getting FloatMany2oneC with id: {}", id);
        FloatMany2oneC instance = floatMany2oneCService.findById(id);
        LOGGER.debug("FloatMany2oneC details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the FloatMany2oneC instance associated with the given id.")
    public FloatMany2oneC editFloatMany2oneC(@PathVariable(value = "id") Double id, @RequestBody FloatMany2oneC instance) throws EntityNotFoundException {
        LOGGER.debug("Editing FloatMany2oneC with id: {}", instance.getFloatId());
        instance.setFloatId(id);
        instance = floatMany2oneCService.update(instance);
        LOGGER.debug("FloatMany2oneC details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the FloatMany2oneC instance associated with the given id.")
    public boolean deleteFloatMany2oneC(@PathVariable(value = "id") Double id) throws EntityNotFoundException {
        LOGGER.debug("Deleting FloatMany2oneC with id: {}", id);
        FloatMany2oneC deleted = floatMany2oneCService.delete(id);
        return deleted != null;
    }
}
