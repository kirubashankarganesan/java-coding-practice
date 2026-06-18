package array;

public class mergtwoarray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 6, 7, 8, 9, 10 };
        int[] res = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                res[k++] = arr1[i++];
            }

           else{
                res[k++] = arr2[j++];
            }
        }
        while (i<arr1.length) {
            res[k++]=arr1[i++];
        }
        while (j<arr2.length) {
            res[k++]=arr2[j++];
        }
    }
}

// 1 2 3 4 5 6 7 8 9 10


// int in = 0;
// for (int i = 0; i < arr1.length; i++) {
// res[in++] = arr1[i];
// }
// for (int i = 0; i < arr2.length; i++) {
// res[in++] = arr2[i];
// }
// Arrays.sort(res);
// for (int i = 0; i < res.length; i++) {
// System.out.print(res[i] + " ");
// }