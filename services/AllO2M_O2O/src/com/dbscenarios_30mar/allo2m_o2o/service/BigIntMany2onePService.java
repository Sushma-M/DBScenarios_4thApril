/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.math.BigInteger;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.dbscenarios_30mar.allo2m_o2o.*;

/**
 * Service object for domain model class BigIntMany2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.BigIntMany2oneP
 */

public interface BigIntMany2onePService {
   /**
	 * Creates a new bigintmany2onep.
	 * 
	 * @param created
	 *            The information of the created bigintmany2onep.
	 * @return The created bigintmany2onep.
	 */
	public BigIntMany2oneP create(BigIntMany2oneP created);

	/**
	 * Deletes a bigintmany2onep.
	 * 
	 * @param bigintmany2onepId
	 *            The id of the deleted bigintmany2onep.
	 * @return The deleted bigintmany2onep.
	 * @throws EntityNotFoundException
	 *             if no bigintmany2onep is found with the given id.
	 */
	public BigIntMany2oneP delete(BigInteger bigintmany2onepId) throws EntityNotFoundException;

	/**
	 * Finds all bigintmany2oneps.
	 * 
	 * @return A list of bigintmany2oneps.
	 */
	public Page<BigIntMany2oneP> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<BigIntMany2oneP> findAll(Pageable pageable);
	
	/**
	 * Finds bigintmany2onep by id.
	 * 
	 * @param id
	 *            The id of the wanted bigintmany2onep.
	 * @return The found bigintmany2onep. If no bigintmany2onep is found, this method returns
	 *         null.
	 */
	public BigIntMany2oneP findById(BigInteger id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a bigintmany2onep.
	 * 
	 * @param updated
	 *            The information of the updated bigintmany2onep.
	 * @return The updated bigintmany2onep.
	 * @throws EntityNotFoundException
	 *             if no bigintmany2onep is found with given id.
	 */
	public BigIntMany2oneP update(BigIntMany2oneP updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the bigintmany2oneps in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the bigintmany2onep.
	 */

	public long countAll();


    public Page<BigIntMany2oneP> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

