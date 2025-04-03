class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        
        if((n&(n-1))== 0) {
            return arr;
        }
        
        int power = 1;
        while (power <n) {
            power *= 2;
        }
        
        int [] answer = new int[power];
        System.arraycopy(arr, 0, answer, 0 , n);
        
        return answer;
    }
}