package com.revature.problem1;

import java.util.Arrays;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        /* sort array */
        Arrays.sort(arr);

        /* loop through array */
        for (int n : arr) {
            /* check if n > k */
            if (n > k) {
                /* difference between n and k is greater than 1 */
                if (n - k > 1) {
                    return k += 1;
                } else {
                    /* assign k = n */
                    k = n;
                }
            }
        }

        return 0;
    }
}
