package removeDuplicate_26;

import java.util.Arrays;

public class Solution3 {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        int len = nums.length;

        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }

        int[] newArray = Arrays.copyOfRange(nums,0, j);
        System.out.println(Arrays.toString(newArray));

        return j;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
