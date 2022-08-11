package com.revature.abracadabra;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution sol = new Solution();

    @Test
    void test1() {
        assertEquals(Arrays.asList("1", "2", "abraca"), sol.abracadabra(3));
    }

    @Test
    void test2() {
        assertEquals(Arrays.asList("1", "2", "abraca", "4", "dabra"), sol.abracadabra(5));
    }

    @Test
    void test3() {
        assertEquals(Arrays.asList("1", "2", "abraca", "4", "dabra", "abraca", "7", "8", "abraca", "dabra", "11", "abraca", "13", "14", "abracadabra"), sol.abracadabra(15));
    }

    @Test
    void test4() {
        assertEquals(Collections.emptyList(), sol.abracadabra(0));
    }

    @Test
    void test5() {
        assertEquals(Collections.singletonList("1"), sol.abracadabra(1));
    }
}