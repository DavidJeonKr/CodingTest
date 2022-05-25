import java.util.Arrays;
import java.util.stream.Stream;

//자릿수 더하기
public class Solution_12 {
    public int solution(int n) {
        //n = 123
        int answer = 0;
        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < digits.length; i++) {
            answer += digits[i];
        }

        return answer;
    }

}
