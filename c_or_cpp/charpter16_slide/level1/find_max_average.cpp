#include <stdio.h>

double findMaxAverage(int nums[], int k) {
    int len = nums.length;
    int widowSum = 0;
    if (k > len || len < 1 || k < 1) {
        return 0.0;
    }
    //   第一步 先求第一个窗口的和
    for (int i = 0; i < k; i++) {
        widowSum += nums[i];
    }

    //  第二步 ：遍历，每次右边增加一个，左边减去一个，重新计算窗口最大值
    int res = widowSum;
    for (int right = k; right < len; right++) {
        widowSum += nums[right] - nums[right - k];
        res = (res > widowSum) ? res : widowSum;
    }
    return (double) res / k;
}
//第二种方法
int findLengthOfLCIS2(int* nums, int numsSize) {
    int curLen = 1; // 当前连续递增区间的长度
    int res = 1; // 最大长度
    for (int i = 1; i < numsSize; i++) {
        if (nums[i - 1] >= nums[i]) { // 不满足要求，重新开始计数
            curLen = 1;
        } else {
            curLen++;
        }
        res = max(curLen, res); // 更新最大长度
    }
    return res;
}
int main() {
    int nums[] = {1, 2, 3, 4, 5};
    int k = 2;
    double max_average = findMaxAverage(nums, k);
    printf("最大平均值为：%f", max_average);
    return 0;
}