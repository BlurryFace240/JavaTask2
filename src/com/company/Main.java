package com.company;

public class Main {

    public static void main(String[] args) {
        SavingAccounts saver1 = new SavingAccounts(S2000.0d);
        SavingAccounts saver2 = new SavingAccounts(3000.0d);
        SavingAccounts.modifyInterestRate(0);
        SavingAccounts.setAnnualLoanRate(10);
        System.out.println("========================================Base=============================================");
        System.out.println(saver1);
        System.out.println(saver2);
        SavingAccounts.modifyInterestRate(4);
        saver1.setSavingBalance(saver1.getSavingBalance()+SavingAccounts.calculateMonthlyInterest(saver1.getSavingBalance()));
        saver2.setSavingBalance(saver2.getSavingBalance()+SavingAccounts.calculateMonthlyInterest(saver2.getSavingBalance()));
        System.out.println("=========================================4%==============================================");
        System.out.println(saver1);
        System.out.println(saver2);
        SavingAccounts.modifyInterestRate(5);
        saver1.setSavingBalance(saver1.getSavingBalance()+SavingAccounts.calculateMonthlyInterest(saver1.getSavingBalance()));
        saver2.setSavingBalance(saver2.getSavingBalance()+SavingAccounts.calculateMonthlyInterest(saver2.getSavingBalance()));
        System.out.println("=========================================5%==============================================");
        System.out.println(saver1);
        System.out.println(saver2);
    }
}
