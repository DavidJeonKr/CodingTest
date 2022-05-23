//3진법 뒤집기

public class Solution_06 {

    public int solution(int n) {
        int answer = 0;
        String temp = "";


        // 3진법 으로 변환
        while(n > 0) {
            temp = (n % 3) + temp;

            n /= 3;
        }

        //3진법으로 변환한 수 뒤집어주기
        StringBuffer sb = new StringBuffer(temp);
        String reverse = sb.reverse().toString();
        // 3진법에서 10진법으로 변환
        answer = Integer.parseInt(reverse, 3);



        return answer;
    }

}
