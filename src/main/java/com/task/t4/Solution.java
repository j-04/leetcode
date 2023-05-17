package com.task.t4;

//Median of Two Sorted Arrays
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int s1 = nums1.length;
        int s2 = nums2.length;
        int size = s1 + s2;
        final int[] mergedArray = new int[size];
        while(i < s1 && j < s2) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }
        while (i < s1) {
            mergedArray[k++] = nums1[i++];
        }
        while (j < s2) {
            mergedArray[k++] = nums2[j++];
        }
        if ((size & 1) == 1) {
            return mergedArray[size / 2];
        } else {
            return (mergedArray[size / 2 - 1] + mergedArray[size / 2]) / 2.0;
        }
    }
}
