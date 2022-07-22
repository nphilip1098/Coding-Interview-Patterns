// Problem Statement #
//Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
//
//Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.

import java.util.Arrays;

public class twosum {
    public static void main(String[] args) {
        int[] nums = {1,3,5,8,10,22,48,99};
        int[] result= Two_Sum(nums,2000);
        System.out.println(Arrays.toString(result));
    }
    public static int[] Two_Sum(int[] nums, int target){
        int[] result = new int[2];
        int st = 0;
        int end = nums.length - 1;
        while(st<end){
            if(nums[st] + nums[end] == target){
                result[0] = st;
                result[1] =  end;
                break;
            } else if (nums[st] + nums[end] > target) {
                end--;
            }
            else{
                st++;
            }
        }
        return result;
    }
}