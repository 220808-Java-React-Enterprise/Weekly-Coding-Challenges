package com.revature.reverse_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution sol = new Solution();

    @Test
    void test1() {
        assertEquals("olleH", sol.reverseString("Hello"));
    }

    @Test
    void test2() {
        assertEquals("!dlroW olleH", sol.reverseString("Hello World!"));
    }

    @Test
    void test3() {
        assertEquals("54321", sol.reverseString("12345"));
    }

    @Test
    void test4() {
        assertEquals("%$#@!", sol.reverseString("!@#$%"));
    }

    @Test
    void test5() {
        assertEquals("", sol.reverseString(""));
    }

    @Test
    void test6() {
        assertEquals(".", sol.reverseString("."));
    }
}