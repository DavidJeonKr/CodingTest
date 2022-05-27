class Solution {
    public int numberOfSteps(int num) {
        int answer = 0;
        for(; num > 0; answer++)
            if(num %2 == 1) num--;
            else num /= 2;
        return answer;
    }
}