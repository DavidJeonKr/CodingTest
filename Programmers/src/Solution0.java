public class Solution0 {
    public static void main(String[] args) {

//        System.out.println(solution(12));
        Solusion1 s1 = new Solusion1();
        System.out.println(s1.solution(10)); //41
    }

        //약수의 합
        public static int solution(int n ) {
            int answer = 0;

            for (int i = 1; i <=n; i++) {
                if (n % i == 0) {
                    answer += i;
                }
            }
            return answer;
        }


}


