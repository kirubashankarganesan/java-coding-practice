package pattern.character;

public class ch10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int p = 'A';
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print((char) p++ + " ");
            }
            System.out.println();
        }
    }
}

// A B C D E 
//   A B C D 
//     A B C 
//       A B 
//         A