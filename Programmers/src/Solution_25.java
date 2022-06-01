//전화번호 목록


import java.util.HashSet;
import java.util.Set;

public class Solution_25 {

    public boolean solution(String[] phone_book) {

        // "119", "97674223", "1195524421"]
        // return : false
        boolean answer = true;

        Set<String> hashSet = new HashSet<>();

        for (String str: phone_book) {
            hashSet.add(str);
        }
        if(hashSet.contains(phone_book[0])) answer = false;
        return answer;
    }

    public void test_case() {
        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book1 = {"123","456","789"};

        System.out.println("test1: "+solution(phone_book));
        System.out.println("test2: "+solution(phone_book1));
    }

}

