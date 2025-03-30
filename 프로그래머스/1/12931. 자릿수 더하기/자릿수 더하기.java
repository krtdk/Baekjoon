import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String numberStr = String.valueOf(n);
        for (char digit : numberStr.toCharArray()) {
            answer += Character.getNumericValue(digit); 
        }


        return answer;
    }
}