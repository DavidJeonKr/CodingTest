import java.util.ArrayList;

// 이상한 문자 만들기
// 푸는 중
public class Solution_14 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        String[] temp = {};
        String up = "";
        //
        for (String word: str) {
            temp = word.split("");
            for (int i = 0; i <= temp.length; i+=2) {
                temp[i].toUpperCase();
                }
            for (String result : temp) {
                answer += result;
            }
            answer += " ";
        }

        return answer;
    }
}
