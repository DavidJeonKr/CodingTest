//자연수를 뒤집어 배열로 만들기

public class Solution_11 {
    public int[] solution(long n) {
        String str = String.valueOf(n);

        StringBuffer sb = new StringBuffer(str);
        String num = sb.reverse().toString();

        String[] arr = num.split("");
        int[] answer = new int[sb.length()];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }

        return answer;
    }

}
