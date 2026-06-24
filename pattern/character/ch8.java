package pattern.character;

public class ch8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1, p = 'A'; i <= n - 1; i++, p++) {
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

        for (int i = 1, p = 'E'; i <= n; i++, p--) {
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
//   D D D D D D D 
//     C C C C C 
//       B B B 
//         A 