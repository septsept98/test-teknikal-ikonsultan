package com.septian.test_teknikal_ikonsultan.model.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

@EqualsAndHashCode(callSuper = true)
@Data
public class ErrorException extends RuntimeException {
    private final int errorCode;
    private final HttpStatus status;
    public ErrorException(String message, int errorCode, HttpStatus status) {
        super(message);
        this.errorCode = errorCode;
        this.status = status;
    }
}
