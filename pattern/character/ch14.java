package pattern.character;

public class ch14 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n ; i++) {
            int  p = 'A';
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print((char) p++ + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p-- + " ");
            }
            System.out.println();
        }
    }
}

//         A
//       A B A
//     A B C B A
//   A B C D C B A
// A B C D E D C B A 