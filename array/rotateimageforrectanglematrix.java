package array;

public class rotateimageforrectanglematrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

        int row = arr.length;
        int col = arr[0].length;

        int rot[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rot[j][row - 1 - i] = arr[i][j];
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(rot[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// 4 1 
// 5 2 
// 6 3 