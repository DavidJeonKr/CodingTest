import java.util.Arrays;
//문자열 내 마음대로 정렬하기
public class Solution_20 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        String temp = "";
        String[] s = {};
        String[] result = new String[strings.length];
        int i = 0;
        for (String str: strings) {
            temp = str;
            //배열 s에 s[0] = s, s[1] = u s[2] = n
            s = temp.split("");
            String test = s[n] + temp;
            result[i] = test;
            i++;
        }
        Arrays.sort(result);
        i = 0;
        for (String string: result) {
            result[i] = string.substring(1,string.length());
            System.out.println("result: " + result[i]);
            i++;
        }
        return result;
    }
}