    package string;

    import java.util.*;

    public class longest_common_prefix {
        public static void main(String[] args) {
            String str[]={"flower","flow","flight"};
            int n=str.length;
            Arrays.sort(str);
            int st=0;
            StringBuilder sb=new StringBuilder();
            while(st<str[0].length()&& st<str[n-1].length()){
                if(str[0].charAt(st)==str[n-1].charAt(st)){
                    sb.append(str[0].charAt(st));
                    st++;
                }else{
                    break;
                }
            }
            System.out.println(sb.toString());
        }
    }

// fl

        // String[] str = {"flower", "flow", "flight"};

        // String prefix = str[0];

        // for (int i = 1; i < str.length; i++) {
        //     while (!str[i].startsWith(prefix)) {
        //         prefix = prefix.substring(0, prefix.length() - 1);
        //     }
        // }

        // System.out.println(prefix);
 