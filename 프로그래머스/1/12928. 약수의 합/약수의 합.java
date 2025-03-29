class Solution {
    public int solution(int n) {
         if (n < 0 || n > 3000) {
            return 0; 
        }
        
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { 
                total += i;
            }
        }
        return total;
}
}