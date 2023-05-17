package com.task.t6;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int step = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += step) {
                result.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + step - i < n) {
                    result.append(s.charAt(j + step - i));
                }
            }
        }
        return result.toString();
    }
}
