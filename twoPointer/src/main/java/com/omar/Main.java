package com.omar;

import java.util.Arrays;

public class Main {

//    O(n^2)
    public static int[] twoSumBruteForce(int[] nums, int target){
        for(int i =0; i<nums.length; i++){
            for(int j =i+1; j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[2];
    }

//    O(n)
    public static int[] twoSum(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;

//        keep going until the pointers meet
        while(left < right){
            int sum = nums[left] + nums[right];

            if(sum == target){
                return new int[]{left,right};
            }
            else if(sum <= target){
                left ++;
            }
            else{
                right--;
            }
        }
        return new int[2];
    }


//    Exercise 1: write a method that takes a string and checks if it's a palindrome
//    input: civic -----> true
//    input: java ------> false
//    input: kayak ------> true

    public static boolean isPalindrome(String s){

        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;

        }
        return true;
    }



// Lets look at this array: [-5, -3 , 2, 4, 6, 10]
//                          [25, 9 ,4, 16, 36, 100]
//             Result:      [100, 36, 25, 16, 9, 4]

    public static int[] sortedSquaredArray(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int[] result = new int[nums.length];

        int index = 0;

        while(left <= right){
            int leftPointerSquared = (int)Math.pow(nums[left],2);
            int rightPointerSquared = (int)Math.pow(nums[right],2);

            if(rightPointerSquared > leftPointerSquared){
                result[index] = rightPointerSquared;
                right --;
            }
            else{
                result[index] = leftPointerSquared;
                left++;
            }
            index++;
        }
        return result;

    }

    public int maxArea(int[] height) {

        int currentArea = 0;
        int maxArea = 0;
        int left = 0;
        int right = height.length-1;

        while(left<right){
            int width = right-left;
            currentArea = Math.min(height[left],height[right]) * width;
            maxArea = Math.max(currentArea,maxArea);
            if(height[left] < height[right]){
                left+=1;
            }
            else{
                right-=1;
            }
        }
        return maxArea;
    }



    public static void main(String[] args) {
        int[] test = {1,2,5,8,10,20,30,40};
        System.out.println(Arrays.toString(twoSum(test, 13)));
        System.out.println(isPalindrome("java"));

        int[] squaredTest= {-5,-3,2,4,6,10};
        System.out.println(Arrays.toString(sortedSquaredArray(squaredTest)));
    }
}