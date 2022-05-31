import java.util.Iterator;
import java.util.TreeSet;

// 두 개 뽑아서 더하기
public class Solution_24 {
    public int[] solution(int[] numbers) {


        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                treeSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[treeSet.size()];
        int i = 0;
        for (int n:treeSet) {
            answer[i++] = n;
        }

        return answer;
    }
}
