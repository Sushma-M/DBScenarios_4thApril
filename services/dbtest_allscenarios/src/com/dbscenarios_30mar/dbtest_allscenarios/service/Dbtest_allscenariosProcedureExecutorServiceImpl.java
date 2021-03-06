/*Copyright (c) 2016-2017 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/


package com.dbscenarios_30mar.dbtest_allscenarios.service;


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

@Service
public class Dbtest_allscenariosProcedureExecutorServiceImpl implements Dbtest_allscenariosProcedureExecutorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(Dbtest_allscenariosProcedureExecutorServiceImpl.class);

	@Autowired
	@Qualifier("dbtest_allscenariosWMProcedureExecutor")
	private WMProcedureExecutor procedureExecutor;


	@Transactional(value = "dbtest_allscenariosTransactionManager")
	@Override
	public List<Object> executeWMCustomProcedure(CustomProcedure procedure) {
	    return procedureExecutor.executeCustomProcedure(procedure);
	}


}

