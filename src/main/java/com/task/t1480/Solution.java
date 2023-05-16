package com.task.t1480;

public class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        int buffer = 0;
        for (int index = 0; index < nums.length; index++) {
            buffer += nums[index];
            result[index] = buffer;
        }
        return result;
    }
}
