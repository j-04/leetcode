package com.task.t11;

// Container With Most Water
public class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int max_area = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max_area = Math.max(max_area, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max_area;
    }
}
