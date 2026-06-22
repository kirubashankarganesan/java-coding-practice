package pattern.character;

public class ch2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1, p = 'A'; i <= n; i++, p++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p + " ");
            }
            System.out.println("");
        }
    }
}

// A
// B B
// C C C
// D D D D
// E E E E E