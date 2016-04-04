
package com.dbscenarios_30mar.classicmodels.service;

import java.util.Map;
import java.util.List;


import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface ClassicmodelsProcedureExecutorService {

    List<Object> executeMultipleOUTs() throws QueryParameterMismatchException;


    List<Object> executeMultipleOUTs2( java.lang.Integer cutomerNumber) throws QueryParameterMismatchException;


    List<Object> executeMultipleINOUTs( java.lang.Integer Add, java.lang.Integer Mul, java.lang.Integer Divde, java.lang.Integer inc) throws QueryParameterMismatchException;


    List<Object> executeInInOut( java.lang.Integer Add, java.lang.Integer inc) throws QueryParameterMismatchException;


    List<Object> executeLoops1() throws QueryParameterMismatchException;


    List<Object> executeLoops2() throws QueryParameterMismatchException;


	
	List<Object> executeWMCustomProcedure(CustomProcedure procedure) ;


}

