package string;

public class stringcompress {
    public static void main(String[] args) {
        String s = "aaaaaaaaaabbbbcc";
        s += " ";
StringBuilder sb=new StringBuilder();
        int c = 1;
        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i - 1)).append(c);
                c = 1;
            } else {
                c++;
            }
        }
        System.out.println(sb.toString());
    }
}

// a10b4c2