package array;

import java.util.Arrays;

public class leftrotate {

    static int[] rotate(int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int k = 2;
        k = k % n;

        rotate(arr, 0, k - 1);
        rotate(arr, k, n - 1);
        rotate(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

    }
}

// [3, 4, 5, 1, 2]