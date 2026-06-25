package number;

public class compositenumber {

    public static boolean iscomposite(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 13;
        if (iscomposite(n)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}

// false