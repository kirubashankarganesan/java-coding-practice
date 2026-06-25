package number;

public class primenumber {

    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=13;
        if(isprime(n)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

// true

//  for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 return  false;
//             }
//         }
