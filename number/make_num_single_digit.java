package number;

public class make_num_single_digit {
    public static void main(String[] args) {
        int n=99;
        int sum=0;
        while (n>0) {
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        while(sum>9){
            int temp=0;
            while(sum>0){
                int rem=sum%10;
                temp+=rem;
                sum/=10;
            }
            sum=temp;
        }

        System.out.println(sum);
    }
}
