package removeDuplicate_26;

import java.util.Arrays;

public class Solution1 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int k = 0;
        for (int i = 0; i < nums.length; i++){
            nums[k] = nums[i];
            for (int j = i+1; j < nums.length; j++)
                if (nums[j] != nums[i]) {
                    k++;
                    i = j-1;
                    break;
                }
        }

        int[] newArray = Arrays.copyOfRange(nums,0, k+1);
        System.out.println(Arrays.toString(newArray));

        return k+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
