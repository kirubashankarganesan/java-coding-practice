package array;

public class max_subarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;

        int k = 3;

        int wsum = 0;

        for (int i = 0; i < k; i++) {
            wsum += arr[i];
        }
        int msum = wsum;
        for (int i = k; i < n; i++) {
            wsum = wsum + arr[i] - arr[i - k];
            msum = Math.max(wsum, msum);
        }
        System.out.println(msum);
    }
}

// 15

// int max=Integer.MIN_VALUE;
// for(int i=0;i<=n-k;i++){
// int curr=0;
// for(int j=i;j<i+k;j++){
// curr+=arr[j];
// }
// max=Math.max(max, curr);
// }
// System.out.println(max);