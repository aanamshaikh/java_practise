package LeetCode;

import java.util.ArrayList;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
//        int[] arr = {0,0,1,1,2,2,3,3,4,4,4,5,7,7,9,10};
        int[] arr ={1,1,2};
        ArrayList<Integer> a = new ArrayList<>();
        int temp= arr[0];
        a.add(temp);

        for (int i = 0; i <= arr.length - 1; i++) {
            if(temp!=arr[i]){
                a.add(arr[i]);
                temp=arr[i];
            }
        }
        System.out.println(a);
    }

}
