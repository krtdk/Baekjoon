
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int maxPick = nums.length/2;
        HashSet<Integer> uniqueTypes = new HashSet<>();
        
        for (int num : nums) {
            uniqueTypes.add(num);
        }
        
        return Math.min(maxPick, uniqueTypes.size());
    }
}