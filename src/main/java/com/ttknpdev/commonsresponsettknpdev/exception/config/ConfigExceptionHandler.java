package com.ttknpdev.commonsresponsettknpdev.exception.config;

import com.ttknpdev.commonsresponsettknpdev.constants.CommonsConstants;
import com.ttknpdev.commonsresponsettknpdev.exception.handler.NotAllowedMethod;
import com.ttknpdev.commonsresponsettknpdev.log.Logging;
import com.ttknpdev.commonsresponsettknpdev.response.CommonsResponseObject;
import org.springframework.http.ResponseEntity;

public class ConfigExceptionHandler extends Logging {
    public static ResponseEntity<CommonsResponseObject> getNotAllowedMethod(NotAllowedMethod notAllowedMethod){
        configException.info("getNotAllowedMethod(NotAllowedMethod) method is working");
        return ResponseEntity
                .status(CommonsConstants.STATUS_UNACCEPTABLE)
                .body(CommonsResponseObject
                        .<String>builder()
                        .status(CommonsConstants.STATUS_ACCEPTED)
                        .code(CommonsConstants.STRING_UNACCEPTABLE)
                        .info("cause , "+notAllowedMethod.getMessage())
                        .build());
    }

    public static ResponseEntity<CommonsResponseObject> getExceptionMethod(Exception exception){
        configException.info("getExceptionMethod(Exception) method is working");
        return ResponseEntity
                .status(CommonsConstants.STATUS_UNSOURCED)
                .body(CommonsResponseObject
                        .<String>builder()
                        .status(CommonsConstants.STATUS_UNSOURCED)
                        .code(CommonsConstants.STRING_UNSOURCED)
                        .info("cause , "+exception.getMessage())
                        .build());
    }
}
