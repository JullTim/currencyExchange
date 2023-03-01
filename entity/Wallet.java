package com.application.cryptoExchange.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
    @SequenceGenerator(name = "sequence", sequenceName = "public.wallet_id_seq")
    private Long id;

    @Column(name = "rub_wallet")
    private Long rubWallet;

    @Column(name = "btc_wallet")
    private Long btcWallet;

    @Column(name = "ton_wallet")
    private Long tonWallet;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;


    public Long getRubWallet() {
        return rubWallet;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
