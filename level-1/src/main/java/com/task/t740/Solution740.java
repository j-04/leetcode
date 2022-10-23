package com.task.t740;

public class Solution740 {
    public int pivotIndex(int[] nums) {
        // int left = 0;
        // for (int pivot = 0; pivot < nums.length; pivot++) {
        //     int right = 0;
        //     for (int j = pivot + 1; j < nums.length; j++) {
        //         right += nums[j];
        //     }
        //     if (left == right) {
        //         return pivot;
        //     }
        //     left += nums[pivot];
        // }
        // return -1;
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