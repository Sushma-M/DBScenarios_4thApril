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
 * Service object for domain model class ByteMany2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.ByteMany2oneP
 */

public interface ByteMany2onePService {
   /**
	 * Creates a new bytemany2onep.
	 * 
	 * @param created
	 *            The information of the created bytemany2onep.
	 * @return The created bytemany2onep.
	 */
	public ByteMany2oneP create(ByteMany2oneP created);

	/**
	 * Deletes a bytemany2onep.
	 * 
	 * @param bytemany2onepId
	 *            The id of the deleted bytemany2onep.
	 * @return The deleted bytemany2onep.
	 * @throws EntityNotFoundException
	 *             if no bytemany2onep is found with the given id.
	 */
	public ByteMany2oneP delete(Byte bytemany2onepId) throws EntityNotFoundException;

	/**
	 * Finds all bytemany2oneps.
	 * 
	 * @return A list of bytemany2oneps.
	 */
	public Page<ByteMany2oneP> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<ByteMany2oneP> findAll(Pageable pageable);
	
	/**
	 * Finds bytemany2onep by id.
	 * 
	 * @param id
	 *            The id of the wanted bytemany2onep.
	 * @return The found bytemany2onep. If no bytemany2onep is found, this method returns
	 *         null.
	 */
	public ByteMany2oneP findById(Byte id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a bytemany2onep.
	 * 
	 * @param updated
	 *            The information of the updated bytemany2onep.
	 * @return The updated bytemany2onep.
	 * @throws EntityNotFoundException
	 *             if no bytemany2onep is found with given id.
	 */
	public ByteMany2oneP update(ByteMany2oneP updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the bytemany2oneps in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the bytemany2onep.
	 */

	public long countAll();


    public Page<ByteMany2oneP> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}
