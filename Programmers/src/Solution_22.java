// 크레인 인형뽑기
import java.util.Stack;

public class Solution_22 {
    public int solution(int[][] board, int[] moves) {
        // board =
        // [
        // [0,0,0,0,0],
        // [0,0,1,0,3],
        // [0,2,5,0,1],
        // [4,2,4,4,2],
        // [3,5,1,3,1]]
        // movies = [1,5,3,5,1,2,1,4]
        // result = 4
//        Stack<Integer> stack = new Stack<>(); //int형 스택 선언
//        stack.push(1);     // stack에 값 1 추가
//        stack.push(2);     // stack에 값 2 추가
//        stack.push(3);     // stack에 값 3 추가
//        stack.peek();     // stack의 가장 상단의 값 출력
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i < moves.length; i++) {
            for(int j=0; j < board.length; j++) {
                if(board[j][moves[i]-1] != 0) {
                    if(!stack.empty() && stack.peek() == board[j][moves[i]-1]) {
                        answer++;

                        stack.pop();
                        board[j][moves[i]-1] = 0;
                        break;
                    } else {
                        stack.push(board[j][moves[i]-1]);
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                }
            }
        }
        return answer*2;
    }
}
