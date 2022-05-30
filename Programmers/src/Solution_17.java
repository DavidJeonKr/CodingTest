public class Solution_17 {
    public int findMaxConsecutiveOnes(int[] n) {
        int a = 0;
        int b = 0;
        int result = 0;
        for (int i = 0; i < n.length; i++ ) {

            if(n[i] == 0) {
                result = (a > b) ? a : b;
                a = 0;
            }


            a++;
        }


        return 0;
    }
}
