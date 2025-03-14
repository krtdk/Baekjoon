class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0; // 총 증설 횟수
        int active = 0; // 현재 활성화된 서버 수
        int[] expire = new int[24]; // 각 시간대에 반납 서버 수
        
        for (int hour = 0; hour < 24; hour++) {
            active -= expire[hour];
            
            int required = players[hour] / m;
            
            if (active < required) {
                int add = required - active;
                answer += add;    
                active += add;    
                
                if (hour + k < 24) {
                    expire[hour + k] += add;
                }
            }
        }
        return answer;
    }
}
