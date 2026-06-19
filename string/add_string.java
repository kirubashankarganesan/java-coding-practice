package string;

public class add_string {
    public static void main(String[] args) {
         String s1 = "1234";
        String s2 = "1234";
        StringBuilder sb = new StringBuilder();

        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum += s1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += s2.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 10);
            carry = sum / 10;
        }
        System.out.println(sb.reverse().toString());
    }
}

// 2468