package com.task.t8;

// String to Integer (atoi)
public class Solution {
    public int myAtoi(String s) {
        // remove leading and trailing whitespace
        s = s.trim();

        int len = s.length();
        double num = 0;
        int i = 0;
        if (len == 0) {
            return 0;
        }

        // check if char at index i is + or -
        boolean positive = s.charAt(i) == '+';
        boolean negative = s.charAt(i) == '-';
        // skip the sign character
        if (positive || negative) {
            i++;
        }
        // if char at index i is a digit, convert it to int
        while(i < len && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            num = num*10 + (s.charAt(i)-'0');
            i++;
        }
        // if the first non-space character is minus, make the number negative
        num = negative ? -num : num;
        // if the result number overflows, return Integer.MAX_VALUE or Integer.MIN_VALUE
        num = (num > Integer.MAX_VALUE) ? Integer.MAX_VALUE : num;
        num = (num < Integer.MIN_VALUE) ? Integer.MIN_VALUE : num;
        return (int)num;
    }
}
