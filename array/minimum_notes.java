package array;

public class minimum_notes {
    public static void main(String[] args) {
        int n=2456;
        int[] arr={2000,500,200,100,50,20,10,5,1};
        for(int i=0;i<arr.length;i++){
            if(n>=arr[i]){
                int q=n/arr[i];
                System.out.println(arr[i]+"-->"+q);
                n=n%arr[i];
            }
        }
    }
}

// 2000-->1
// 200-->2
// 50-->1
// 5-->1
// 1-->1