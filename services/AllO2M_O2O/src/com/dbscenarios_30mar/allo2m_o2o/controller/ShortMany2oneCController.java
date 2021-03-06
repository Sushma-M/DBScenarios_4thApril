/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.dbscenarios_30mar.allo2m_o2o.service.ShortMany2oneCService;
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
 * Controller object for domain model class ShortMany2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.ShortMany2oneC
 */
@RestController(value = "AllO2M_O2O.ShortMany2oneCController")
@RequestMapping("/AllO2M_O2O/ShortMany2oneC")
@Api(description = "Exposes APIs to work with ShortMany2oneC resource.", value = "ShortMany2oneCController")
public class ShortMany2oneCController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShortMany2oneCController.class);

    @Autowired
    @Qualifier("AllO2M_O2O.ShortMany2oneCService")
    private ShortMany2oneCService shortMany2oneCService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of ShortMany2oneC instances matching the search criteria.")
    public Page<ShortMany2oneC> findShortMany2oneCs(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering ShortMany2oneCs list");
        return shortMany2oneCService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of ShortMany2oneC instances.")
    public Page<ShortMany2oneC> getShortMany2oneCs(Pageable pageable) {
        LOGGER.debug("Rendering ShortMany2oneCs list");
        return shortMany2oneCService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setShortMany2oneCService(ShortMany2oneCService service) {
        this.shortMany2oneCService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new ShortMany2oneC instance.")
    public ShortMany2oneC createShortMany2oneC(@RequestBody ShortMany2oneC instance) {
        LOGGER.debug("Create ShortMany2oneC with information: {}", instance);
        instance = shortMany2oneCService.create(instance);
        LOGGER.debug("Created ShortMany2oneC with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of ShortMany2oneC instances.")
    public Long countAllShortMany2oneCs() {
        LOGGER.debug("counting ShortMany2oneCs");
        Long count = shortMany2oneCService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the ShortMany2oneC instance associated with the given id.")
    public ShortMany2oneC getShortMany2oneC(@PathVariable(value = "id") Short id) throws EntityNotFoundException {
        LOGGER.debug("Getting ShortMany2oneC with id: {}", id);
        ShortMany2oneC instance = shortMany2oneCService.findById(id);
        LOGGER.debug("ShortMany2oneC details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the ShortMany2oneC instance associated with the given id.")
    public ShortMany2oneC editShortMany2oneC(@PathVariable(value = "id") Short id, @RequestBody ShortMany2oneC instance) throws EntityNotFoundException {
        LOGGER.debug("Editing ShortMany2oneC with id: {}", instance.getShortId());
        instance.setShortId(id);
        instance = shortMany2oneCService.update(instance);
        LOGGER.debug("ShortMany2oneC details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the ShortMany2oneC instance associated with the given id.")
    public boolean deleteShortMany2oneC(@PathVariable(value = "id") Short id) throws EntityNotFoundException {
        LOGGER.debug("Deleting ShortMany2oneC with id: {}", id);
        ShortMany2oneC deleted = shortMany2oneCService.delete(id);
        return deleted != null;
    }
}
