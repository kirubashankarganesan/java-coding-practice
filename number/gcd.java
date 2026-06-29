package number;

public class gcd {
    public static int gcdof(int a, int b) {
        if (b == 0) {
            return a;
        }
       return gcdof(b, a % b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(gcdof(a, b));
    }
}

// 5