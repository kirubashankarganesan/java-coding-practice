package array_2d;

public class rotate_image_square_matrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        for (int i = 0; i < n; i++) {
            int st=0;
            int end=n-1;
            while(st<end){
                int temp=arr[i][st];
                arr[i][st]=arr[i][end];
                arr[i][end]=temp;
                st++;
                end--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
