import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> result = new ArrayList<>();
        
        for (int[] command : commands){
            int i = command[0];
            int j = command[1];
            int k = command[2];
            
            // i번째부터 j번쨰까지 자르고 정렬
            int [] subArray = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(subArray);
            
            //k번째 숫자 추가
            result.add(subArray[k-1]);
        }
        
        return result.stream().mapToInt( i-> i).toArray();
    }
}