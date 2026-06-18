package array;

public class palindrome {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 };
        int st = 0;
        int end = arr.length - 1;
        while (st < end) {
            if (arr[st] != arr[end]) {
                System.out.println("not palindrome");
                return;
            }
            st++;
            end--;
        }
        System.out.println("palindrome");
    }
}

// palindrome