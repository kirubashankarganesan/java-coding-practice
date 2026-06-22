package string;

public class firstnonrepeatingcharacter {
    public static void main(String[] args) {
        String s = "hello";
        int[] arr = new int[256];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] == 1) {
                System.out.println(s.charAt(i));
                return;
            }
        }
    }
}
// h