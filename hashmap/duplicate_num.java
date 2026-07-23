package hashmap;

import java.util.HashMap;

public class duplicate_num {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 4, 5, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i : map.keySet()) {
            if (map.get(i) > 1) {
                System.out.println(i);
            }
        }
    }
}
