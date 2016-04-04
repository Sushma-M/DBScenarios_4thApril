/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/
import com.dbscenarios_30mar.allo2m_o2o.service.ByteMany2oneCService;
import com.dbscenarios_30mar.allo2m_o2o.service.ByteMany2onePService;
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
 * Controller object for domain model class ByteMany2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.ByteMany2oneP
 */
@RestController(value = "AllO2M_O2O.ByteMany2onePController")
@RequestMapping("/AllO2M_O2O/ByteMany2oneP")
@Api(description = "Exposes APIs to work with ByteMany2oneP resource.", value = "ByteMany2onePController")
public class ByteMany2onePController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ByteMany2onePController.class);

    @Autowired
    @Qualifier("AllO2M_O2O.ByteMany2onePService")
    private ByteMany2onePService byteMany2onePService;

    @Autowired
    @Qualifier("AllO2M_O2O.ByteMany2oneCService")
    private ByteMany2oneCService byteMany2oneCService;

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ApiOperation(value = "Returns the list of ByteMany2oneP instances matching the search criteria.")
    public Page<ByteMany2oneP> findByteMany2onePs(Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering ByteMany2onePs list");
        return byteMany2onePService.findAll(queryFilters, pageable);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the list of ByteMany2oneP instances.")
    public Page<ByteMany2oneP> getByteMany2onePs(Pageable pageable) {
        LOGGER.debug("Rendering ByteMany2onePs list");
        return byteMany2onePService.findAll(pageable);
    }

    @RequestMapping(value = "/{id:.+}/byteMany2oneCs", method = RequestMethod.GET)
    @ApiOperation(value = "Gets the byteMany2oneCs instance associated with the given id.")
    public Page<ByteMany2oneC> findAssociatedbyteMany2oneCs(Pageable pageable, @PathVariable("id") Byte id) {
        LOGGER.debug("Fetching all associated byteMany2oneCs");
        return byteMany2oneCService.findAssociatedValues(id, "byteMany2oneP", "byteId", pageable);
    }

    /**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
    protected void setByteMany2onePService(ByteMany2onePService service) {
        this.byteMany2onePService = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Creates a new ByteMany2oneP instance.")
    public ByteMany2oneP createByteMany2oneP(@RequestBody ByteMany2oneP instance) {
        LOGGER.debug("Create ByteMany2oneP with information: {}", instance);
        instance = byteMany2onePService.create(instance);
        LOGGER.debug("Created ByteMany2oneP with information: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the total count of ByteMany2oneP instances.")
    public Long countAllByteMany2onePs() {
        LOGGER.debug("counting ByteMany2onePs");
        Long count = byteMany2onePService.countAll();
        return count;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Returns the ByteMany2oneP instance associated with the given id.")
    public ByteMany2oneP getByteMany2oneP(@PathVariable(value = "id") Byte id) throws EntityNotFoundException {
        LOGGER.debug("Getting ByteMany2oneP with id: {}", id);
        ByteMany2oneP instance = byteMany2onePService.findById(id);
        LOGGER.debug("ByteMany2oneP details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Updates the ByteMany2oneP instance associated with the given id.")
    public ByteMany2oneP editByteMany2oneP(@PathVariable(value = "id") Byte id, @RequestBody ByteMany2oneP instance) throws EntityNotFoundException {
        LOGGER.debug("Editing ByteMany2oneP with id: {}", instance.getByteId());
        instance.setByteId(id);
        instance = byteMany2onePService.update(instance);
        LOGGER.debug("ByteMany2oneP details with id: {}", instance);
        return instance;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Deletes the ByteMany2oneP instance associated with the given id.")
    public boolean deleteByteMany2oneP(@PathVariable(value = "id") Byte id) throws EntityNotFoundException {
        LOGGER.debug("Deleting ByteMany2oneP with id: {}", id);
        ByteMany2oneP deleted = byteMany2onePService.delete(id);
        return deleted != null;
    }
}
