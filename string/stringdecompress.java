package string;

public class stringdecompress {
    public static void main(String[] args) {
        String s = "a10b4c2";
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            i++;
            int c = 0;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                c = (c * 10) + (s.charAt(i) - '0');
                i++;
            }

            for (int j = 0; j < c; j++) {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}

// aaaaaaaaaabbbbcc