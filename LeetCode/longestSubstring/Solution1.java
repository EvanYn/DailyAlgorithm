package longestSubstring;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        int longest = 1;

        for (int i = 0; i < s.length(); i++) {
            if (longestSubString(s, i) > longest)
                longest = longestSubString(s, i);
        }

        return longest;
    }

    public static int longestSubString(String s, int i) {
        int cnt = 1;
        Set<Character> tempSet = new HashSet<>();
        tempSet.add(s.charAt(i));

        for (int q = i+1; q < s.length(); q++) {
            if (!tempSet.contains(s.charAt(q))) {
                tempSet.add(s.charAt(q));
                cnt++;
            }
            else break;
        }

        return cnt;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
