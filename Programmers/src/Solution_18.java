import java.util.Arrays;

//k번째 수
public class Solution_18 {
    public int[] solution(int[] array, int[][] commands) {
//        int[] array = {1, 5, 2, 6, 3, 7, 4};
//        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        int[] answer = new int[commands.length];
        int[] temp = {};

        int result = 0;
        for (int i = 0; i < commands.length; i++) {
            temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            result = temp[commands[i][2] - 1];
            answer[i] = result;
        }
        // 숫자 자르기

        // 숫자 정렬

        // k번째 수 구하기

        return answer;
    }

}
