import java.util.ArrayList;
import java.util.Arrays;

public class Solution_29 {

    //평균 구하기 - 프로그래머스
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (double num: arr
             ) {
            sum += num;
        }

        answer = sum/arr.length;
        // Arrays.stream(arr).average().getAsDouble();

        return answer;
    }
    // 콜라츠 추측 - 프로그래머스
    public int solution(int num) {
        int answer = 0;
        long n = (long) num;
        while(n!=1) {
            if(n%2==0) {
                n /=2;
            } else {
                n = 3*n +1;
            }

            answer++;
            if(answer==500) {
                answer=-1; break;
            }
        }


        return answer;
    }

    // 같은 숫자는 싫어 - 프로그래머스
    public int[] solution29(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        int preNum = 10;

        for(int i = 0; i <  arr.length; i++ ){
            if(preNum != arr[i]) {
                list.add(arr[i]);
            }
            preNum = arr[i];
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).intValue();
        }
        return answer;
    }



    public void testcase() {

//        int[] arr = {1,2,3,4};
//        int[] arr1 = {5,5};
//        System.out.println(solution(arr));
//        System.out.println(solution(arr1));

//        int n = 6;
//        int n1 = 626331;
//        System.out.println(solution(n));
//        System.out.println(solution(n1));

        int[] arr = {1,1,3,3,0,1,1};
        int[] arr1 = {4,4,3,3};
        System.out.println(solution29(arr));
        System.out.println(solution29(arr1));
    }
}
