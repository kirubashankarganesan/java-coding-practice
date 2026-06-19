package array;

public class majority_element {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 0, 1, 1, 1, 1, 1 };
        int cand = 0;
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (c == 0) {
                cand = arr[i];
            }
            if (cand == arr[i]) {
                c++;
            } else {
                c--;
            }
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == cand) {
                count++;
            }
        }
        if (count > arr.length / 2) {
            System.out.println("majority element" + cand);
        } else {
            System.out.println("No majority element");
        }
    }
}

// 1
