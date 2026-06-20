package pattern.number;

public class num14 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1, k = 5; i <= n; i++, k--) {
            int p = k;
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(p-- + " ");
            }

            System.out.println("");
        }
    }
}

//   5 4 3 2 1 
//     4 3 2 1 
//       3 2 1 
//         2 1 
//           1 