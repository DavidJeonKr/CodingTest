// 키패드 누르기

public class Solution_10 {
    public String solution(int[] numbers, String hand) {

//        int numbers[] = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//        String hand = "right"; //result = "LRLLLRLLRRL"
//        1 2 3
//        4 5 6
//        7 8 9
//        * 0 #
        String answer = "";
        int leftindex= 10;
        int rightindex = 12;

        for(int number : numbers) {
            if(number == 1 || number == 4 || number == 7) {
                answer += "L";
                leftindex = number;
            } else if(number == 3 || number == 6 || number == 9) {
                answer += "R";
                rightindex = number;
            } else {
                if(number == 0) {
                    number +=11;
                }
                int ld = (Math.abs(number-leftindex))/3 + (Math.abs(number-leftindex)%3);
                int rd = (Math.abs(number-rightindex)/3 + (Math.abs(number-rightindex)%3));

                if(ld == rd) {
                    if(hand.equals("right")) {
                        answer +="R";
                        rightindex = number;
                    } else {
                        answer += "L";
                        leftindex = number;
                    }
                } else if(ld>rd) {
                    answer += "R";
                    rightindex = number;
                } else {
                    answer +="L";
                    leftindex = number;
                }
            }
        }
        return answer;
    }

}
