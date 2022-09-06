package com.revature.problems;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {
    Problem2 sut = new Problem2();

    @Test
    public void test1() {
        Assert.assertTrue(sut.isPattern("abba", "dog cat cat dog"));
    }

    @Test
    public void test2() {
        Assert.assertFalse(sut.isPattern("abba", "dog cat cat fish"));
    }

    @Test
    public void test3() {
        Assert.assertFalse(sut.isPattern("aaaa", "dog cat cat dog"));
    }

    @Test
    public void test4() {
        Assert.assertFalse(sut.isPattern("abba", "dog dog dog dog"));
    }

    @Test
    public void test5() {
        Assert.assertFalse(sut.isPattern("aaa", "aa aa aa aa"));
    }

    @Test
    public void test6() {
        Assert.assertTrue(sut.isPattern("deadbeef", "d e a d b e e f"));
    }
}