package array;

public class saddle_point {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < arr.length; i++) {
            int minv = arr[i][0];
            int minc = 0;

            for (int c = 1; c < arr.length; c++) {
                if (minv > arr[i][c]) {
                    minv = arr[i][c];
                    minc = c;
                }
            }
            int maxv = arr[0][minc];
            for (int r = 1; r < arr.length; r++) {
                if (maxv < arr[r][minc]) {
                    maxv=arr[r][minc];
                }
            }
            if(maxv==minv){
                System.out.println(minv);
                return;
            }
        }
        System.out.println("no saddle points");
    }
}
