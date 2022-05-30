import java.util.ArrayList;
import java.util.Arrays;

public class Solution_15 {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != i) {
                ans = i;
                return ans;
            }

            if(nums[nums.length-1] == i) {
                ans = nums.length;
                return ans;
            }
        }

        return ans;
    }
}
