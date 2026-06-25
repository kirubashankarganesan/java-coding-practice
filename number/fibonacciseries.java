package number;

public class fibonacciseries {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i=3;i<=n;i++){
            int temp=a+b;
            a=b;
            b=temp;
            System.out.print(temp+" ");
        }
    }
}
