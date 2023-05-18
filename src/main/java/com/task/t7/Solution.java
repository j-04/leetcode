package com.task.t7;

public class Solution {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            int buf = x % 10;
            x /= 10;
            result = result * 10 + buf;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }
}
