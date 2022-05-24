

public class Solution_08 {
    boolean solution(String s) {
        int p = 0;
        int y = 0;

        String temp = s.toLowerCase();
        String strArray[] = temp.split("");

        for (String str:strArray) {
            if(str.equals("p")) p++;
            if(str.equals("y")) y++;
        }

        if(p == y) return true;

        return false;
    }


}
//배워야 하는 것
//람다식
class Solution {
    boolean solution(String s) {
        s = s.toUpperCase();

        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }
}