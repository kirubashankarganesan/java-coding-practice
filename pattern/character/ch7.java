package pattern.character;

public class ch7 {
    public static void main(String[] args) {
        int n = 5, p = 'A';
        for (int i = 1; i <= n - 1; i++, p++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i - 1; j++) {
                System.out.print((char) p + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p + " ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++, p++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n - 1; j++) {
                System.out.print((char) p + " ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print((char) p + " ");
            }
            System.out.println();
        }
    }
}

//         A 
//       B B B 
//     C C C C C 
//   D D D D D D D 
// E E E E E E E E E 
//   F F F F F F F 
//     G G G G G 
//       H H H 
//         I 