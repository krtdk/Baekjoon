import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int N, int number) {
       if (number == N){
           return 1;
       }
        if (number < N) {
            return -1;
        }
        
        Set<Integer>[] dp = new HashSet[9];
        
        for (int i =1; i<= 8; i++) {
            dp[i] = new HashSet<>();
            int num = Integer.parseInt(String.valueOf(N).repeat(i));
            dp[i].add(num);
            
            for(int j =1; j< i; j++){
                for(int num1 : dp[j]) {
                    for (int num2 : dp[i-j]){
                        dp[i].add(num1 + num2);
                        dp[i].add(num1 - num2);
                        dp[i].add(num1 * num2);
                        if (num2!= 0){
                            dp[i].add(num1 / num2);
                        }
                    }
                }
            }
            if (dp[i].contains(number)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        
    }
}