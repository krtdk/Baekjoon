import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int test_case = 1; test_case <= T; test_case++) {
            String[] inputs = br.readLine().split(" "); // 한 줄에 10개 숫자 입력
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < 10; i++) {
                int n = Integer.parseInt(inputs[i]);
                if (n > max) {
                    max = n;
                }
            }

            sb.append("#").append(test_case).append(" ").append(max).append("\n");
        }

        System.out.print(sb);
    }
}
