package com.septian.test_teknikal_ikonsultan.configuration;

import com.septian.test_teknikal_ikonsultan.model.exception.ErrorException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ErrorHandlingException {

    @ExceptionHandler(ErrorException.class)
    public ResponseEntity<Map<String, Object>> handlingError(ErrorException ex){
        Map<String, Object> map = new HashMap<>();
        map.put("message", ex.getMessage());
        map.put("errorCode", ex.getErrorCode());
        return ResponseEntity.status(ex.getStatus()).body(map);
    }
}
