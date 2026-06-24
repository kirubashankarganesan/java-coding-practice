package pattern.character;

public class ch11 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n - 1; i++) {
            int p = 'A';
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print((char) p++ + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p++ + " ");
            }
            System.out.println();
        }
    }
}

//         A 
//       A B C 
//     A B C D E 
//   A B C D E F G 