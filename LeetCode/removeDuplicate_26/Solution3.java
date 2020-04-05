package removeDuplicate_26;

import java.util.Arrays;

public class Solution3 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j-1]) {
                i++;
                nums[i] = nums[j];
            }
        }

        int[] newArray = Arrays.copyOfRange(nums,0, i+1);
        System.out.println(Arrays.toString(newArray));

        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
