package com.dbscenarios_30mar.classicmodels.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Qualifier;
import com.dbscenarios_30mar.classicmodels.service.ClassicmodelsProcedureExecutorService;
import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;
import com.wordnik.swagger.annotations.*;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;

@RestController(value = "Classicmodels.ProcedureExecutionController")
@RequestMapping("/classicmodels/procedureExecutor")
@Api(description = "Controller class for procedure execution", value = "ProcedureExecutionController")
public class ProcedureExecutionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProcedureExecutionController.class);

    @Autowired
    private ClassicmodelsProcedureExecutorService procedureService;

    @RequestMapping(value = "/procedure/execute/functions", method = RequestMethod.GET)
    @ApiOperation(value = "Process request to execute Procedure")
    public List<Object> executeFunctions() {
        LOGGER.debug("Executing named procedure functions");
        List<Object> result = procedureService.executeFunctions();
        LOGGER.debug("got the result of named procedure {}", result);
        return result;
    }

    @RequestMapping(value = "/procedure/execute/ErrorHandling", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute Procedure")
    public List<Object> executeErrorHandling(@RequestParam(value = "art_id", required = false) java.lang.Integer art_id, @RequestParam(value = "tag_id", required = false) java.lang.Integer tag_id, @RequestParam(value = "blnak", required = false) java.lang.String blnak) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure ErrorHandling");
        List<Object> result = procedureService.executeErrorHandling(art_id, tag_id, blnak);
        LOGGER.debug("got the result of named procedure {}", result);
        return result;
    }

    @RequestMapping(value = "/procedure/execute/InInOut", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute Procedure")
    public List<Object> executeInInOut(@RequestParam(value = "Add", required = false) java.lang.Integer Add, @RequestParam(value = "inc", required = false) java.lang.Integer inc) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure InInOut");
        List<Object> result = procedureService.executeInInOut(Add, inc);
        LOGGER.debug("got the result of named procedure {}", result);
        return result;
    }

    @RequestMapping(value = "/procedure/execute/Loops1", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute Procedure")
    public List<Object> executeLoops1() {
        LOGGER.debug("Executing named procedure Loops1");
        List<Object> result = procedureService.executeLoops1();
        LOGGER.debug("got the result of named procedure {}", result);
        return result;
    }

    @RequestMapping(value = "/procedure/execute/Loops2", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute Procedure")
    public List<Object> executeLoops2() {
        LOGGER.debug("Executing named procedure Loops2");
        List<Object> result = procedureService.executeLoops2();
        LOGGER.debug("got the result of named procedure {}", result);
        return result;
    }

    @RequestMapping(value = "/procedure/execute/MultipleINOUTs", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute Procedure")
    public List<Object> executeMultipleINOUTs(@RequestParam(value = "Add", required = false) java.lang.Integer Add, @RequestParam(value = "Mul", required = false) java.lang.Integer Mul, @RequestParam(value = "Divde", required = false) java.lang.Integer Divde, @RequestParam(value = "inc", required = false) java.lang.Integer inc) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure MultipleINOUTs");
        List<Object> result = procedureService.executeMultipleINOUTs(Add, Mul, Divde, inc);
        LOGGER.debug("got the result of named procedure {}", result);
        return result;
    }

    @RequestMapping(value = "/procedure/execute/MultipleOUTs", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute Procedure")
    public List<Object> executeMultipleOUTs() throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure MultipleOUTs");
        List<Object> result = procedureService.executeMultipleOUTs();
        LOGGER.debug("got the result of named procedure {}", result);
        return result;
    }

    @RequestMapping(value = "/procedure/execute/MultipleOUTs2", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute Procedure")
    public List<Object> executeMultipleOUTs2(@RequestParam(value = "cutomerNumber", required = false) java.lang.Integer cutomerNumber) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure MultipleOUTs2");
        List<Object> result = procedureService.executeMultipleOUTs2(cutomerNumber);
        LOGGER.debug("got the result of named procedure {}", result);
        return result;
    }

    @RequestMapping(value = "/procedure/execute/caseOut", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute Procedure")
    public List<Object> executeCaseOut(@RequestParam(value = "custNum", required = false) java.lang.Integer custNum) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure caseOut");
        List<Object> result = procedureService.executeCaseOut(custNum);
        LOGGER.debug("got the result of named procedure {}", result);
        return result;
    }

    @RequestMapping(value = "/procedure/execute/cursor", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute Procedure")
    public List<Object> executeCursor(@RequestParam(value = "emails", required = false) java.lang.String emails) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure cursor");
        List<Object> result = procedureService.executeCursor(emails);
        LOGGER.debug("got the result of named procedure {}", result);
        return result;
    }

    @RequestMapping(value = "/procedure/execute/ifelse", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute Procedure")
    public List<Object> executeIfelse(@RequestParam(value = "custNum", required = false) java.lang.Integer custNum) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure ifelse");
        List<Object> result = procedureService.executeIfelse(custNum);
        LOGGER.debug("got the result of named procedure {}", result);
        return result;
    }

    @RequestMapping(value = "/procedure/execute/resignal", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute Procedure")
    public List<Object> executeResignal(@RequestParam(value = "numerator", required = false) java.lang.Integer numerator, @RequestParam(value = "denominator", required = false) java.lang.Integer denominator) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure resignal");
        List<Object> result = procedureService.executeResignal(numerator, denominator);
        LOGGER.debug("got the result of named procedure {}", result);
        return result;
    }

    @RequestMapping(value = "/procedure/execute/signal", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute Procedure")
    public List<Object> executeSignal(@RequestParam(value = "number", required = false) java.lang.Integer number) throws QueryParameterMismatchException {
        LOGGER.debug("Executing named procedure signal");
        List<Object> result = procedureService.executeSignal(number);
        LOGGER.debug("got the result of named procedure {}", result);
        return result;
    }

    @RequestMapping(value = "/procedure/execute/wm_custom", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    @ApiOperation(value = "Process request to execute custom Procedure")
    public List<Object> executeWMCustomProcedure(@RequestBody CustomProcedure procedure) {
        List<Object> result = procedureService.executeWMCustomProcedure(procedure);
        LOGGER.debug("got the result {}" + result);
        return result;
    }
}
