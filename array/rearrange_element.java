package array;

import java.util.Arrays;

public class rearrange_element {
    public static void main(String[] args) {
        int[] arr = { 1, -6, 2, -7, 3, -8, 4, -9, 5, -10 };
        int[] res = new int[arr.length];
        int pos = 0;
        int neg = 1;
        for (int num : arr) {
            if (num > 0) {
                res[pos] = num;
                pos += 2;
            } else {
                res[neg] = num;
                neg += 2;
            }
        }
        System.err.println(Arrays.toString(res));
    }
}


// [1, -6, 2, -7, 3, -8, 4, -9, 5, -10]