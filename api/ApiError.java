package com.application.cryptoExchange.api;

import org.springframework.http.HttpStatus;

public class ApiError {
    private HttpStatus status;
    private String error;
    private String errorCode;
    private String message;


    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class Builder {
        private ApiError newApiError;

        public Builder() {
            newApiError = new ApiError();
        }

        public Builder forStatus(HttpStatus status) {
            newApiError.status = status;
            return this;
        }

        public Builder forError(String error) {
            newApiError.error = error;
            return this;
        }

        public Builder forErrorCode(String errorCode) {
            newApiError.errorCode = errorCode;
            return this;
        }

        public Builder forMessage(String message) {
            newApiError.message = message;
            return this;
        }

        public ApiError build() {
            return newApiError;
        }
    }
}


