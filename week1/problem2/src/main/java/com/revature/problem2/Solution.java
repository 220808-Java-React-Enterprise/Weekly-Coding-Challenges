package com.revature.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<String> autoComplete(List<String> list) {
        String prefix = list.get(0);

        /* store the words with the prefix */
        List<String> words = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).indexOf(prefix) == 0) {
                words.add(list.get(i));
            }
        }
        Collections.sort(words);

        return words;
    }
}
