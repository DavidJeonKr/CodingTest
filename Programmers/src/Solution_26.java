// Max Consecutive Ones

import java.util.Arrays;

public class Solution_26 {


    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int n : nums) {
            if (n == 1) {
                count++;
                if (max < count) max = count;
            } else count = 0;
        }
        return max;
    }

    public int findNumbers(int[] nums) {
        int count =0;
        int answer =0;

        for (int i = 0; i < nums.length; i++) {
            int digits = (int) (Math.log10(nums[i]) + 1);
            if(digits%2 == 0) answer++;
        }


        return answer;
    }

    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = (int) Math.pow(nums[i], 2);
            System.out.println("result = " + result[i]);
        }
        Arrays.sort(result);


        return result;
    }






    public void testcase() {
//        int[] nums = {1, 1, 0, 1, 1, 1};
        // 결과 3
//        System.out.println(findMaxConsecutiveOnes(nums));

//        int[] nums = {12,345,2,6,7896}; // output = 2
//        System.out.println(findNumbers(nums));

        int[] nums = {-4,-1,0,3,10}; // {0,1,9,16,100}
        System.out.println(sortedSquares(nums));
    }
}
