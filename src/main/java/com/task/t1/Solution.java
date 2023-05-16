package com.task.t1;

// Two Sum
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && target - nums[i] == nums[j])
                    return new int[]{i, j};
            }
        }
        return new int[] {0, 0};
    }
}
