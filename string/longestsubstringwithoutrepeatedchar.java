package string;

public class longestsubstringwithoutrepeatedchar {
    public static void main(String[] args) {
        String s = "abcdabc";
        int maxlen = 0;
        int left = 0;
        int[] arr = new int[256];
        for (int right = 0; right < s.length(); right++) {
            arr[s.charAt(right)]++;
            while (arr[s.charAt(right)] > 1) {
                arr[s.charAt(left)]--;
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
        }
        System.out.println(maxlen);
    }
}

// 4
