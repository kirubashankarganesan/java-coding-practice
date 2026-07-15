package recursion;

public class reverse_word_string {
    static void reverse(String[] str, int len) {
        if (len < 0) {
            return;
        }

        System.out.print(str[len]);

        if (len != 0) {
            System.out.print(" ");
        }

        reverse(str, len - 1);
    }

    public static void main(String[] args) {

        String s = "one two three";
        String[] str = s.split(" ");
        reverse(str, str.length - 1);
    }
}