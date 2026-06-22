package pattern.character;

public class ch4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1, p = 'A'; i <= n; i++, p += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p + " ");
            }
            System.out.println("");
        }
    }
}

// A
// C C
// E E E
// G G G G
// I I I I I