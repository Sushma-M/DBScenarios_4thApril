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
 * Service object for domain model class DoubleOne2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.DoubleOne2oneC
 */

public interface DoubleOne2oneCService {
   /**
	 * Creates a new doubleone2onec.
	 * 
	 * @param created
	 *            The information of the created doubleone2onec.
	 * @return The created doubleone2onec.
	 */
	public DoubleOne2oneC create(DoubleOne2oneC created);

	/**
	 * Deletes a doubleone2onec.
	 * 
	 * @param doubleone2onecId
	 *            The id of the deleted doubleone2onec.
	 * @return The deleted doubleone2onec.
	 * @throws EntityNotFoundException
	 *             if no doubleone2onec is found with the given id.
	 */
	public DoubleOne2oneC delete(Double doubleone2onecId) throws EntityNotFoundException;

	/**
	 * Finds all doubleone2onecs.
	 * 
	 * @return A list of doubleone2onecs.
	 */
	public Page<DoubleOne2oneC> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<DoubleOne2oneC> findAll(Pageable pageable);
	
	/**
	 * Finds doubleone2onec by id.
	 * 
	 * @param id
	 *            The id of the wanted doubleone2onec.
	 * @return The found doubleone2onec. If no doubleone2onec is found, this method returns
	 *         null.
	 */
	public DoubleOne2oneC findById(Double id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a doubleone2onec.
	 * 
	 * @param updated
	 *            The information of the updated doubleone2onec.
	 * @return The updated doubleone2onec.
	 * @throws EntityNotFoundException
	 *             if no doubleone2onec is found with given id.
	 */
	public DoubleOne2oneC update(DoubleOne2oneC updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the doubleone2onecs in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the doubleone2onec.
	 */

	public long countAll();


    public Page<DoubleOne2oneC> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

