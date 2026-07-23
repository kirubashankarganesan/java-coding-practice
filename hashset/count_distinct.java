package hashset;

import java.util.HashSet;

public class count_distinct {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2 };
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        System.out.println(set.size());
    }
}
