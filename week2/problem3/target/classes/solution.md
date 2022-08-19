# Valid Words Solution

```java
package com.revature.problem;

public class Solution {
    public int validWords(String sentence) {
        int count = 0;
        List<String> words = stringList(sentence);

        for (String s : words) {
            if (caseOne(s)) {
                if (caseTwo(s)) {
                    if (caseThree(s)) count++;
                }
            }
        }

        return count;
    }

    private List<String> stringList(String s) {
        StringBuilder sb = new StringBuilder();
        List<String> words = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (c != ' ') sb.append(c);
            else {
                if (sb.length() > 0) {
                    words.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            }
        }

        if (sb.length() > 0) words.add(sb.toString());

        return words;
    }

    private boolean caseOne(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) return false;
        }

        return true;
    }

    private boolean caseTwo(String s) {
        int hyphen = 0;

        if (s.charAt(0) == '-' || s.charAt(s.length() - 1) == '-') return false;

        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == '-') {
                if (!(Character.isAlphabetic(s.charAt(i - 1)) && Character.isAlphabetic(s.charAt(i + 1)))) return false;
                hyphen++;
            }
            if (hyphen > 1) return false;
        }

        return true;
    }

    private boolean caseThree(String s) {
        int punc = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == '.') return false;
        }

        for (char c : s.toCharArray()) {
            if (c == '!' || c == ',' || c == '.') punc++;
            if (punc > 1) return false;
        }

        return true;
    }
}
```