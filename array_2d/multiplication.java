package array_2d;

public class multiplication {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[][] res = new int[n1][n2];

        int row = arr1.length;
        int col1 = arr2[0].length;
        int col2 = arr1[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col1; j++) {
                for (int k = 0; k < col2; k++) {
                    res[i][j] = res[i][j] + (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}
