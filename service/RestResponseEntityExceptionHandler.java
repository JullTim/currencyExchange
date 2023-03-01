package com.application.cryptoExchange.service;
import com.application.cryptoExchange.api.ApiError;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = ValidationException.class)
    protected ResponseEntity<Object> handleValidationException(ValidationException ex, WebRequest request) {
        ApiError apiError = prepareError(ex, HttpStatus.BAD_REQUEST);
        return handleExceptionInternal(ex, apiError, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
    private ApiError prepareError(Exception ex, HttpStatus status) {
        return new ApiError.Builder()
                .forStatus(status)
                .forError(status.getReasonPhrase())
                .forMessage(ex.getLocalizedMessage())
                .build();
    }
}
