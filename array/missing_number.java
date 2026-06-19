package array;

public class missing_number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};

        int n = arr.length + 1;
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        int val = (n * (n + 1)) / 2;
        int res = val - total;

        System.out.println(res);
    }
}   

// 3