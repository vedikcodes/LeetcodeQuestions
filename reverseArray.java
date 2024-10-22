package leetcode.question;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] arr) {
        int array[] = {2, 3, 4, 5, 6, 7, 8};
        System.out.println("Original Array: " + Arrays.toString(array));
        arrayReverse(array);
        System.out.println("reversed Array: " + Arrays.toString(array));


    }

    public static void arrayReverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
