/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.dbscenarios_30mar.dbtest_allscenarios.dao;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.wavemaker.runtime.data.dao.WMGenericDaoImpl;

import com.dbscenarios_30mar.dbtest_allscenarios.*;
/**
* Specifies methods used to obtain and modify Composites2 related information
* which is stored in the database.
*/
@Repository("dbtest_allscenarios.Composites2Dao")
public class Composites2Dao extends WMGenericDaoImpl <Composites2, Composites2Id> {

    @Autowired
    @Qualifier("dbtest_allscenariosTemplate")
    private HibernateTemplate template;

    public HibernateTemplate getTemplate() {
        return this.template;
    }
}
