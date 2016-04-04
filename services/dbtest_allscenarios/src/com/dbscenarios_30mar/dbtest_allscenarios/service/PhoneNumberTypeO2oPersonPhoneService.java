/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.dbtest_allscenarios.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.dbscenarios_30mar.dbtest_allscenarios.*;

/**
 * Service object for domain model class PhoneNumberTypeO2oPersonPhone.
 * @see com.dbscenarios_30mar.dbtest_allscenarios.PhoneNumberTypeO2oPersonPhone
 */

public interface PhoneNumberTypeO2oPersonPhoneService {
   /**
	 * Creates a new phonenumbertypeo2opersonphone.
	 * 
	 * @param created
	 *            The information of the created phonenumbertypeo2opersonphone.
	 * @return The created phonenumbertypeo2opersonphone.
	 */
	public PhoneNumberTypeO2oPersonPhone create(PhoneNumberTypeO2oPersonPhone created);

	/**
	 * Deletes a phonenumbertypeo2opersonphone.
	 * 
	 * @param phonenumbertypeo2opersonphoneId
	 *            The id of the deleted phonenumbertypeo2opersonphone.
	 * @return The deleted phonenumbertypeo2opersonphone.
	 * @throws EntityNotFoundException
	 *             if no phonenumbertypeo2opersonphone is found with the given id.
	 */
	public PhoneNumberTypeO2oPersonPhone delete(Integer phonenumbertypeo2opersonphoneId) throws EntityNotFoundException;

	/**
	 * Finds all phonenumbertypeo2opersonphones.
	 * 
	 * @return A list of phonenumbertypeo2opersonphones.
	 */
	public Page<PhoneNumberTypeO2oPersonPhone> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<PhoneNumberTypeO2oPersonPhone> findAll(Pageable pageable);
	
	/**
	 * Finds phonenumbertypeo2opersonphone by id.
	 * 
	 * @param id
	 *            The id of the wanted phonenumbertypeo2opersonphone.
	 * @return The found phonenumbertypeo2opersonphone. If no phonenumbertypeo2opersonphone is found, this method returns
	 *         null.
	 */
	public PhoneNumberTypeO2oPersonPhone findById(Integer id) throws
	 EntityNotFoundException;
	/**
	 * Updates the information of a phonenumbertypeo2opersonphone.
	 * 
	 * @param updated
	 *            The information of the updated phonenumbertypeo2opersonphone.
	 * @return The updated phonenumbertypeo2opersonphone.
	 * @throws EntityNotFoundException
	 *             if no phonenumbertypeo2opersonphone is found with given id.
	 */
	public PhoneNumberTypeO2oPersonPhone update(PhoneNumberTypeO2oPersonPhone updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the phonenumbertypeo2opersonphones in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the phonenumbertypeo2opersonphone.
	 */

	public long countAll();


    public Page<PhoneNumberTypeO2oPersonPhone> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

