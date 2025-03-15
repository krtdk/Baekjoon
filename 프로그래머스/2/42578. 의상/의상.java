import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] c : clothes) {
            String type = c[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
            
        }
        
        int answer =1 ;
        for (int count : map.values()) {
            answer *= (count + 1);
        }
        
        return answer -1 ;
    }
}