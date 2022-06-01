//전화번호 목록


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution_25 {

    public boolean solution(String[] phone_book) {

        // "119", "97674223", "1195524421"]
        // return : false
        boolean answer = true;

        Map<Object, Object> map = new HashMap<>();

        for (String s: phone_book) {
            map.put(s, 1);
        }

        for (String s: phone_book) {
            for (int i = 0; i < s.length(); i++) {
                String prefix = s.substring(0, i);
                if(map.containsKey(prefix)) answer = false;
            }
        }

        return answer;
    }

    public void test_case() {
        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book1 = {"123","456","789"};

        System.out.println("test1: "+solution(phone_book));
        System.out.println("test2: "+solution(phone_book1));
    }

}

