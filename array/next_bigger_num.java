package array;

public class next_bigger_num {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 1, 9, 6, 2 };
        int i = 0;
        while (i < arr.length) {
            int next = Integer.MAX_VALUE;

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i] && arr[j] < next) {
                    next = arr[j];

                }

            }
            if (next != Integer.MAX_VALUE) {
                System.out.println(arr[i] + "-> " + next);
            } else {
                System.out.println(arr[i] + "-> ");
            }
            i++;
        }
    }
}
// 8-> 9
// 4-> 6
// 1-> 2
// 9-> 
// 6-> 8
// 2-> 4