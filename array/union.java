package array;

public class union {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4, 5};

        int i=0;int j=0;
        while (i<arr1.length&&j<arr2.length) {
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i++]+" ");
                
            }else if(arr1[i]>arr2[j]){
                 System.out.print(arr2[j++]+" ");
            }else{
                 System.err.print(arr1[i++]+" ");
                 i++;
                 j++;
            }
        }
        while (i<arr1.length) {
            System.out.print(arr1[i++]+" ");
        }
        while (j<arr2.length) {
            System.out.print(arr2[j++]+" ");
        }
    }
}

// 1 2 3 4 5

// LinkedHashSet<Integer> set = new LinkedHashSet<>();

// for (int i : arr1) {
// set.add(i);
// }

// for (int i : arr2) {
// set.add(i);
// }

// System.out.println(set);