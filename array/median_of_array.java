package array;

import java.util.Arrays;

public class median_of_array {
    static double median(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        int in = 0;
        for (int i = 0; i < nums1.length; i++) {
            res[in++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            res[in++] = nums2[i];
        }
        Arrays.sort(res);
        int n = res.length;
        if (n % 2 == 1) {
            return res[n / 2];
        } else {

            return (res[n / 2 - 1] + res[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };
        System.out.println(median(nums1, nums2));
        ;
    }
}
