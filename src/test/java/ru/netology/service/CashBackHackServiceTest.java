package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {
    CashBackHackService service = new CashBackHackService();

    @Test

    public void shouldCashbackHack() {
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test

    public void shouldCashbackHackZero() {
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test

    public void shouldCashbackHackOne() {
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test

    public void shouldCashbackHackBeforeMax() {
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test

    public void shouldCashbackHackMax() {
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

}