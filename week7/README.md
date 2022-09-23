# Week 7 - Coding Challenges

---

## Problem 1

Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise,
return false.

- For example, swapping at indices 0 and 2 in "foo" results in "oof".

<br>

**Example 1:**

<pre>
<b>Input:</b> s = "ab", goal = "ba"
<b>Output:</b> true
<b>Explanation:</b> You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
</pre>

**Example 2:**

<pre>
<b>Input:</b> s = "ab", goal = "ab"
<b>Output:</b> false
<b>Explanation:</b> The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
</pre>

**Example 3:**

<pre>
<b>Input:</b> s = "aa", goal = "aa"
<b>Output:</b> true
<b>Explanation:</b> You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
</pre>

---

## Problem 2

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

<pre>
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
</pre>

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X
+ II. The number 27 is written as XXVII, which is XX + V + II.

- I can be placed before V (5) and X (10) to make 4 and 9.
- X can be placed before L (50) and C (100) to make 40 and 90.
- C can be placed before D (500) and M (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

<br>

**Example 1:**

<pre>
Input: s = "III"
Output: 3
Explanation: III = 3.
</pre>

**Example 2:**

<pre>
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
</pre>

**Example 3:**

<pre>
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
</pre>
