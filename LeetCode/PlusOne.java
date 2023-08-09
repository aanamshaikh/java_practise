package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] num = {9,9,9};
        int[] result = plusOne(num);
        for (int digit : result) {
            System.out.print(digit);
        }
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        // If we reach this point, it means all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
