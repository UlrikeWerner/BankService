package com.github.UlrikeWerner;

import java.math.BigDecimal;
import java.util.Objects;

public class Account {
    private String bankNumber;
    private BigDecimal balance;
    Client client;

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
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
        return Objects.equals(bankNumber, account.bankNumber) && Objects.equals(balance, account.balance) && Objects.equals(client, account.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankNumber, balance, client);
    }

    @Override
    public String toString() {
        return "Account{" +
                "bankNumber='" + bankNumber + '\'' +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }
}
