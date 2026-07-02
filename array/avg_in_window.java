package array;

public class avg_in_window {
    public static void main(String[] args) {
        int[] arr={5,8,10,13,6,2};
        int n=arr.length;
        int k=3;

        int wavg=0;
        int wsum=0;
        for(int i=0;i<k;i++){
            wsum+=arr[i];
        }
        wavg=wsum/k;
        System.out.print(wavg+" ");
        for(int i=k;i<n;i++){
            wsum=wsum+arr[i]-arr[i-k];
            wavg=wsum/k;
            System.out.print(wavg+" ");
        }

    }
}

// 7 10 9 7