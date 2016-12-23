package com.thoughtworks.tddintro.exercises.accountbalance;


public class Account {
    int balance;
    Account(int balance)
    {
        this.balance = balance;
    }

    public int DepositMoney(int deposit)
    {
        balance = balance + deposit;
        return balance;
    }

    public int WithdrawMoney(int withdrawal)
    {
        if(withdrawal>balance)
            return balance;
        balance = balance - withdrawal;
        return balance;
    }
}
