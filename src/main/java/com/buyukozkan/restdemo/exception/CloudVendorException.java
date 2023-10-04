package com.buyukozkan.restdemo.exception;

import org.springframework.http.HttpStatus;

public class CloudVendorException {
    private final String message;
    private final Throwable cause;
    private final HttpStatus httpStatus;

    // constructor
    public CloudVendorException(String message, Throwable cause, HttpStatus httpStatus) {
        this.message = message;
        this.cause = cause;
        this.httpStatus = httpStatus;
    }

    // getters
    public String getMessage() {
        return message;
    }

    public Throwable getCause() {
        return cause;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
