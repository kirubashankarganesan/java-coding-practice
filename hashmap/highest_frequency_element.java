package hashmap;

import java.util.HashMap;

public class highest_frequency_element {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 4, 4 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int val = 0;

        for (int i : map.keySet()) {
            if (map.get(i) > max) {
                max = map.get(i);
                val = i;
            }
        }
        System.out.println(val);
    }
}
