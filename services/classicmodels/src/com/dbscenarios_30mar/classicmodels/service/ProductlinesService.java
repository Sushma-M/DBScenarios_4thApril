/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.classicmodels.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.dbscenarios_30mar.classicmodels.*;

/**
 * Service object for domain model class Productlines.
 * @see com.dbscenarios_30mar.classicmodels.Productlines
 */

public interface ProductlinesService {
   /**
	 * Creates a new productlines.
	 * 
	 * @param created
	 *            The information of the created productlines.
	 * @return The created productlines.
	 */
	public Productlines create(Productlines created);

	/**
	 * Deletes a productlines.
	 * 
	 * @param productlinesId
	 *            The id of the deleted productlines.
	 * @return The deleted productlines.
	 * @throws EntityNotFoundException
	 *             if no productlines is found with the given id.
	 */
	public Productlines delete(String productlinesId) throws EntityNotFoundException;

	/**
	 * Finds all productliness.
	 * 
	 * @return A list of productliness.
	 */
	public Page<Productlines> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Productlines> findAll(Pageable pageable);
	
	/**
	 * Finds productlines by id.
	 * 
	 * @param id
	 *            The id of the wanted productlines.
	 * @return The found productlines. If no productlines is found, this method returns
	 *         null.
	 */
	public Productlines findById(String id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a productlines.
	 * 
	 * @param updated
	 *            The information of the updated productlines.
	 * @return The updated productlines.
	 * @throws EntityNotFoundException
	 *             if no productlines is found with given id.
	 */
	public Productlines update(Productlines updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the productliness in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the productlines.
	 */

	public long countAll();


    public Page<Productlines> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

