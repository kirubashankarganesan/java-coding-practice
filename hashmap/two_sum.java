package hashmap;

import java.util.HashMap;

public class two_sum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        HashMap<Integer, Integer> map = new HashMap<>();
        int t = 9;
        for(int i=0;i<arr.length;i++){
            int need=t-arr[i];
            if(map.containsKey(need)){
                System.out.println(map.get(need)+" "+i);
                return;
            }
            map.put(arr[i],i);
        }
    }
}
