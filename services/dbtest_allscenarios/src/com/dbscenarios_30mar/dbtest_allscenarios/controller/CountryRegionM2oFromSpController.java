/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.dbtest_allscenarios.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import com.dbscenarios_30mar.dbtest_allscenarios.service.CountryRegionM2oFromSpService;
import com.dbscenarios_30mar.dbtest_allscenarios.service.StateProvinceM2oAddressService;


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
 * Controller object for domain model class CountryRegionM2oFromSp.
 * @see com.dbscenarios_30mar.dbtest_allscenarios.CountryRegionM2oFromSp
 */

@RestController(value = "Dbtest_allscenarios.CountryRegionM2oFromSpController")
@Api(value = "/dbtest_allscenarios/CountryRegionM2oFromSp", description = "Exposes APIs to work with CountryRegionM2oFromSp resource.")
@RequestMapping("/dbtest_allscenarios/CountryRegionM2oFromSp")
public class CountryRegionM2oFromSpController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryRegionM2oFromSpController.class);

	@Autowired
	@Qualifier("dbtest_allscenarios.CountryRegionM2oFromSpService")
	private CountryRegionM2oFromSpService countryRegionM2oFromSpService;


    @Autowired
    @Qualifier("dbtest_allscenarios.StateProvinceM2oAddressService")
    private StateProvinceM2oAddressService stateProvinceM2oAddressService;


	@RequestMapping(value = "/search", method = RequestMethod.POST)
	@ApiOperation(value = "Returns the list of CountryRegionM2oFromSp instances matching the search criteria.")
	public Page<CountryRegionM2oFromSp> findCountryRegionM2oFromSps( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
		LOGGER.debug("Rendering CountryRegionM2oFromSps list");
		return countryRegionM2oFromSpService.findAll(queryFilters, pageable);
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the list of CountryRegionM2oFromSp instances.")
	public Page<CountryRegionM2oFromSp> getCountryRegionM2oFromSps(Pageable pageable) {
		LOGGER.debug("Rendering CountryRegionM2oFromSps list");
		return countryRegionM2oFromSpService.findAll(pageable);
	}

	@RequestMapping(value = "/count", method = RequestMethod.GET)
	@ApiOperation(value = "Returns the total count of CountryRegionM2oFromSp instances.")
	public Long countAllCountryRegionM2oFromSps() {
		LOGGER.debug("counting CountryRegionM2oFromSps");
		Long count = countryRegionM2oFromSpService.countAll();
		return count;
	}


    @RequestMapping(value = "/{id:.+}", method = RequestMethod.GET)
    @ApiOperation(value = "Returns the CountryRegionM2oFromSp instance associated with the given id.")
    public CountryRegionM2oFromSp getCountryRegionM2oFromSp(@PathVariable("id") String id) throws EntityNotFoundException {
        LOGGER.debug("Getting CountryRegionM2oFromSp with id: {}" , id);
        CountryRegionM2oFromSp instance = countryRegionM2oFromSpService.findById(id);
        LOGGER.debug("CountryRegionM2oFromSp details with id: {}" , instance);
        return instance;
    }
    @RequestMapping(value = "/{id:.+}", method = RequestMethod.DELETE)
    @ApiOperation(value = "Deletes the CountryRegionM2oFromSp instance associated with the given id.")
    public boolean deleteCountryRegionM2oFromSp(@PathVariable("id") String id) throws EntityNotFoundException {
        LOGGER.debug("Deleting CountryRegionM2oFromSp with id: {}" , id);
        CountryRegionM2oFromSp deleted = countryRegionM2oFromSpService.delete(id);
        return deleted != null;
    }

    @RequestMapping(value = "/{id:.+}", method = RequestMethod.PUT)
    @ApiOperation(value = "Updates the CountryRegionM2oFromSp instance associated with the given id.")
    public CountryRegionM2oFromSp editCountryRegionM2oFromSp(@PathVariable("id") String id, @RequestBody CountryRegionM2oFromSp instance) throws EntityNotFoundException {
        LOGGER.debug("Editing CountryRegionM2oFromSp with id: {}" , instance.getCountryRegionCode());
        instance.setCountryRegionCode(id);
        instance = countryRegionM2oFromSpService.update(instance);
        LOGGER.debug("CountryRegionM2oFromSp details with id: {}" , instance);
        return instance;
    }


    @RequestMapping(value="/{id:.+}/stateProvinceM2oAddresses", method=RequestMethod.GET)
    @ApiOperation(value = "Gets the stateProvinceM2oAddresses instance associated with the given id.")
     public Page<StateProvinceM2oAddress> findAssociatedstateProvinceM2oAddresses(Pageable pageable, @PathVariable("id") String id){
        LOGGER.debug("Fetching all associated stateProvinceM2oAddresses");
        return stateProvinceM2oAddressService.findAssociatedValues(id,"countryRegionM2oFromSp","countryRegionCode", pageable);
   }



	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ApiOperation(value = "Creates a new CountryRegionM2oFromSp instance.")
	public CountryRegionM2oFromSp createCountryRegionM2oFromSp(@RequestBody CountryRegionM2oFromSp instance) {
		LOGGER.debug("Create CountryRegionM2oFromSp with information: {}" , instance);
		instance = countryRegionM2oFromSpService.create(instance);
		LOGGER.debug("Created CountryRegionM2oFromSp with information: {}" , instance);
	    return instance;
	}

	/**
	 * This setter method should only be used by unit tests
	 * 
	 * @param service
	 */
	protected void setCountryRegionM2oFromSpService(CountryRegionM2oFromSpService service) {
		this.countryRegionM2oFromSpService = service;
	}
}

