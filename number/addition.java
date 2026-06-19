package number;

public class addition {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        System.out.println(a);
    }
}

// 30