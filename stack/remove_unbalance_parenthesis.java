package stack;

import java.util.*;

public class remove_unbalance_parenthesis {
    static String invalid(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        boolean[] remove = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(i);
            }else if(ch==')'){
                if(!st.isEmpty()){
                    st.pop();
                }else{
                    remove[i]=true;
                }
            }
        }
        while(!st.isEmpty()){
            remove[st.pop()]=true;
        }
        for(int i=0;i<s.length();i++){
            if(!remove[i]){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "((ab)(ab)";
        System.out.println(invalid(s));
    }
}
