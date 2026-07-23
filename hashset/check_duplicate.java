package hashset;

import java.util.HashSet;

public class check_duplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4 };
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i)) {
                System.out.println(i);

            } else {
                set.add(i);
            }
        }

    }
}
