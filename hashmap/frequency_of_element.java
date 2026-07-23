package hashmap;

import java.util.HashMap;

public class frequency_of_element {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 1, 2, 3 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
    }
}
