package LeetCode;

import java.util.Arrays;

/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

* */
public class RotateArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        int[] rotatedArray = new int[num.length];
        int k = 3;

        // Optimize k to handle cases when k is greater than num.length
        k = k % num.length; //i.e 3

        //For num[0] (i = 0), the new index would be (0 + 3) % 7 = 3, so we place num[0] in rotatedArray[3]:
        //For num[1] (i = 1), the new index would be (1 + 3) % 7 = 4, so we place num[1] in rotatedArray[4]:
        //For num[4] (i = 4), the new index would be (4 + 3) % 7 = 0, so we place num[4] in rotatedArray[0]:

        for (int i = 0; i < num.length; i++) {
            int rotatedIndex = (i + k) % num.length;
            rotatedArray[rotatedIndex] = num[i];
        }

        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
    }
}
