import java.util.ArrayList;

// 문자열 다루기 기본
public class Solution_07 {

    public boolean solution(String s) {

        if(s.length() == 4 || s.length() == 6) {
            try {
                int x = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        } else return false;
    }

}
