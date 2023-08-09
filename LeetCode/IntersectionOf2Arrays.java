package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
* */
public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 2};
        findIntersection(num1, num2);
    }

    public static void findIntersection(int[] num1, int[] num2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> intersection = new ArrayList<>(); // New set to store the intersection

        // Add elements from num1 to set
        for (int m : num1) {
            set.add(m);
        }

        // Find the intersection of num1 and num2
        for (int m : num2) {
            if (set.contains(m)) {
                intersection.add(m);
            }
        }

        System.out.println(intersection);
    }
}
