class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = (int) Math.pow(nums[i], 2);
            System.out.println("result = " + result[i]);
        }
        Arrays.sort(result);


        return result;
    }
}