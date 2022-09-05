package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest{
    @Test
    public void needToBuy1 () {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void needToBuy0 () {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void needToBuy999 () {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void needToBuy1Testable () {
        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void needToBuy0Testable () {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void needToBuy999Testable () {
        CashbackHackService service = new CashbackHackService();
        int expected = 999;
        int actual = service.remain(1001);
        Assert.assertEquals(expected, actual);
    }
}