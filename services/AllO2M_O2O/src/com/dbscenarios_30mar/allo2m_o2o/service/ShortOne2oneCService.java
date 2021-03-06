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
 * Service object for domain model class ShortOne2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.ShortOne2oneC
 */

public interface ShortOne2oneCService {
   /**
	 * Creates a new shortone2onec.
	 * 
	 * @param created
	 *            The information of the created shortone2onec.
	 * @return The created shortone2onec.
	 */
	public ShortOne2oneC create(ShortOne2oneC created);

	/**
	 * Deletes a shortone2onec.
	 * 
	 * @param shortone2onecId
	 *            The id of the deleted shortone2onec.
	 * @return The deleted shortone2onec.
	 * @throws EntityNotFoundException
	 *             if no shortone2onec is found with the given id.
	 */
	public ShortOne2oneC delete(Short shortone2onecId) throws EntityNotFoundException;

	/**
	 * Finds all shortone2onecs.
	 * 
	 * @return A list of shortone2onecs.
	 */
	public Page<ShortOne2oneC> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<ShortOne2oneC> findAll(Pageable pageable);
	
	/**
	 * Finds shortone2onec by id.
	 * 
	 * @param id
	 *            The id of the wanted shortone2onec.
	 * @return The found shortone2onec. If no shortone2onec is found, this method returns
	 *         null.
	 */
	public ShortOne2oneC findById(Short id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a shortone2onec.
	 * 
	 * @param updated
	 *            The information of the updated shortone2onec.
	 * @return The updated shortone2onec.
	 * @throws EntityNotFoundException
	 *             if no shortone2onec is found with given id.
	 */
	public ShortOne2oneC update(ShortOne2oneC updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the shortone2onecs in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the shortone2onec.
	 */

	public long countAll();


    public Page<ShortOne2oneC> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

