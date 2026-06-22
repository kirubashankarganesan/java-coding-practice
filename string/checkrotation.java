package string;

public class checkrotation {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcda";
        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        } else {
            String res = s1 + s1;
            if (res.contains(s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}

// true