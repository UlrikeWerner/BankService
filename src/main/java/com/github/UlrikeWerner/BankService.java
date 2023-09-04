package com.github.UlrikeWerner;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class BankService {
    Set<Account> accounts = new HashSet<>();

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public UUID openNewAccount(Client client){
        Account newClient = new Account(UUID.randomUUID(), client);
        accounts.add(newClient);
        return newClient.getAccountNumber();
    }

    public void transferCash(UUID bankNumberSender, BigDecimal money, UUID bankNumberReceiver){
        for(Account account : accounts){
            if(account.getAccountNumber() == bankNumberSender){
                account.setBalance(account.getBalance().subtract(money));
            }
            if(account.getAccountNumber() == bankNumberReceiver){
                account.setBalance(account.getBalance().add(money));
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankService that = (BankService) o;
        return Objects.equals(accounts, that.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accounts);
    }

    @Override
    public String toString() {
        return "BankService{" +
                "accounts=" + accounts +
                '}';
    }
}
