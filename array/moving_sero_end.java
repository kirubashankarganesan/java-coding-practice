package array;

import java.util.Arrays;

public class moving_sero_end {
    public static void main(String[] args) {
        int[] arr={1, 2, 0, 4, 3, 0, 5, 0}; 
        int n=arr.length;
        int z=0;
        int nz=0;
        while(nz<n){
            if(arr[nz]!=0){
                int t=arr[nz];
                arr[nz]=arr[z];
                arr[z]=t;
                nz++;z++;
            }else{
                nz++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

// [1, 2, 4, 3, 5, 0, 0, 0]