package com.company;

public class SavingAccounts {
    static int annualInterestRate=0;
    private double savingBalance=0;
    static int annualLoanRate=0;

    public SavingAccounts() {}

    public SavingAccounts(double savingBalance)
    {
        this.savingBalance=savingBalance;
    }

    public static int getAnnualLoanRate() {
        return annualLoanRate;
    }

    public static void setAnnualLoanRate(int annualLoanRate) {
        SavingAccounts.annualLoanRate = annualLoanRate;
    }

    public static int getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public static void setAnnualInterestRate(int annualInterestRate) {
        SavingAccounts.annualInterestRate = annualInterestRate;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    static double calculateMonthlyInterest(double savingBalance)
    {
        if(savingBalance>=0){
        double newMonthlyInterest=0d;
        newMonthlyInterest=(savingBalance * annualInterestRate) / 12;
        return newMonthlyInterest;}
        else
            {
                double newMonthlyInterest=0d;
                newMonthlyInterest=(savingBalance * annualLoanRate) / 12;
                return newMonthlyInterest;
            }
    }

    static void modifyInterestRate(int newInterestRate)
    {
        annualInterestRate=newInterestRate;
    }

    @Override
    public String toString() {
        return "SavingAccounts{" +
                "savingBalance=" + savingBalance +
                '}'+
                "annualInterestRate= " + annualInterestRate +'%'+
                '}';
    }
}
