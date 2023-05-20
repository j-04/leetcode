package com.task.t13;

// Roman to Integer
public class Solution {
    public static final int[] table = new int[256];

    static {
        table['I'] = 1;
        table['V'] = 5;
        table['X'] = 10;
        table['L'] = 50;
        table['C'] = 100;
        table['D'] = 500;
        table['M'] = 1000;
    }

    public static int romanToInt(String s) {
        int value = 0;
        int prev = 0;
        int current;
        for (char c : s.toCharArray()) {
            current = table[c];
            if (prev < current) {
                value -= prev + prev;
            }
            value += current;
            prev = current;
        }
        return value;
    }
}
