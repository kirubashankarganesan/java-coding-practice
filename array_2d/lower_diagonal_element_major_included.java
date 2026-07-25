package array_2d;

public class lower_diagonal_element_major_included {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

// 4 7 8