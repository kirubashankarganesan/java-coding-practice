package string;

public class roman_to_integer {
    static int value(char ch){
        if(ch=='I') return 1;
        if(ch=='V') return 5;
        if(ch=='X') return 10;
        if(ch=='L') return 50;
        if(ch=='C') return 100;
        if(ch=='D') return 500;
        if(ch=='M') return 1000;
        return 0;
    }
    public static void main(String[] args) {
        String s="III";
        int n=0;
        for(int i=0;i<s.length();i++){
            int ch=value(s.charAt(i));
            if(i+1<s.length()&&ch<value(s.charAt(i+1))){
                n=n-ch;
            }else{
                n=n+ch;
            }
        }
        System.out.println(n);
    }
}

// 3