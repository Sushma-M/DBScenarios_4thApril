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
 * Service object for domain model class IntMany2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.IntMany2oneC
 */

public interface IntMany2oneCService {
   /**
	 * Creates a new intmany2onec.
	 * 
	 * @param created
	 *            The information of the created intmany2onec.
	 * @return The created intmany2onec.
	 */
	public IntMany2oneC create(IntMany2oneC created);

	/**
	 * Deletes a intmany2onec.
	 * 
	 * @param intmany2onecId
	 *            The id of the deleted intmany2onec.
	 * @return The deleted intmany2onec.
	 * @throws EntityNotFoundException
	 *             if no intmany2onec is found with the given id.
	 */
	public IntMany2oneC delete(Integer intmany2onecId) throws EntityNotFoundException;

	/**
	 * Finds all intmany2onecs.
	 * 
	 * @return A list of intmany2onecs.
	 */
	public Page<IntMany2oneC> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<IntMany2oneC> findAll(Pageable pageable);
	
	/**
	 * Finds intmany2onec by id.
	 * 
	 * @param id
	 *            The id of the wanted intmany2onec.
	 * @return The found intmany2onec. If no intmany2onec is found, this method returns
	 *         null.
	 */
	public IntMany2oneC findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a intmany2onec.
	 * 
	 * @param updated
	 *            The information of the updated intmany2onec.
	 * @return The updated intmany2onec.
	 * @throws EntityNotFoundException
	 *             if no intmany2onec is found with given id.
	 */
	public IntMany2oneC update(IntMany2oneC updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the intmany2onecs in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the intmany2onec.
	 */

	public long countAll();


    public Page<IntMany2oneC> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

