package com.application.cryptoExchange.mapper;

import com.application.cryptoExchange.dto.WalletDto;
import com.application.cryptoExchange.entity.Wallet;

public class WalletMapperManual {
    public WalletDto toDto(Wallet wallet) {
        WalletDto walletDto = new WalletDto();
        walletDto.setId(wallet.getId());
        walletDto.setRubWallet(wallet.getRubWallet());
        walletDto.setBtcWallet(wallet.getBtcWallet());
        walletDto.setTonWallet(wallet.getTonWallet());
        return walletDto;
    }
    public Wallet toDao(WalletDto walletDto) {
        Wallet wallet = new Wallet();
        wallet.setId(walletDto.getId());
        wallet.setRubWallet(walletDto.getRubWallet());
        wallet.setBtcWallet(walletDto.getBtcWallet());
        wallet.setTonWallet(walletDto.getTonWallet());
        return wallet;
    }
}
