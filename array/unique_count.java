package array;

public class unique_count {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int c = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                c++;
            }
        }
        System.out.println(c);
    }
}

// 5