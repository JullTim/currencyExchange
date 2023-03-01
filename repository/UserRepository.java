package com.application.cryptoExchange.repository;

import com.application.cryptoExchange.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {
   List<User> findAllBySecretKey(UUID secretKey);
}
