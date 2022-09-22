package com.revature.coding_challenges;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {
    Problem2 sut = new Problem2();

    @Test
    public void test1() {
        Assert.assertEquals(3, sut.romanToInteger("III"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(58, sut.romanToInteger("LVIII"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(1994, sut.romanToInteger("MCMXCIV"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(104, sut.romanToInteger("CIV"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(3724, sut.romanToInteger("MMMDCCXXIV"));
    }

    @Test
    public void test6() {
        Assert.assertEquals(700, sut.romanToInteger("DCC"));
    }
}