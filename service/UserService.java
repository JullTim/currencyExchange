package com.application.cryptoExchange.service;

import com.application.cryptoExchange.dto.UserDto;
import com.application.cryptoExchange.entity.User;
import com.application.cryptoExchange.entity.Wallet;
import com.application.cryptoExchange.mapper.UserMapperManual;
import com.application.cryptoExchange.repository.UserRepository;
import com.application.cryptoExchange.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private WalletRepository walletRepository;

    public UserDto save(UserDto userDto) {
        UserMapperManual userMapperManual = new UserMapperManual();
        User user = userMapperManual.toDao(userDto);
        User saveUser = userRepository.save(user);
        return userMapperManual.toDto(saveUser);
    }

    public Wallet fillUpRubWallet(UUID secretKey, Long rubWallet) {
        Wallet wallet = new Wallet();
        List<User> users = userRepository.findAllBySecretKey(secretKey);
        if (users.size() == 1) {
            User user = users.get(0);
            rubWallet = user.getWallet().getRubWallet() + rubWallet;
            wallet.setRubWallet(rubWallet);
            wallet = walletRepository.save(wallet);
            return wallet;
        } else {
            throw new ValidationException("Unable to top up balance");
        }
    }

    public Wallet getBalance(UUID secretKey) {
        Wallet wallet;
        List<User> users = userRepository.findAllBySecretKey(secretKey);
        if (users.size() == 1) {
            User user = users.get(0);
            wallet = user.getWallet();
            return wallet;
        }
        throw new ValidationException("user does not exist");
    }
}

