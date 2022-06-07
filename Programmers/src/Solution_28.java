//Remove Element
public class Solution_28 {
    public int removeElement(int[] nums, int val) {
        int[] answer = new int[nums.length];
        

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {

            }
            System.out.println("nums: " + nums[i]);
        }

        return 0;
    }

    public void testcase() {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
