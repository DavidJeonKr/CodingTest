//Remove Element
public class Solution_28 {
    public int removeElement(int[] nums, int val) {
        int[] answer = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {

            }
            System.out.println("nums: " + nums[i]);
            //123123
        }

        return 0;
    }
    //부족한 금액 계산하기 - 프로그래머스
    public long solution(int price, int money, int count) {
        long answer = 0;
        for (int i = 1; i <= count ; i++) {
            answer += price * i;
        }

        return answer - money < 0 ? 0 : answer - money;
    }

    // 주민등록번호 - 백준
    // 경우의 수
    public int solution(String nums) {

        return 0;
    }

    public void testcase() {
//        int[] nums = {3,2,2,3};
//        int val = 3;
//        System.out.println(removeElement(nums, val));

        //결과값 10
        //System.out.println(solution(3,20,4));

        solution("XX0220051234567890X");
    }
}
