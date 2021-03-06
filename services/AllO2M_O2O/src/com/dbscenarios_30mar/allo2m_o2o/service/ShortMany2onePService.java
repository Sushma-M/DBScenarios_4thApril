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
 * Service object for domain model class ShortMany2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.ShortMany2oneP
 */

public interface ShortMany2onePService {
   /**
	 * Creates a new shortmany2onep.
	 * 
	 * @param created
	 *            The information of the created shortmany2onep.
	 * @return The created shortmany2onep.
	 */
	public ShortMany2oneP create(ShortMany2oneP created);

	/**
	 * Deletes a shortmany2onep.
	 * 
	 * @param shortmany2onepId
	 *            The id of the deleted shortmany2onep.
	 * @return The deleted shortmany2onep.
	 * @throws EntityNotFoundException
	 *             if no shortmany2onep is found with the given id.
	 */
	public ShortMany2oneP delete(Short shortmany2onepId) throws EntityNotFoundException;

	/**
	 * Finds all shortmany2oneps.
	 * 
	 * @return A list of shortmany2oneps.
	 */
	public Page<ShortMany2oneP> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<ShortMany2oneP> findAll(Pageable pageable);
	
	/**
	 * Finds shortmany2onep by id.
	 * 
	 * @param id
	 *            The id of the wanted shortmany2onep.
	 * @return The found shortmany2onep. If no shortmany2onep is found, this method returns
	 *         null.
	 */
	public ShortMany2oneP findById(Short id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a shortmany2onep.
	 * 
	 * @param updated
	 *            The information of the updated shortmany2onep.
	 * @return The updated shortmany2onep.
	 * @throws EntityNotFoundException
	 *             if no shortmany2onep is found with given id.
	 */
	public ShortMany2oneP update(ShortMany2oneP updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the shortmany2oneps in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the shortmany2onep.
	 */

	public long countAll();


    public Page<ShortMany2oneP> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

