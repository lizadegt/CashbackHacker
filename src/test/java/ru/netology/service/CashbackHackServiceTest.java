package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {
    @Test
    public void shouldReturn1IfAmountIs999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldReturn900IfAmountIs1100() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;
        Assert.assertEquals(actual, expected);
    }
}