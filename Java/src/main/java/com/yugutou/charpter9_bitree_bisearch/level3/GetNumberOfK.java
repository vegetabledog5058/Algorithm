package com.yugutou.charpter9_bitree_bisearch.level3;

import java.util.Arrays;

/**
 * 统计一个数字在升序数组中出现的次数。例如:输入[1,2,3,3,3,3,4,5],k=3，输出为4
 */
public class GetNumberOfK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 3, 4, 5};
        System.out.println(getNumberOfK(nums, 3));
    }

    public static int getNumberOfK(int[] array, int k) {
        int index = Arrays.binarySearch(array, k);
        if (index < 0) return 0;
        int cnt = 1;
        for (int i = index + 1; i < array.length && array[i] == k; i++)
            cnt++;
        for (int i = index - 1; i >= 0 && array[i] == k; i--)
            cnt++;
        return cnt;
    }
}
