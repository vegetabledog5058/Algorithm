package com.yugutou.charpter10_quicksort;

import java.util.Random;

public class QuickSelect {
    public static void main(String[] args) {
//        int[] arr = {26, 53, 48, 15, 13, 48, 32, 15};
//        int[] arr = {3,2,1,5,6,4};
//        int[] arr = {1};
//        int[] arr = {3,2,1,5,6,4};
        int[] arr= { 3,2,3,1,2,4,5,5,6};

        System.out.println(numK(arr,4));
    }
    public static int numK(int[] nums, int k) {
        return quick(nums,0, nums.length-1,nums.length-k );
    }
    public static int quick(int[] nums, int start, int end,int k) {
        if (start==end)return nums[k];
        int left = start;
        int right = end;
//        int base = nums[(left+right)>>1];
        Random r =new Random();
        int pivot = r.nextInt(start- end );
        int base = nums[pivot];
        while (left<right){

            while (left < right && nums[right] >= base) {
                right--;
            }
            while (left < right && nums[left] <= base) {
                left++;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
//        nums[pivot]=nums[left];
//        nums[left] = base;

        //判断递归范围
//        int n = nums.length-left;
        if (left == k) {
            return nums[left];
        } else if (left < k) {
            return quick(nums, left + 1, end, k);
        } else {
            return quick(nums, start, left - 1, k);
        }
    }
}
