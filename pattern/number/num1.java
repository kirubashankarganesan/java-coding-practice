package pattern.number;

public class num1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1 ");
            }
            System.out.println("");
        }
    }
}

// 1
// 1 1
// 1 1 1
// 1 1 1 1
// 1 1 1 1 1