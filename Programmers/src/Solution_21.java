import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

//오픈채팅방
public class Solution_21 {
    public String[] solution(String[] record) {
        //recode = ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave
        //          uid1234", "Enter uid1234 Prodo","Change uid4567 Ryan"]
        ArrayList<String> chatLog = new ArrayList<>();
        HashMap<String, String> nickMap = new HashMap<>();

        for(String log : record) {
            StringTokenizer st = new StringTokenizer(log);
            String command = st.nextToken();
            String userId = st.nextToken();
            String nickname = "";

            if(!command.equals("Leave")) {
                nickname = st.nextToken();
            }

            switch(command) {
                case "Enter":
                    nickMap.put(userId, nickname);
                    chatLog.add(userId + "님이 들어왔습니다.");
                    break;
                case "Leave":
                    chatLog.add(userId + "님이 나갔습니다.");
                    break;
                case "Change":
                    nickMap.put(userId, nickname);
            }
        }

        String[] answer = new String[chatLog.size()];
        int logIdx = 0;

        for(String str : chatLog) {
            int endOfId = str.indexOf("님");
            String userId = str.substring(0, endOfId);

            answer[logIdx++] = str.replace(userId, nickMap.get(userId));
        }

        //닉네임 변경 방법 2가지
        //방법 1.
        // 채팅방을 나간 후 새로운 닉네임으로 다시 들어온다.
        //방법 2.
        // 채팅방에서 닉네임을 변경한다.


        return answer;
    }

}
