package com.task.t740;

public class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        for (int num: nums) {
            right += num;
        }
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            right -= num;
            if (left == right) {
                return i;
            }
            left += num;
        }
        return -1;
    }
}