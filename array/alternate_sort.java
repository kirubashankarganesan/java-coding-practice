package array;

import java.util.Arrays;

public class alternate_sort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 7, 4, 3, 9 };

        Arrays.sort(arr);
        int st = 0;
        int end = arr.length-1;
        while (st <= end) {
            if (arr[st] != arr[end]) {
                System.out.print(arr[end] + " ");
                System.out.print(arr[st] + " ");

            } else {
                System.out.print(arr[st] + " ");
            }
            st++;
            end--;
        }
    }
}

// 9 2 8 3 7 4 5 
