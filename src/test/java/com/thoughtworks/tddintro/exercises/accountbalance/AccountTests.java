package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    //@Ignore  // Remove each @Ignore and implement test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        assertThat(new Account(100).DepositMoney(50), is(150));
    }

    @Test
    //@Ignore  // Remove each @Ignore and implement test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        assertThat(new Account(100).WithdrawMoney(50), is(50));
    }

    @Test
    //@Ignore  // Remove each @Ignore and implement test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        assertThat(new Account(50).WithdrawMoney(100), is(50));
    }
}
