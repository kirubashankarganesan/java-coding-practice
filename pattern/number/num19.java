package pattern.number;

public class num19 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            // spaces
            for (int j = 0; j <= n; j++) {
                System.out.print("");
            }
            // numbers
            for (int j = n - i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }
}

// 5
// 45
// 345
// 2345
// 12345
// 012345
// 012345
// 12345
// 2345
// 345
// 45
// 5