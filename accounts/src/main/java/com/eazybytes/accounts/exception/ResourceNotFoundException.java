package com.eazybytes.accounts.exception;

import org.springframework.boot.actuate.endpoint.jmx.JmxEndpointsSupplier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        super(String.format("%s not found with give input data %s: %s", resourceName, fieldName, fieldValue));

    }
}
