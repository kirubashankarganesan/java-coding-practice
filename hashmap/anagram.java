package hashmap;

import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {

        String s = "listen";
        String t = "silent";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count first string
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Reduce frequency using second string
        for (char ch : t.toCharArray()) {

            if (!map.containsKey(ch)) {
                System.out.println(false);
                return;
            }

            map.put(ch, map.get(ch) - 1);
        }

        // Check all frequencies become 0
        for (char ch : map.keySet()) {
            if (map.get(ch) != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
