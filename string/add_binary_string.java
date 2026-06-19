package string;

public class add_binary_string {
    public static void main(String[] args) {
        String s1 = "1010";
        String s2 = "1100";
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

            sb.append(sum % 2);
            carry = sum / 2;
        }
        System.out.println(sb.reverse().toString());
    }
}

// 10110