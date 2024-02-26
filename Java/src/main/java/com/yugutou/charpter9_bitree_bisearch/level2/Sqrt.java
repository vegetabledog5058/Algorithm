package com.yugutou.charpter9_bitree_bisearch.level2;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(8));
    }
    public static int sqrt (int x) {
        int left = 1;
        int right =x;
        while (left<=right){
            int mid = (left+right)>>1;
            if (mid*mid>x){
                right = mid-1;
            }else if ((mid*mid)<x){
                left = mid+1;
            }else if (mid*mid==x){
                return mid;
            }
        }
        return right;












//        int l=1,r=x;
//        while(l <= r){
//            int mid = l + ((r - l)>>1);
//            if(x/mid > mid){
//                l = mid + 1;
//            } else if(x / mid < mid){
//                r = mid - 1;
//            } else  if(x/mid == mid){
//                return mid;
//            }
//        }
//        return r;
    }
}
