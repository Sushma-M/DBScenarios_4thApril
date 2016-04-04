/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.dbscenarios_30mar.allo2m_o2o.service.ByteOne2onePService;
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
 * Controller object for domain model class ByteOne2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.ByteOne2oneP
 */
@RestController(value = "AllO2M_O2O.ByteOne2onePController")
@RequestMapping("/AllO2M_O2O/ByteOne2oneP")
@Api(description = "Exposes APIs to work with ByteOne2oneP resource.", value = "ByteOne2onePController")
public class ByteOne2onePController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ByteOne2onePController.class);

    @Autowired
    @Qualifier("AllO2M_O2O.ByteOne2onePService")
    private ByteOne2onePService byteOne2onePService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of ByteOne2oneP instances matching the search criteria.")
    public Page<ByteOne2oneP> findByteOne2onePs(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering ByteOne2onePs list");
        return byteOne2onePService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of ByteOne2oneP instances.")
    public Page<ByteOne2oneP> getByteOne2onePs(Pageable pageable) {
        LOGGER.debug("Rendering ByteOne2onePs list");
        return byteOne2onePService.findAll(pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setByteOne2onePService(ByteOne2onePService service) {
        this.byteOne2onePService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new ByteOne2oneP instance.")
    public ByteOne2oneP createByteOne2oneP(@RequestBody ByteOne2oneP instance) {
        LOGGER.debug("Create ByteOne2oneP with information: {}", instance);
        instance = byteOne2onePService.create(instance);
        LOGGER.debug("Created ByteOne2oneP with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of ByteOne2oneP instances.")
    public Long countAllByteOne2onePs() {
        LOGGER.debug("counting ByteOne2onePs");
        Long count = byteOne2onePService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the ByteOne2oneP instance associated with the given id.")
    public ByteOne2oneP getByteOne2oneP(@PathVariable(value = "id") Byte id) throws EntityNotFoundException {
        LOGGER.debug("Getting ByteOne2oneP with id: {}", id);
        ByteOne2oneP instance = byteOne2onePService.findById(id);
        LOGGER.debug("ByteOne2oneP details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the ByteOne2oneP instance associated with the given id.")
    public ByteOne2oneP editByteOne2oneP(@PathVariable(value = "id") Byte id, @RequestBody ByteOne2oneP instance) throws EntityNotFoundException {
        LOGGER.debug("Editing ByteOne2oneP with id: {}", instance.getByteId());
        instance.setByteId(id);
        instance = byteOne2onePService.update(instance);
        LOGGER.debug("ByteOne2oneP details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the ByteOne2oneP instance associated with the given id.")
    public boolean deleteByteOne2oneP(@PathVariable(value = "id") Byte id) throws EntityNotFoundException {
        LOGGER.debug("Deleting ByteOne2oneP with id: {}", id);
        ByteOne2oneP deleted = byteOne2onePService.delete(id);
        return deleted != null;
    }
}