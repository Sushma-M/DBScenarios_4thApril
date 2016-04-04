
package com.dbscenarios_30mar.classicmodels.service;


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
public class ClassicmodelsProcedureExecutorServiceImpl implements ClassicmodelsProcedureExecutorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ClassicmodelsProcedureExecutorServiceImpl.class);

	@Autowired
	@Qualifier("classicmodelsWMProcedureExecutor")
	private WMProcedureExecutor procedureExecutor;

	@Transactional(value = "classicmodelsTransactionManager")
	@Override

	public List<Object> executeMultipleOUTs()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("MultipleOUTs", params);

	}
	@Transactional(value = "classicmodelsTransactionManager")
	@Override

	public List<Object> executeMultipleOUTs2(java.lang.Integer cutomerNumber)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("cutomerNumber", cutomerNumber);
        return procedureExecutor.executeNamedProcedure("MultipleOUTs2", params);

	}
	@Transactional(value = "classicmodelsTransactionManager")
	@Override

	public List<Object> executeMultipleINOUTs(java.lang.Integer Add,java.lang.Integer Mul,java.lang.Integer Divde,java.lang.Integer inc)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("Add", Add);
        params.put("Mul", Mul);
        params.put("Divde", Divde);
        params.put("inc", inc);
        return procedureExecutor.executeNamedProcedure("MultipleINOUTs", params);

	}
	@Transactional(value = "classicmodelsTransactionManager")
	@Override

	public List<Object> executeInInOut(java.lang.Integer Add,java.lang.Integer inc)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("Add", Add);
        params.put("inc", inc);
        return procedureExecutor.executeNamedProcedure("InInOut", params);

	}
	@Transactional(value = "classicmodelsTransactionManager")
	@Override

	public List<Object> executeLoops2()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("Loops2", params);

	}
	@Transactional(value = "classicmodelsTransactionManager")
	@Override

	public List<Object> executeIfelse(java.lang.Integer custNum)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("custNum", custNum);
        return procedureExecutor.executeNamedProcedure("ifelse", params);

	}
	@Transactional(value = "classicmodelsTransactionManager")
	@Override

	public List<Object> executeLoops1()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("Loops1", params);

	}
	@Transactional(value = "classicmodelsTransactionManager")
	@Override

	public List<Object> executeCaseOut(java.lang.Integer custNum)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("custNum", custNum);
        return procedureExecutor.executeNamedProcedure("caseOut", params);

	}
	@Transactional(value = "classicmodelsTransactionManager")
	@Override

	public List<Object> executeErrorHandling(java.lang.Integer art_id,java.lang.Integer tag_id,java.lang.String blnak)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("art_id", art_id);
        params.put("tag_id", tag_id);
        params.put("blnak", blnak);
        return procedureExecutor.executeNamedProcedure("ErrorHandling", params);

	}
	@Transactional(value = "classicmodelsTransactionManager")
	@Override

	public List<Object> executeSignal(java.lang.Integer number)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("number", number);
        return procedureExecutor.executeNamedProcedure("signal", params);

	}
	@Transactional(value = "classicmodelsTransactionManager")
	@Override

	public List<Object> executeResignal(java.lang.Integer numerator,java.lang.Integer denominator)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("numerator", numerator);
        params.put("denominator", denominator);
        return procedureExecutor.executeNamedProcedure("resignal", params);

	}
	@Transactional(value = "classicmodelsTransactionManager")
	@Override

	public List<Object> executeCursor(java.lang.String emails)

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("emails", emails);
        return procedureExecutor.executeNamedProcedure("cursor", params);

	}
	@Transactional(value = "classicmodelsTransactionManager")
	@Override

	public List<Object> executeFunctions()

	throws QueryParameterMismatchException{
        Map<String, Object> params = new HashMap<String, Object>();
        return procedureExecutor.executeNamedProcedure("functions", params);

	}

	@Transactional(value = "classicmodelsTransactionManager")
	@Override
	public List<Object> executeWMCustomProcedure(CustomProcedure procedure) {
	    return procedureExecutor.executeCustomProcedure(procedure);
	}


}

