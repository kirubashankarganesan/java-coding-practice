package pattern.number;

public class num16 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            int number = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j);
            }
            System.out.println();
        }
    }
}

// 1 
// 1 1 
// 1 2 1 
// 1 3 3 1 
// 1 4 6 4 1 
// 1 5 10 10 5 1 