package com.application.cryptoExchange.service;

public class ValidationException extends RuntimeException{
    public ValidationException(String message) {
        super(message);
    }
}
