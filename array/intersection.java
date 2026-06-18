package array;

public class intersection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
}

// Set<Integer> set = new HashSet<>();

// for(int i:arr1){
// set.add(i);
// }
// for(int i=0;i<arr2.length;i++){
// if(set.contains(arr2[i])){
// System.out.print(arr2[i]+" ");
// }
// }