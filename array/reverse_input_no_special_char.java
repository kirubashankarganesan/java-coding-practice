package array;

public class reverse_input_no_special_char {
    public static void main(String[] args) {
        String s = "house ! no: 12";
        char[] ch = s.toCharArray();
        int st = 0;
        int end = ch.length - 1;
        while (st < end) {
            if (!Character.isLetterOrDigit(ch[st])) {
                st++;
            } else if (!Character.isLetterOrDigit(ch[end])) {
                end--;
            } else {
                char c = ch[st];
                ch[st] = ch[end];
                ch[end] = c;
                st++;
                end--;
            }
        }
        for (char c : ch) {
            System.out.print(c);
        }
    }
}
