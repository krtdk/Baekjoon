import java.util.*;

public class Solution {
    public int solution(String numbers) {
        List<Integer> primeList = new ArrayList<>();

        // 모든 숫자 조합
        for (int i = 1; i <= numbers.length(); i++) {
            generateCombinations("", numbers, primeList, i);
        }

        // 소수 개수 
        List<Integer> uniquePrimes = new ArrayList<>();
        for (int num : primeList) {
            if (isPrime(num) && !uniquePrimes.contains(num)) {
                uniquePrimes.add(num);
            }
        }

        return uniquePrimes.size();
    }

    private void generateCombinations(String prefix, String numbers, List<Integer> primeList, int length) {
        if (length == 0) {
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            String newPrefix = prefix + numbers.charAt(i);
            String remaining = numbers.substring(0, i) + numbers.substring(i + 1);

            // 조합 List에 추가
            if (newPrefix.length() > 0) {
                primeList.add(Integer.parseInt(newPrefix));
            }

            // 다음 조합 생성
            generateCombinations(newPrefix, remaining, primeList, length - 1);
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
