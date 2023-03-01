package com.application.cryptoExchange.dto;

public class WalletDto {
    private Long id;
    private Long rubWallet;
    private Long btcWallet;
    private Long tonWallet;
    private Long userId;


    public Long getRubWallet() {
        return rubWallet;
    }

    public void setRubWallet(Long rubWallet) {
        this.rubWallet = rubWallet;
    }

    public Long getBtcWallet() {
        return btcWallet;
    }

    public void setBtcWallet(Long btcWallet) {
        this.btcWallet = btcWallet;
    }

    public Long getTonWallet() {
        return tonWallet;
    }

    public void setTonWallet(Long tonWallet) {
        this.tonWallet = tonWallet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
