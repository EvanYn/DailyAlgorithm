package twoSum_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++)
            m.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
             int complement = target - nums[i];
             if (m.containsKey(complement) && m.get(complement) != i)
                 return new int[] {i, m.get(complement)};
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

}
