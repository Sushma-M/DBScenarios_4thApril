/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.dbscenarios_30mar.allo2m_o2o.service.CharMany2oneCService;
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
 * Controller object for domain model class CharMany2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.CharMany2oneC
 */
@RestController(value = "AllO2M_O2O.CharMany2oneCController")
@RequestMapping("/AllO2M_O2O/CharMany2oneC")
@Api(description = "Exposes APIs to work with CharMany2oneC resource.", value = "CharMany2oneCController")
public class CharMany2oneCController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CharMany2oneCController.class);

    @Autowired
    @Qualifier("AllO2M_O2O.CharMany2oneCService")
    private CharMany2oneCService charMany2oneCService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of CharMany2oneC instances matching the search criteria.")
    public Page<CharMany2oneC> findCharMany2oneCs(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering CharMany2oneCs list");
        return charMany2oneCService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of CharMany2oneC instances.")
    public Page<CharMany2oneC> getCharMany2oneCs(Pageable pageable) {
        LOGGER.debug("Rendering CharMany2oneCs list");
        return charMany2oneCService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setCharMany2oneCService(CharMany2oneCService service) {
        this.charMany2oneCService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new CharMany2oneC instance.")
    public CharMany2oneC createCharMany2oneC(@RequestBody CharMany2oneC instance) {
        LOGGER.debug("Create CharMany2oneC with information: {}", instance);
        instance = charMany2oneCService.create(instance);
        LOGGER.debug("Created CharMany2oneC with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of CharMany2oneC instances.")
    public Long countAllCharMany2oneCs() {
        LOGGER.debug("counting CharMany2oneCs");
        Long count = charMany2oneCService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the CharMany2oneC instance associated with the given id.")
    public CharMany2oneC getCharMany2oneC(@PathVariable(value = "id") Character id) throws EntityNotFoundException {
        LOGGER.debug("Getting CharMany2oneC with id: {}", id);
        CharMany2oneC instance = charMany2oneCService.findById(id);
        LOGGER.debug("CharMany2oneC details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the CharMany2oneC instance associated with the given id.")
    public CharMany2oneC editCharMany2oneC(@PathVariable(value = "id") Character id, @RequestBody CharMany2oneC instance) throws EntityNotFoundException {
        LOGGER.debug("Editing CharMany2oneC with id: {}", instance.getCharId());
        instance.setCharId(id);
        instance = charMany2oneCService.update(instance);
        LOGGER.debug("CharMany2oneC details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the CharMany2oneC instance associated with the given id.")
    public boolean deleteCharMany2oneC(@PathVariable(value = "id") Character id) throws EntityNotFoundException {
        LOGGER.debug("Deleting CharMany2oneC with id: {}", id);
        CharMany2oneC deleted = charMany2oneCService.delete(id);
        return deleted != null;
    }
}
