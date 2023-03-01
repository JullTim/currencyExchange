package com.application.cryptoExchange.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "crypto_exchange.users_id_seq")
    private Long id;

    @Column(name = "secret_key")
    @UuidGenerator
    private UUID secretKey;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "user")
    private Wallet wallet;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(UUID secretKey) {
        this.secretKey = secretKey;
    }

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

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}
