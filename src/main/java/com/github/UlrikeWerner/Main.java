package com.github.UlrikeWerner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<Client> maxAndMoritz = new ArrayList<>();
        maxAndMoritz.add(new Client("Max123", "Max", "Lang"));
        maxAndMoritz.add(new Client("Moritz2", "Moritz", "Langsam"));
        List<Client> hiep = new ArrayList<>();
        hiep.add(new Client("Hiep21", "Lars", "Hiep"));
        BankService moinBank = new BankService();
        UUID maxUuid = moinBank.openNewAccount(maxAndMoritz);
        UUID hiepUuid = moinBank.openNewAccount(hiep);
        System.out.println(moinBank);
        moinBank.transferCash(maxUuid, new BigDecimal("100.00"), hiepUuid);
        System.out.println(moinBank);
    }
}
