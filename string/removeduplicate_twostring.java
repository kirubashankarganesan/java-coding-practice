package string;

public class removeduplicate_twostring {
    public static void main(String[] args) {
        String s1 = "hello1";
        String s2 = "hello2";
        String s3 = s1 + s2;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s3.length(); i++) {
            char ch = s3.charAt(i);
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}

// helo12