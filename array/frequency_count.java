package array;

public class frequency_count {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3,3,3,3,4};

        int max=0;

        for(int i:arr){
            if(max<i){
                max=i;
            }
        }
        int[] freq=new int[max+1];
        for(int i:arr){
            freq[i]++;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                System.out.println(i+"->"+freq[i]);
            }
        }
    }
}

// 1->3
// 2->2
// 3->4
// 4->1