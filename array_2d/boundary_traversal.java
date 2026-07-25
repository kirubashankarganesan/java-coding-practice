package array_2d;

public class boundary_traversal {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int row=arr.length;
        int col=arr[0].length;
        for(int j=0;j<col;j++){
            System.out.print(arr[0][j]+" ");
        }
        for(int i=1;i<col;i++){
            System.out.print(arr[i][col-1]+" ");
        }
        for(int j=col-2;j>=0;j--){
            System.out.print(arr[row-1][j]+" ");
        }
        for(int j=row-2;j>0;j--){
            System.out.print(arr[j][0]+" ");
        }
    }
}
