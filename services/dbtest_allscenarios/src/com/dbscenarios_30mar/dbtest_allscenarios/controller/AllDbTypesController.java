/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.dbtest_allscenarios.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.dbscenarios_30mar.dbtest_allscenarios.service.AllDbTypesService;


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

import com.dbscenarios_30mar.dbtest_allscenarios.*;
import com.dbscenarios_30mar.dbtest_allscenarios.service.*;


/**
 * Controller object for domain model class AllDbTypes.
 * @see com.dbscenarios_30mar.dbtest_allscenarios.AllDbTypes
 */

@RestController(value = "Dbtest_allscenarios.AllDbTypesController")
@Api(value = "/dbtest_allscenarios/AllDbTypes", description = "Exposes APIs to work with AllDbTypes resource.")
@RequestMapping("/dbtest_allscenarios/AllDbTypes")
public class AllDbTypesController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AllDbTypesController.class);

	@Autowired
	@Qualifier("dbtest_allscenarios.AllDbTypesService")
	private AllDbTypesService allDbTypesService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of AllDbTypes instances matching the search criteria.")
	public Page<AllDbTypes> findAllDbTypess( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering AllDbTypess list");
		return allDbTypesService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of AllDbTypes instances.")
	public Page<AllDbTypes> getAllDbTypess(Pageable pageable) {
		LOGGER.debug("Rendering AllDbTypess list");
		return allDbTypesService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of AllDbTypes instances.")
	public Long countAllAllDbTypess() {
		LOGGER.debug("counting AllDbTypess");
		Long count = allDbTypesService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the AllDbTypes instance associated with the given id.")
    public AllDbTypes getAllDbTypes(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Getting AllDbTypes with id: {}" , id);
        AllDbTypes instance = allDbTypesService.findById(id);
        LOGGER.debug("AllDbTypes details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the AllDbTypes instance associated with the given id.")
    public boolean deleteAllDbTypes(@PathVariable("id") Integer id) throws EntityNotFoundException {
        LOGGER.debug("Deleting AllDbTypes with id: {}" , id);
        AllDbTypes deleted = allDbTypesService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the AllDbTypes instance associated with the given id.")
    public AllDbTypes editAllDbTypes(@PathVariable("id") Integer id, @RequestBody AllDbTypes instance) throws EntityNotFoundException {
        LOGGER.debug("Editing AllDbTypes with id: {}" , instance.getId());
        instance.setId(id);
        instance = allDbTypesService.update(instance);
        LOGGER.debug("AllDbTypes details with id: {}" , instance);
        return instance;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.POST, consumes = {"multipart/form-data"})
    @ApiOperation(value = "Updates the AllDbTypes instance associated with the given id.This API should be used when AllDbTypes instance fields that require multipart data.")
    public AllDbTypes editAllDbTypes(@PathVariable("id") Integer id, MultipartHttpServletRequest multipartHttpServletRequest) throws EntityNotFoundException {
        AllDbTypes newalldbtypes = WMMultipartUtils.toObject(multipartHttpServletRequest,AllDbTypes.class,"dbtest_allscenarios");
        newalldbtypes.setId(id);
        AllDbTypes oldalldbtypes = allDbTypesService.findById(id);
        WMMultipartUtils.updateLobsContent(oldalldbtypes,newalldbtypes);
        LOGGER.debug("Updating alldbtypes with information: {}" , newalldbtypes);
        return allDbTypesService.update(newalldbtypes);
    }
    @RequestMapping(value = "/{id}/content/{fieldName}", method = RequestMethod.GET, produces="application/octet-stream")
    @ApiOperation(value = "Retrieves content for the given BLOB field in AllDbTypes instance" )
    public DownloadResponse getAllDbTypesBLOBContent(@PathVariable("id") Integer id,@PathVariable("fieldName") String fieldName,HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @RequestParam( value="download", defaultValue = "false") boolean download) {
        LOGGER.debug("Retrieves content for the given BLOB field {} in AllDbTypes instance" , fieldName);
        if(!WMRuntimeUtils.isLob(AllDbTypes.class,fieldName)) {
            throw new TypeMismatchException("Given field " + fieldName + " is not a valid BLOB type");
        }
        AllDbTypes instance = allDbTypesService.findById(id);
        return WMMultipartUtils.buildDownloadResponseForBlob(instance, fieldName, httpServletRequest, download);
    }



	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new AllDbTypes instance.")
	public AllDbTypes createAllDbTypes(@RequestBody AllDbTypes instance) {
		LOGGER.debug("Create AllDbTypes with information: {}" , instance);
		instance = allDbTypesService.create(instance);
		LOGGER.debug("Created AllDbTypes with information: {}" , instance);
	    return instance;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST, consumes = {"multipart/form-data"})
	@ApiOperation(value = "Creates a new AllDbTypes instance.This API should be used when the AllDbTypes instance has fields that requires multipart data.")
    public AllDbTypes createAllDbTypes(MultipartHttpServletRequest multipartHttpServletRequest) {
    	AllDbTypes alldbtypes = WMMultipartUtils.toObject(multipartHttpServletRequest,AllDbTypes.class,"dbtest_allscenarios");
        LOGGER.debug("Creating a new alldbtypes with information: {}" , alldbtypes);
        return allDbTypesService.create(alldbtypes);
    }

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setAllDbTypesService(AllDbTypesService service) {
		this.allDbTypesService = service;
	}
}
