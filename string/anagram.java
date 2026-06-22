package string;

public class anagram {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";

        if(s1.length()!=s2.length()){
            System.out.println("Not an anagram");
        }
        int[] arr=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                System.out.println("Not an anagram");
                return;
            }
        }
        System.out.println("anagram");
    }
}

// true