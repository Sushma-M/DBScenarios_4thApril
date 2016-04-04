/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.dbscenarios_30mar.allo2m_o2o.service.ShortMany2oneCService;
import com.dbscenarios_30mar.allo2m_o2o.service.ShortMany2onePService;
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
 * Controller object for domain model class ShortMany2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.ShortMany2oneP
 */
@RestController(value = "AllO2M_O2O.ShortMany2onePController")
@RequestMapping("/AllO2M_O2O/ShortMany2oneP")
@Api(description = "Exposes APIs to work with ShortMany2oneP resource.", value = "ShortMany2onePController")
public class ShortMany2onePController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShortMany2onePController.class);

    @Autowired
    @Qualifier("AllO2M_O2O.ShortMany2onePService")
    private ShortMany2onePService shortMany2onePService;

    @Autowired
    @Qualifier("AllO2M_O2O.ShortMany2oneCService")
    private ShortMany2oneCService shortMany2oneCService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of ShortMany2oneP instances matching the search criteria.")
    public Page<ShortMany2oneP> findShortMany2onePs(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering ShortMany2onePs list");
        return shortMany2onePService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of ShortMany2oneP instances.")
    public Page<ShortMany2oneP> getShortMany2onePs(Pageable pageable) {
        LOGGER.debug("Rendering ShortMany2onePs list");
        return shortMany2onePService.findAll(pageable);
    }

    @RequestMapping(value = "/{id:.+}/shortMany2oneCs", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the shortMany2oneCs instance associated with the given id.")
    public Page<ShortMany2oneC> findAssociatedshortMany2oneCs(Pageable pageable, @PathVariable("id") Short id) {
        LOGGER.debug("Fetching all associated shortMany2oneCs");
        return shortMany2oneCService.findAssociatedValues(id, "shortMany2oneP", "shortId", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setShortMany2onePService(ShortMany2onePService service) {
        this.shortMany2onePService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new ShortMany2oneP instance.")
    public ShortMany2oneP createShortMany2oneP(@RequestBody ShortMany2oneP instance) {
        LOGGER.debug("Create ShortMany2oneP with information: {}", instance);
        instance = shortMany2onePService.create(instance);
        LOGGER.debug("Created ShortMany2oneP with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of ShortMany2oneP instances.")
    public Long countAllShortMany2onePs() {
        LOGGER.debug("counting ShortMany2onePs");
        Long count = shortMany2onePService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the ShortMany2oneP instance associated with the given id.")
    public ShortMany2oneP getShortMany2oneP(@PathVariable(value = "id") Short id) throws EntityNotFoundException {
        LOGGER.debug("Getting ShortMany2oneP with id: {}", id);
        ShortMany2oneP instance = shortMany2onePService.findById(id);
        LOGGER.debug("ShortMany2oneP details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the ShortMany2oneP instance associated with the given id.")
    public ShortMany2oneP editShortMany2oneP(@PathVariable(value = "id") Short id, @RequestBody ShortMany2oneP instance) throws EntityNotFoundException {
        LOGGER.debug("Editing ShortMany2oneP with id: {}", instance.getShortId());
        instance.setShortId(id);
        instance = shortMany2onePService.update(instance);
        LOGGER.debug("ShortMany2oneP details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the ShortMany2oneP instance associated with the given id.")
    public boolean deleteShortMany2oneP(@PathVariable(value = "id") Short id) throws EntityNotFoundException {
        LOGGER.debug("Deleting ShortMany2oneP with id: {}", id);
        ShortMany2oneP deleted = shortMany2onePService.delete(id);
        return deleted != null;
    }
}