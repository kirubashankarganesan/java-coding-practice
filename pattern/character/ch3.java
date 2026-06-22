package pattern.character;

public class ch3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1, p = 'E'; i <= n; i++, p--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p + " ");
            }
            System.out.println("");
        }
    }
}

// E 
// D D 
// C C C 
// B B B B 
// A A A A A 