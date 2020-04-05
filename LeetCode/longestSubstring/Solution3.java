package longestSubstring;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();

        int start = 0;
        int windowLen = 0;

        for (int end = 0; end < n; end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(map.get(s.charAt(end)), start);
            }
            windowLen = Math.max(windowLen, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }

        return windowLen;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
