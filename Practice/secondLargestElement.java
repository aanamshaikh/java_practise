package Practice;

import java.util.Arrays;

public class secondLargestElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 56};
        Arrays.sort(arr);
        System.out.println("Second Largest Element of Array " + arr[arr.length - 2]);

        int h = secondHighest(arr);
        System.out.println(h);
    }

    public static int secondHighest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;


        for (int i : arr) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            }
        }

        return secondHighest;
    }
}
