import java.util.*;

//Remove Element
public class Solution_28 {
    public int removeElement(int[] nums, int val) {
        int index= 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) nums[index++] = nums[i];
        }

        return index;
    }
    //remove Duplicates from Sorted Array
    public int removeDuplicates(int[] nums) {

        int index = 1;

        for (int i = 0; i < nums.length -1 ; i++) {
            if(nums[i] != nums[i +1]) {
                nums[index++] = nums[i+1];
            }
        }

        return index;
    }

    //Check If N and Its Double Exist
    public boolean checkIfExist(int[] arr) {
        //10 2 5 3
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == 2*arr[j] || arr[j] == 2*arr[i]) return true;
            }
        }
        return false;
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

        return 1;
    }

    public void testcase() {
//        int[] nums = {3,2,2,3};
//        int val = 3;
//        System.out.println(removeElement(nums, val));

        //결과값 10
        //System.out.println(solution(3,20,4));

        solution("XX0220051234567890X");
//        int[] nums = {1,1,2};
//        System.out.println(removeDuplicates(nums));

        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
}
