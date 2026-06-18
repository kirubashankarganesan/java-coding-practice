package array;

public class reverse_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int st = 0;
        int end = arr.length - 1;
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// 5 4 3 2 1