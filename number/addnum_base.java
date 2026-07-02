package number;

public class addnum_base {
    public static void main(String[] args) {
        int n1=123;
        int n2=13;
        int result=0;
        int carry=0;
        int base=4;
        int place=1;
        while (n1>0||n2>0||carry>0) {
            int d1=n1%10;
            int d2=n2%10;

            int sum=d1+d2+carry;

            int digit=sum%base;
            carry=sum/base;

            result=result+digit*place;
            n1/=10;
            n2/=10;
            place*=10;

        }
        System.out.println(result);
    }
}

// 202
