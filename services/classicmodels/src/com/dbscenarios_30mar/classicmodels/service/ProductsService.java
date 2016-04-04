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
 * Service object for domain model class Products.
 * @see com.dbscenarios_30mar.classicmodels.Products
 */

public interface ProductsService {
   /**
	 * Creates a new products.
	 * 
	 * @param created
	 *            The information of the created products.
	 * @return The created products.
	 */
	public Products create(Products created);

	/**
	 * Deletes a products.
	 * 
	 * @param productsId
	 *            The id of the deleted products.
	 * @return The deleted products.
	 * @throws EntityNotFoundException
	 *             if no products is found with the given id.
	 */
	public Products delete(String productsId) throws EntityNotFoundException;

	/**
	 * Finds all productss.
	 * 
	 * @return A list of productss.
	 */
	public Page<Products> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Products> findAll(Pageable pageable);
	
	/**
	 * Finds products by id.
	 * 
	 * @param id
	 *            The id of the wanted products.
	 * @return The found products. If no products is found, this method returns
	 *         null.
	 */
	public Products findById(String id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a products.
	 * 
	 * @param updated
	 *            The information of the updated products.
	 * @return The updated products.
	 * @throws EntityNotFoundException
	 *             if no products is found with given id.
	 */
	public Products update(Products updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the productss in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the products.
	 */

	public long countAll();


    public Page<Products> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

