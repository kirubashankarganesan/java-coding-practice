package hashmap;

import java.util.HashMap;

public class isomorphic_string {
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "ad1";

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (!map.containsKey(ch1)) {
                if (!map.containsValue(ch2)) {
                    map.put(ch1, ch2);
                } else {
                    System.out.println("not isomorphic");
                    return;
                }
            } else {
                if (map.get(ch1) != ch2) {
                    System.out.println("not isomorphic");
                    return;
                }
            }
        }
        System.out.println("isomorphic");
    }
}
