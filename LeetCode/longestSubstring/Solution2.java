package longestSubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();

        int start = 0;
        int end = 0;
        int windowLen = 0;

        while (start < n && end < n){
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                windowLen = Math.max(windowLen, end - start);
            } else set.remove(s.charAt(start++));
        }

    return windowLen;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
