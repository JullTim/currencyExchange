package com.application.cryptoExchange.dto;

import com.application.cryptoExchange.enums.CurrencyName;

import java.util.UUID;

public class UserDto {
    private Long id;
    private UUID secretKey;
    private String userName;
    private String email;
    private CurrencyName currencyName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(UUID secretKey) {
        this.secretKey = secretKey;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CurrencyName getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(CurrencyName currencyName) {
        this.currencyName = currencyName;
    }
}


