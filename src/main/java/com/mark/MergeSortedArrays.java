package com.mark;

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int nums1Cursor = m - 1;
        int nums2Cursor = n - 1;

        if (m == 0) {
            nums1Cursor++;
        }

        while(nums1Cursor >= 0 && nums2Cursor >= 0) {
            if (nums1[nums1Cursor] == 0) {
                nums1[nums1Cursor] = nums2[nums2Cursor];
                nums1Cursor--;
                nums2Cursor--;
            }
        }

        for (int j = m - 1; j >= 0; j--) {
            if (j > 0 && nums1[j] < nums1[j - 1]) {
                int temp = nums1[j];
                nums1[j] = nums1[j - 1];
                nums1[j - 1] = temp;
            }
        }
    }
}
