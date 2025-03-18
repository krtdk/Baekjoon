import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] days = new int[n];
        
        for (int i = 0; i< n; i++) {
            days[i] = (int)Math.ceil((100.0-progresses[i]) / speeds[i]);
        }
        
        List<Integer> result = new ArrayList<>();
        int maxDays = days[0];
        int count = 1;
        
        for (int i =1; i<n; i++){
            if(days[i] <= maxDays) {
                count ++;
            } else {
                result.add(count);
                maxDays = days[i];
                count = 1;
            }
        }
        
        result.add(count);
        return result.stream().mapToInt(i -> i).toArray();
    }
}