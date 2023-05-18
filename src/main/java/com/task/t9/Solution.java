package com.task.t9;

// Palindrome Number
public class Solution {
    public boolean isPalindrome(int x) {
        // convert to String
        String s = String.valueOf(x);
        // store the String length to int n
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            // we check whether the elements at the same distance from
            // beginning and from ending are same, if not we return false
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        // if no flaws are found we return true
        return true;
    }
}
