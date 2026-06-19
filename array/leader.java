package array;

public class leader {
    public static void main(String[] args) {
         int[] arr={16,17,4,3,5,2};
        int n=arr.length;
        StringBuilder sb=new StringBuilder();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(max<arr[i]){
                max=arr[i];
                sb.insert(0, max+" ");
            }
        }
        System.out.println(sb.toString());
    }
}

// 17 5 2