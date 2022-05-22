//숫자 문자열과 영단어
public class Solution_05 {
    // String s = one4seveneight;
    // 결과값 = 1478
    public int solution(String s) {
        int answer = 0;
        String[] number = {"0","1","2","3","4","5","6","7","8","9"};
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        int i = 0;
        for (String str1: str) {
            s = s.replace(str1, number[i]);
            i++;
        }

        return Integer.parseInt(s);
    }
}