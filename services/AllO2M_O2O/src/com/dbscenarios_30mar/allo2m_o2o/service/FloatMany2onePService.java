/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.dbscenarios_30mar.allo2m_o2o.*;

/**
 * Service object for domain model class FloatMany2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.FloatMany2oneP
 */

public interface FloatMany2onePService {
   /**
	 * Creates a new floatmany2onep.
	 * 
	 * @param created
	 *            The information of the created floatmany2onep.
	 * @return The created floatmany2onep.
	 */
	public FloatMany2oneP create(FloatMany2oneP created);

	/**
	 * Deletes a floatmany2onep.
	 * 
	 * @param floatmany2onepId
	 *            The id of the deleted floatmany2onep.
	 * @return The deleted floatmany2onep.
	 * @throws EntityNotFoundException
	 *             if no floatmany2onep is found with the given id.
	 */
	public FloatMany2oneP delete(Double floatmany2onepId) throws EntityNotFoundException;

	/**
	 * Finds all floatmany2oneps.
	 * 
	 * @return A list of floatmany2oneps.
	 */
	public Page<FloatMany2oneP> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<FloatMany2oneP> findAll(Pageable pageable);
	
	/**
	 * Finds floatmany2onep by id.
	 * 
	 * @param id
	 *            The id of the wanted floatmany2onep.
	 * @return The found floatmany2onep. If no floatmany2onep is found, this method returns
	 *         null.
	 */
	public FloatMany2oneP findById(Double id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a floatmany2onep.
	 * 
	 * @param updated
	 *            The information of the updated floatmany2onep.
	 * @return The updated floatmany2onep.
	 * @throws EntityNotFoundException
	 *             if no floatmany2onep is found with given id.
	 */
	public FloatMany2oneP update(FloatMany2oneP updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the floatmany2oneps in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the floatmany2onep.
	 */

	public long countAll();


    public Page<FloatMany2oneP> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

