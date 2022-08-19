package com.revature.problem3;

import java.util.*;

public class Solution {
    public String wordCount(String sentence) {
        String[] arr = sentence.toLowerCase().split("\\s+");
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s : arr) {
            map.put(s, !map.containsKey(s) ? 1 : map.get(s) + 1);
        }

        System.out.println(map);

        /* loop through map */
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                sb.append(e.getKey()).append(": ").append(e.getValue()).append("\n");
            }
        }

        return sb.substring(0, sb.length() - 1);
    }
}
