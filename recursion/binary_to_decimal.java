package recursion;

class binary_to_decimal {
    static int btod(int n,int p){
        if(n==0){
            return 0;
        }
        int d=n%10;
        return (d*(int)Math.pow(2,p)+btod(n/10, p+1));
    }
    public static void main(String[] args) {
        int num = 110010;
        System.out.print("The value of "+num+" is "+btod(110010, 0));
    }
}

// The value of 110010 is 50