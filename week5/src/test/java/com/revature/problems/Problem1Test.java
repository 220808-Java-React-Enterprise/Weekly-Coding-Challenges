package com.revature.problems;

import org.junit.Assert;
import org.junit.Test;

public class Problem1Test {
    Problem1 sut = new Problem1();

    @Test
    public void test1() {
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4}, sut.addArrayToK(new int[]{1, 2, 0, 0}, 34));
    }

    @Test
    public void test2() {
        Assert.assertArrayEquals(new int[]{4, 5, 5}, sut.addArrayToK(new int[]{2, 7, 4}, 181));
    }

    @Test
    public void test3() {
        Assert.assertArrayEquals(new int[]{1, 0, 2, 1}, sut.addArrayToK(new int[]{2, 1, 5}, 806));
    }

    @Test
    public void test4() {
        Assert.assertArrayEquals(new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, sut.addArrayToK(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1));
    }

    @Test
    public void test5() {
        Assert.assertArrayEquals(new int[]{1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 5, 7, 9}, sut.addArrayToK(new int[]{1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3}, 516));
    }

    @Test
    public void test6() {
        Assert.assertArrayEquals(new int[]{2, 3}, sut.addArrayToK(new int[]{0}, 23));
    }
}