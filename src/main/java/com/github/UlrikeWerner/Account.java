package com.github.UlrikeWerner;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class Account {
    private UUID accountNumber;
    private BigDecimal balance;
    Client client;

    public Account(UUID accountNumber, Client client){
        this.accountNumber = accountNumber;
        balance = new BigDecimal("0.0");
        this.client = client;
    }

    public Account(UUID accountNumber, BigDecimal balance, Client client){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.client = client;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(UUID accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void depositCash(BigDecimal balance){
        this.balance = this.balance.add(balance);
    }
    public void withdrawCash(BigDecimal balance){
        this.balance = this.balance.subtract(balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(balance, account.balance) && Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance, client);
    }

    @Override
    public String toString() {
        return "Account{" +
                "bankNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }
}
