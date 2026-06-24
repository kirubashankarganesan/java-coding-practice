package pattern.character;

public class ch9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int p = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print((char) p++ + " ");
            }
            System.out.println();
        }
    }
}

// A 
// A B 
// A B C 
// A B C D 
// A B C D E