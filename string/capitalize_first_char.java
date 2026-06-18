package string;

public class capitalize_first_char {
    public static void main(String[] args) {
        String s = "i love java";
        s += " ";
        String word = "";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word += s.charAt(i);
            } else {
                res += Character.toUpperCase(word.charAt(0)) + word.substring(1);
                word = "";
            }
        }
        System.err.println(res);
    }
}

// ILoveJava