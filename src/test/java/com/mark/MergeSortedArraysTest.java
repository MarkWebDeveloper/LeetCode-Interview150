package com.mark;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortedArraysTest {
    @Test
    public void shouldMergeTwoArrays()
    {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 6;
        int n = 3;
        MergeSortedArrays instance = new MergeSortedArrays();
        instance.merge(nums1, m, nums2, n);
        int[] expectedResult = {1,2,2,3,5,6};
        assertArrayEquals(nums1, expectedResult);
    }

    @Test
    public void shouldMergeTwoArraysIfSecondIsEmpty()
    {
        int[] nums1 = {1};
        int[] nums2 = {};
        int m = 1;
        int n = 0;
        MergeSortedArrays instance = new MergeSortedArrays();
        instance.merge(nums1, m, nums2, n);
        int[] expectedResult = {1};
        assertArrayEquals(nums1, expectedResult);
    }

    @Test
    public void shouldMergeTwoArraysIfFirstIsEmpty()
    {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        MergeSortedArrays instance = new MergeSortedArrays();
        instance.merge(nums1, m, nums2, n);
        int[] expectedResult = {1};
        assertArrayEquals(nums1, expectedResult);
    }
}
