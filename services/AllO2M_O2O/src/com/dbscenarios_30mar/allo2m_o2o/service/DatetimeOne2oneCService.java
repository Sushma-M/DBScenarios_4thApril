/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.allo2m_o2o.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.joda.time.LocalDateTime;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.dbscenarios_30mar.allo2m_o2o.*;

/**
 * Service object for domain model class DatetimeOne2oneC.
 * @see com.dbscenarios_30mar.allo2m_o2o.DatetimeOne2oneC
 */

public interface DatetimeOne2oneCService {
   /**
	 * Creates a new datetimeone2onec.
	 * 
	 * @param created
	 *            The information of the created datetimeone2onec.
	 * @return The created datetimeone2onec.
	 */
	public DatetimeOne2oneC create(DatetimeOne2oneC created);

	/**
	 * Deletes a datetimeone2onec.
	 * 
	 * @param datetimeone2onecId
	 *            The id of the deleted datetimeone2onec.
	 * @return The deleted datetimeone2onec.
	 * @throws EntityNotFoundException
	 *             if no datetimeone2onec is found with the given id.
	 */
	public DatetimeOne2oneC delete(LocalDateTime datetimeone2onecId) throws EntityNotFoundException;

	/**
	 * Finds all datetimeone2onecs.
	 * 
	 * @return A list of datetimeone2onecs.
	 */
	public Page<DatetimeOne2oneC> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<DatetimeOne2oneC> findAll(Pageable pageable);
	
	/**
	 * Finds datetimeone2onec by id.
	 * 
	 * @param id
	 *            The id of the wanted datetimeone2onec.
	 * @return The found datetimeone2onec. If no datetimeone2onec is found, this method returns
	 *         null.
	 */
	public DatetimeOne2oneC findById(LocalDateTime id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a datetimeone2onec.
	 * 
	 * @param updated
	 *            The information of the updated datetimeone2onec.
	 * @return The updated datetimeone2onec.
	 * @throws EntityNotFoundException
	 *             if no datetimeone2onec is found with given id.
	 */
	public DatetimeOne2oneC update(DatetimeOne2oneC updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the datetimeone2onecs in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the datetimeone2onec.
	 */

	public long countAll();


    public Page<DatetimeOne2oneC> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

