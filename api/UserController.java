package com.application.cryptoExchange.api;

import com.application.cryptoExchange.dto.UserDto;
import com.application.cryptoExchange.dto.WalletDto;
import com.application.cryptoExchange.entity.User;
import com.application.cryptoExchange.entity.Wallet;
import com.application.cryptoExchange.service.UserService;
import com.application.cryptoExchange.service.ValidationException;
import com.application.cryptoExchange.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private WalletService walletService;

    @PostMapping("/save")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        if(!(userDto.getUserName() == null || userDto.getEmail() == null)) {
            throw new ValidationException("Username or email already exists, please try to register again or log in");
        }
        return new ResponseEntity<>(userService.save(userDto), HttpStatus.CREATED);
    }
    @PostMapping("/fillUp")
    public ResponseEntity<Wallet> fillUpRubWallet(@RequestParam UUID secretKey, Long rubWallet) {
        if(secretKey != null) {
            return new ResponseEntity<>(userService.fillUpRubWallet(secretKey, rubWallet), HttpStatus.CREATED);
        }
        throw new ValidationException("Unable to top up wallet");
    }
    @GetMapping("/balance")
    public ResponseEntity<Wallet> getBalance(@RequestParam UUID secretKey) {
        if (secretKey != null) {
            return new ResponseEntity<>(userService.getBalance(secretKey),HttpStatus.OK);
        }
        throw new ValidationException("Unable to view balance, register or log in");
    }
}
