import java.util.Arrays;

// 완주하지 못한 선수
public class Solution_04 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;
        for (i = 0; i < completion.length; i++) {

            if(!participant[i].equals(completion[i])) return participant[i];
        }
        return participant[i];
    }
}
