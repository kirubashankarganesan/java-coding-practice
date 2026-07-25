package array_2d;

public class addition {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[][] res = new int[n1][n2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                res[i][j] = arr1[i][j] + arr2[i][j];
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

// 2 4 6 8 10 12 14 16 18