package number;

public class trailingzeros {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        while(n<5){
            System.out.println(0);
            return;
        }
        while(n>0){
            n/=5;
            sum+=n;
        }
        System.out.println(sum);
    }
}

// 1