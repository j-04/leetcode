package com.task.t1480;

public class Solution {
    public int[] runningSum(int[] nums) {
        // for (int index = 1; index < nums.length; index++) {
        //     nums[index] += nums[index - 1];
        // }
        // return nums;

        int[] result = new int[nums.length];

        int buffer = 0;
        for (int index = 0; index < nums.length; index++) {
            buffer += nums[index];
            result[index] = buffer;
        }
        return result;
    }
}
