
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


    List<Object> executeLoops2() throws QueryParameterMismatchException;


    List<Object> executeIfelse( java.lang.Integer custNum) throws QueryParameterMismatchException;


    List<Object> executeLoops1() throws QueryParameterMismatchException;


    List<Object> executeCaseOut( java.lang.Integer custNum) throws QueryParameterMismatchException;


    List<Object> executeErrorHandling( java.lang.Integer art_id, java.lang.Integer tag_id, java.lang.String blnak) throws QueryParameterMismatchException;


    List<Object> executeSignal( java.lang.Integer number) throws QueryParameterMismatchException;


    List<Object> executeResignal( java.lang.Integer numerator, java.lang.Integer denominator) throws QueryParameterMismatchException;


    List<Object> executeCursor( java.lang.String emails) throws QueryParameterMismatchException;


    List<Object> executeFunctions() throws QueryParameterMismatchException;


	
	List<Object> executeWMCustomProcedure(CustomProcedure procedure) ;


}

