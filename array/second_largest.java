package array;

public class second_largest {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 50, 40 };
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];

            }else if(arr[i]>second_largest&&arr[i]!=largest){
                second_largest=arr[i];
            }
        }
        System.err.println(second_largest);
    }
}

// 40