package array;

public class removeduplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4 };
        int n = arr.length;
        int rd = 0;
        for (int i = 1; i < n; i++) {
            if (arr[rd] != arr[i]) {
                rd++;
                arr[rd] = arr[i];
            }
        }
        for (int i = 0; i <rd + 1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

// 1 2 3 4

// int[] arr={0,1,2,3,3,4};
//         int n=arr.length;
//         int[] brr=new int[n];
//          brr[0]=arr[0];
//          int rd=0;
//         for(int i=1;i<n;i++){
//             if(arr[i]!=brr[rd]){
//                 rd++;
//                 brr[rd]=arr[i];
//             }
//         }
//         for(int i=0;i<rd+1;i++){
//             System.out.print(brr[i]+" ");
//         }
