package hashmap;

import java.util.HashMap;

public class unique_element {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 4, 4 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                System.out.println(i);
            }
        }
    }
}
