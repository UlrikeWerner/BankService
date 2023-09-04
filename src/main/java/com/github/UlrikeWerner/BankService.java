package com.github.UlrikeWerner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class BankService {
    Set<Account> accounts = new HashSet<>();

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public UUID openNewAccount(List<Client> client){
        Account newClient = new Account(UUID.randomUUID(), client);
        accounts.add(newClient);
        return newClient.getAccountNumber();
    }

    public Account getAccountByUUID(UUID accountNumber){
        for(Account account : accounts) {
            if(account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }

    public void transferCash(UUID accountNumberSender, BigDecimal money, UUID accountNumberReceiver){
        getAccountByUUID(accountNumberSender).withdrawCash(money);
        getAccountByUUID(accountNumberReceiver).depositCash(money);
    }

    public List<UUID> splitAccounts(UUID accountNumber){
        List<UUID> newAccountNumbers = new ArrayList<>();

        Account account = getAccountByUUID(accountNumber);
        BigDecimal numberOfNewAccounts = BigDecimal.valueOf(account.client.size());
        BigDecimal moneyEach = account.getBalance().divide(numberOfNewAccounts, RoundingMode.HALF_DOWN);
        for(Client client : account.client){
            List<Client> newClient = new ArrayList<>();
            newClient.add(client);
            UUID newClientUuid = openNewAccount(newClient);
            getAccountByUUID(newClientUuid).setBalance(moneyEach);
            newAccountNumbers.add(newClientUuid);
        }
        return newAccountNumbers;
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
