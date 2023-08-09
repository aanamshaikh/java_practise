package Practice;

public class BinarySearch {

    public static int binarySearch(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + right / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
        int target = 23;

        int i = binarySearch(arr, target);
        System.out.println(i);
    }
}
