package string;

public class pangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        s = s.toLowerCase();

        boolean[] seen = new boolean[26];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (!seen[ch - 'a']) {
                    seen[ch - 'a'] = true;
                    count++;
                }
            }
        }
        if (count == 26) {
            System.out.println("pangram");
        } else {

            System.out.println("not a pangram");
        }
    }
}

// pangram