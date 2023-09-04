package com.github.UlrikeWerner;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Client max = new Client("Max123", "Max", "Lang");
        Client hiep = new Client("Hiep21", "Lars", "Hiep");
        BankService moinBank = new BankService();
        UUID maxUuid = moinBank.openNewAccount(max);
        UUID hiepUuid = moinBank.openNewAccount(hiep);
        System.out.println(moinBank);
        moinBank.transferCash(maxUuid, new BigDecimal("100.00"), hiepUuid);
        System.out.println(moinBank);
    }
}
