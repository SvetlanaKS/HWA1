package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTest {

    @Test
    public void shouldReturn10IfAmountIs2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 10;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnZeroIfAmountLowerThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}

