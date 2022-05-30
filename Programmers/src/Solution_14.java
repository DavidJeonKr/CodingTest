import java.util.ArrayList;

// 이상한 문자 만들기
// 푸는 중
public class Solution_14 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        String[] temp = {};
        int idx = 0;
        String up = "";

        //
        for (String word: str) {
            temp = word.split(""); // temp t , r , y
            if(idx % 2 == 0) {
                temp[idx] = temp[idx].toUpperCase();
                idx++;
            } else if(idx % 2 == 1) {
                temp[idx] = temp[idx].toLowerCase();
                idx++;
            }

            answer += " ";
            idx++;
        }

        return answer;
    }
}
