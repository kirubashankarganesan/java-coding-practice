package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_anagram {
    public static void main(String[] args) {
        String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : arr) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if (!map.containsKey(s)) {
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(word);
        }
        System.out.println(map.values());
    }
}
