package com.revature.reverse_int;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution sol = new Solution();

    @Test
    void test1() {
        assertEquals(321, sol.reverseInt(123));
    }

    @Test
    void test2() {
        assertEquals(1, sol.reverseInt(1));
    }

    @Test
    void test3() {
        assertEquals(21, sol.reverseInt(120));
    }

    @Test
    void test4() {
        assertEquals(-321, sol.reverseInt(-123));
    }

    @Test
    void test5() {
        assertEquals(-21, sol.reverseInt(-120));
    }
}