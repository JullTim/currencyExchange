package com.application.cryptoExchange.repository;

import com.application.cryptoExchange.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
