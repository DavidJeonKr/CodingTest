import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution_27 {
    public void duplicateZeros(int[] arr) {

        for(int i=0; i < arr.length-1; i++) {
            if(arr[i] == 0 ) {
                for (int j = arr.length-1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n -1;
        int i = m - 1;
        int j = n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] < nums2[j]) {
                nums1[index--] = nums2[j--];
            } else {
                nums1[index--] = nums1[i--];
            }
        }

        while( j >= 0) {
            nums1[index--] = nums2[j--];
        }

    }

    //소수 만들기
    public int solution(int[] nums) {
        int answer = 0;
        boolean chk = false;
        //3개를 더한 값
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if(num >= 2) chk = chkNum(num); // 공식
                    System.out.println("num: " + num + chk);
                    if(chk == true) answer++;
                }
            }
        }
        //소수를 만드는 공식
        return answer;
    }

    public boolean chkNum(int num) {
        boolean prime[] = new boolean[121];
        int N = 120;

        prime[0] = prime[1] = true;

        for (int i = 2; i*i <= N ; i++) {
            if(!prime[i]) {
                for (int j = i*i; j <= N; j+=i) {
                    prime[j] = true;
                }
            }
        }

        if(prime[num] == true) {
            return false;
        }


        return true;
    }

    public String solution(String s) {
        String answer = "";

        if(s.length()%2 == 0) { //짝수
            answer = s.substring(s.length()/2-1, s.length()/2+1);
        } else { // 홀수
            answer = s.substring(s.length()/2, s.length()/2+1);
        }
        return answer;
    }

    //행렬의 덧셈
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        //1 2   3 4    4 6
        //2 3   5 6    7 9

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;

    }

    // x만큼 간격이 있는 n개의 숫자
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num; // answer[0] = answer[0] + x;
            num += x;
            System.out.println(answer[i]);
        }


        return answer;
    }


    public void testcase() {

//        int[] nums1 = {1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = {2,5,6};
//        int n = 3;
//        merge(nums1,m,nums2, n);


//        int[] nums = {1,2,3,4};
        // result = 1
//        int[] nums1 = {1,2,7,6,4};
//        System.out.println(solution(nums));
//        System.out.println(solution(nums1));

//        String s = "abcde";
//        String s1 = "qwer";
//        System.out.println(solution(s));
//        System.out.println(solution(s1));

//        int[][] arr1 = {{1,2}, {2,3}};
//        int[][] arr2 = {{3,4}, {5,6}};
//
//        int[][] arr3 = {{1}, {2}};
//        int[][] arr4 = {{3}, {4}};



//        System.out.println(solution(arr1,arr2));
        //System.out.println(solution(arr3,arr4));
        int x = 2,  n = 5;
        System.out.println(solution(x,n));



    }
}
