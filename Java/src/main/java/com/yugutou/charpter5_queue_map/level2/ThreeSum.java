package com.yugutou.charpter5_queue_map.level2;

import java.util.*;

public class ThreeSum {


    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int first = 0; first < nums.length; first++) {
            //总体指针
            if (nums[first] > 0) {
                return lists;
            }
            //起始值与前一个相同时,去重
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            //c 对应最右
            int left = first + 1, right = n - 1;
            int target = -nums[first];
            while (left < right) {
                int tem = nums[right] + nums[left]+nums[first];
                if (tem==0){
                    List list = new ArrayList<>();
                list.add(nums[first]);
                list.add(nums[left]);
                list.add(nums[right]);
                lists.add(list);
                    //左右指针遇见重复时候跳过,否则停止
                    while (left<right&&nums[left]==nums[left+1]) {
                        left++;
                    }
                    while (left<right&&nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if (tem<0){
                    left++;
                }else {
                    right--;
                }

            }


            }

//        int n = nums.length;
//        Arrays.sort(nums);
//        List<List<Integer>> ans = new ArrayList<List<Integer>>();
//        // 枚举 a
//        for (int first = 0; first < n; ++first) {
//            // 需要和上一次枚举的数不相同
//            if (first > 0 && nums[first] == nums[first - 1]) {
//                continue;
//            }
//            // c 对应的指针初始指向数组的最右端
//            int third = n - 1;
//            int target = -nums[first];
//            // 枚举 b
//            for (int second = first + 1; second < n; ++second) {
//                // 需要和上一次枚举的数不相同
////                if (second > first + 1 && nums[second] == nums[second - 1]) {
////                    continue;
////                }
//                // 需要保证 b 的指针在 c 的指针的左侧
//                while (second < third && nums[second] + nums[third] > target) {
//                    --third;
//                }
//                // 如果指针重合，随着 b 后续的增加
//                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
//                if (second == third) {
//                    break;
//                }
//                if (nums[second] + nums[third] == target) {
//                    List<Integer> list = new ArrayList<Integer>();
//                    list.add(nums[first]);
//                    list.add(nums[second]);
//                    list.add(nums[third]);
//                    ans.add(list);
//                }
//            }
//        }
//        return ans;
        return lists;
            }

            public static void main (String[]args){
//        int[]nums = {-1,0,1,2,-1,-4};
                int[] nums = {0, 0, 0, 0, 0};
                List<List<Integer>> result = threeSum(nums);
                System.out.println(result);
            }
        }
