import java.util.Arrays;

//예산
public class Solution_13 {
    public int solution(int[] d, int budget) {
        // 1 3 2 5 4 예산 9
        // 2 2 3 3 예산 10
        // 경우의 수
        // 1 3 2 5 4 = 15 / 5 = 3
        // 2 2 3 3 = 10 / 4 = 2.5
        // 프로그래밍적 사고로 해라
        int answer = 0;
        int result = 0;
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            result += d[i];
            if(result > budget) {
                answer = i;
                break;
            }
        }
        if(result <= budget) {
            answer = d.length;
        }
        return answer;

        //another
//        int answer = 0;
//        Arrays.sort(d);
//        for (int i = 0; i < d.length; i++) {
//            budget -= d[i];
//            if(budget < 0) break;
//            answer++;
//        }
//        return answer;
    }


}
