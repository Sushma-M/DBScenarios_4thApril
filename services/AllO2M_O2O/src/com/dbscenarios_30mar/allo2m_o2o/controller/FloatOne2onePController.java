/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.dbscenarios_30mar.allo2m_o2o.service.FloatOne2onePService;
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
 * Controller object for domain model class FloatOne2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.FloatOne2oneP
 */
@RestController(value = "AllO2M_O2O.FloatOne2onePController")
@RequestMapping("/AllO2M_O2O/FloatOne2oneP")
@Api(description = "Exposes APIs to work with FloatOne2oneP resource.", value = "FloatOne2onePController")
public class FloatOne2onePController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FloatOne2onePController.class);

    @Autowired
    @Qualifier("AllO2M_O2O.FloatOne2onePService")
    private FloatOne2onePService floatOne2onePService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of FloatOne2oneP instances matching the search criteria.")
    public Page<FloatOne2oneP> findFloatOne2onePs(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering FloatOne2onePs list");
        return floatOne2onePService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of FloatOne2oneP instances.")
    public Page<FloatOne2oneP> getFloatOne2onePs(Pageable pageable) {
        LOGGER.debug("Rendering FloatOne2onePs list");
        return floatOne2onePService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setFloatOne2onePService(FloatOne2onePService service) {
        this.floatOne2onePService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new FloatOne2oneP instance.")
    public FloatOne2oneP createFloatOne2oneP(@RequestBody FloatOne2oneP instance) {
        LOGGER.debug("Create FloatOne2oneP with information: {}", instance);
        instance = floatOne2onePService.create(instance);
        LOGGER.debug("Created FloatOne2oneP with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of FloatOne2oneP instances.")
    public Long countAllFloatOne2onePs() {
        LOGGER.debug("counting FloatOne2onePs");
        Long count = floatOne2onePService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the FloatOne2oneP instance associated with the given id.")
    public FloatOne2oneP getFloatOne2oneP(@PathVariable(value = "id") Double id) throws EntityNotFoundException {
        LOGGER.debug("Getting FloatOne2oneP with id: {}", id);
        FloatOne2oneP instance = floatOne2onePService.findById(id);
        LOGGER.debug("FloatOne2oneP details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the FloatOne2oneP instance associated with the given id.")
    public FloatOne2oneP editFloatOne2oneP(@PathVariable(value = "id") Double id, @RequestBody FloatOne2oneP instance) throws EntityNotFoundException {
        LOGGER.debug("Editing FloatOne2oneP with id: {}", instance.getFloatId());
        instance.setFloatId(id);
        instance = floatOne2onePService.update(instance);
        LOGGER.debug("FloatOne2oneP details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the FloatOne2oneP instance associated with the given id.")
    public boolean deleteFloatOne2oneP(@PathVariable(value = "id") Double id) throws EntityNotFoundException {
        LOGGER.debug("Deleting FloatOne2oneP with id: {}", id);
        FloatOne2oneP deleted = floatOne2onePService.delete(id);
        return deleted != null;
    }
}
