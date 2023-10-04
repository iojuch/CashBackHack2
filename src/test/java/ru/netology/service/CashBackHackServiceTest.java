package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackHackServiceTest {

    @Test

    public void shouldCashbackHack() {
        CashBackHackService service = new CashBackHackService();
        int amount = 400;

        int expected = 600;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test

    public void shouldCashbackHackZero() {
        CashBackHackService service = new CashBackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test

    public void shouldCashbackHackOne() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test

    public void shouldCashbackHackBeforeMax() {
        CashBackHackService service = new CashBackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test

    public void shouldCashbackHackMax() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

}