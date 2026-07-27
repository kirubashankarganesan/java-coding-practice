package number_conversion;

public class decimal_to_octal {
    public static void main(String[] args) {
        int n = 90;
        if (n == 0) {
            System.out.println(0);
            return;
        }
        String res = "";
        while (n > 0) {
            int rem = n % 8;
            res = rem + res;
            n /= 8;
        }
        System.out.println(res);
    }
}

// 132

// System.out.println(Integer.toOctalString(n));