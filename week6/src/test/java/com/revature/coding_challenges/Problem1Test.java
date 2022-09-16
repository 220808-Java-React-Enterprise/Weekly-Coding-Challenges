package com.revature.coding_challenges;

import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {
    Problem1 sut = new Problem1();

    @Test
    public void test1() {
        Assert.assertTrue(sut.isReducible("yes", "pit"));
    }

    @Test
    public void test2() {
        Assert.assertFalse(sut.isReducible("tab", "bob"));
    }

    @Test
    public void test3() {
        Assert.assertTrue(sut.isReducible("fizz", "buzz"));
    }

    @Test
    public void test4() {
        Assert.assertTrue(sut.isReducible("abab", "baba"));
    }

    @Test
    public void test5() {
        Assert.assertFalse(sut.isReducible("badc", "baba"));
    }
}