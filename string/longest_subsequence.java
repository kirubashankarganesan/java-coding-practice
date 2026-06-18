package string;
import java.util.*;
public class longest_subsequence {
    public static void main(String[] args) {
        String s1="digger";
        String s2="diggerdiagram";

        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        int longest=0;

        int c=0;
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]==ch2[i]){
                c++;
            }else{
                c=0;
            }
            longest=Math.max(longest,c);
        }
        System.out.println(c);
    }
}
