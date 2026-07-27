package number_conversion;

public class decimal_to_hexadecimal {
    public static void main(String[] args) {
        int n = 90;
        if (n == 0) {
            System.out.println(0);
            return;
        }

        String res = "";
        while (n > 0) {
            int rem = n % 16;
            if (rem < 10) {
                res = rem + res;
            } else {
                res = (char) ('A' + rem - 10) + res;
            }
            n /= 16;
        }
        System.out.println(res);
    }
}

// 5A