package string;

public class removeduplicate {
    public static void main(String[] args) {
        String s="hello";
        int arr[]=new int[256];
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]==0){
                System.out.print(s.charAt(i));
                arr[s.charAt(i)]++;
            }
        }
    }
}

// helo