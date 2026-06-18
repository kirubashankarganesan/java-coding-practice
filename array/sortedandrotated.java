package array;

public class sortedandrotated {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        int n = arr.length;
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                c++;
            }
        }
        if(c<=1){
            System.out.println("sorted and rotated");
        }else{
            System.out.println("not sorted andr otated");
        }
    }
}
