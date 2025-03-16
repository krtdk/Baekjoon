import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // 약관 유효기간 저장
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] split = term.split(" ");
            termMap.put(split[0], Integer.parseInt(split[1]));
        }

        // 오늘 날짜를 총 일수로 변환
        int todayDays = convertToDays(today);

        // 개인정보 파기 여부 확인
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            int collectedDate = convertToDays(split[0]); // 수집 날짜 변환
            int expiry = termMap.get(split[1]) * 28; // 약관 유효기간 (월 → 일)

            if (collectedDate + expiry <= todayDays) { // 만료일이 오늘 이전이면 파기 대상
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    // 날짜를 총 일수로 변환하는 메서드
    private int convertToDays(String date) {
        String[] split = date.split("\\.");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}
