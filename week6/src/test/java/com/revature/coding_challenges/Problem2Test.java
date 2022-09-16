package com.revature.coding_challenges;

import org.junit.Assert;
import org.junit.Test;

public class Problem2Test {
    Problem2 sut = new Problem2();

    @Test
    public void test1() {
        Assert.assertEquals(3, sut.positionOfT(new int[]{1, 2, 3, 6}, 5));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, sut.positionOfT(new int[]{1, 2, 3, 4}, 2));
    }

    @Test
    public void test3() {
        Assert.assertEquals(2, sut.positionOfT(new int[]{1, 3, 10, 20}, 7));
    }

    @Test
    public void test4() {
        Assert.assertEquals(4, sut.positionOfT(new int[]{1, 3, 10, 20}, 30));
    }

    @Test
    public void test5() {
        Assert.assertEquals(0, sut.positionOfT(new int[]{1}, 1));
    }
}