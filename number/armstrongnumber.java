package number;

public class armstrongnumber {
    public static void main(String[] args) {
        int n=153;
        int temp1=n;
        int temp2=n;
        int c=0;
        int armstrongnumber=0;
        while(temp1!=0){
            temp1/=10;
            c++;
        }
        while(temp2!=0){
            int rem=temp2%10;
            armstrongnumber+=(int)Math.pow(rem,c);
            temp2/=10;
        }
        if(armstrongnumber==n){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

// true

// public class ArmstrongNumber {
//     public static void main(String[] args) {

//         int n = 153;
//         int digits = String.valueOf(n).length(); // Count digits
//         int temp = n;
//         int sum = 0;

//         while (temp != 0) {
//             int rem = temp % 10;
//             sum += (int) Math.pow(rem, digits);
//             temp /= 10;
//         }

//         System.out.println(sum == n);
//     }
// }