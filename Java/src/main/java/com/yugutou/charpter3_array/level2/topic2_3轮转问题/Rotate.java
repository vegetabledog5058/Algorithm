package com.yugutou.charpter3_array.level2.topic2_3轮转问题;

import java.util.Arrays;

/**
 * LeetCode189.给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
public class Rotate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 6);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] nums, int k) {
//        k =k% nums.length;
//        int newArr[] = new int[nums.length];
//        System.arraycopy(nums,0,newArr,k,newArr.length-k);
//        System.arraycopy(nums,newArr.length-k,newArr,0,k);
//
//        System.arraycopy(newArr,0,nums,0,newArr.length);















        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
