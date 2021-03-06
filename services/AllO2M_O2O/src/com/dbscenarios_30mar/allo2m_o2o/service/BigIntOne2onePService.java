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
 * Service object for domain model class BigIntOne2oneP.
 * @see com.dbscenarios_30mar.allo2m_o2o.BigIntOne2oneP
 */

public interface BigIntOne2onePService {
   /**
	 * Creates a new bigintone2onep.
	 * 
	 * @param created
	 *            The information of the created bigintone2onep.
	 * @return The created bigintone2onep.
	 */
	public BigIntOne2oneP create(BigIntOne2oneP created);

	/**
	 * Deletes a bigintone2onep.
	 * 
	 * @param bigintone2onepId
	 *            The id of the deleted bigintone2onep.
	 * @return The deleted bigintone2onep.
	 * @throws EntityNotFoundException
	 *             if no bigintone2onep is found with the given id.
	 */
	public BigIntOne2oneP delete(BigInteger bigintone2onepId) throws EntityNotFoundException;

	/**
	 * Finds all bigintone2oneps.
	 * 
	 * @return A list of bigintone2oneps.
	 */
	public Page<BigIntOne2oneP> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<BigIntOne2oneP> findAll(Pageable pageable);
	
	/**
	 * Finds bigintone2onep by id.
	 * 
	 * @param id
	 *            The id of the wanted bigintone2onep.
	 * @return The found bigintone2onep. If no bigintone2onep is found, this method returns
	 *         null.
	 */
	public BigIntOne2oneP findById(BigInteger id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a bigintone2onep.
	 * 
	 * @param updated
	 *            The information of the updated bigintone2onep.
	 * @return The updated bigintone2onep.
	 * @throws EntityNotFoundException
	 *             if no bigintone2onep is found with given id.
	 */
	public BigIntOne2oneP update(BigIntOne2oneP updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the bigintone2oneps in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the bigintone2onep.
	 */

	public long countAll();


    public Page<BigIntOne2oneP> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

