package number_conversion;

public class decimal_to_binary {
    public static void main(String[] args) {
        int n = 90;
        if (n == 0) {
            System.out.println(0);
            return;
        }
        String res = "";
        while (n > 0) {
            int rem = n % 2;
            res = rem + res;
            n /= 2;
        }
        System.out.println(res);
    }
}

// System.out.println(Integer.toBinaryString(n));

// 1011010

// int place = 1;

// while (n > 0) {
//     int rem = n % 2;
//     bin = bin + rem * place;
//     place *= 10;
//     n /= 2;
// }

