/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.Date;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.dbscenarios_30mar.allo2m_o2o.*;

/**
 * Service object for domain model class TimeMany2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.TimeMany2oneP
 */

public interface TimeMany2onePService {
   /**
	 * Creates a new timemany2onep.
	 * 
	 * @param created
	 *            The information of the created timemany2onep.
	 * @return The created timemany2onep.
	 */
	public TimeMany2oneP create(TimeMany2oneP created);

	/**
	 * Deletes a timemany2onep.
	 * 
	 * @param timemany2onepId
	 *            The id of the deleted timemany2onep.
	 * @return The deleted timemany2onep.
	 * @throws EntityNotFoundException
	 *             if no timemany2onep is found with the given id.
	 */
	public TimeMany2oneP delete(Date timemany2onepId) throws EntityNotFoundException;

	/**
	 * Finds all timemany2oneps.
	 * 
	 * @return A list of timemany2oneps.
	 */
	public Page<TimeMany2oneP> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<TimeMany2oneP> findAll(Pageable pageable);
	
	/**
	 * Finds timemany2onep by id.
	 * 
	 * @param id
	 *            The id of the wanted timemany2onep.
	 * @return The found timemany2onep. If no timemany2onep is found, this method returns
	 *         null.
	 */
	public TimeMany2oneP findById(Date id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a timemany2onep.
	 * 
	 * @param updated
	 *            The information of the updated timemany2onep.
	 * @return The updated timemany2onep.
	 * @throws EntityNotFoundException
	 *             if no timemany2onep is found with given id.
	 */
	public TimeMany2oneP update(TimeMany2oneP updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the timemany2oneps in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the timemany2onep.
	 */

	public long countAll();


    public Page<TimeMany2oneP> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}
