import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] trees = new int[N];

            int maxHeight = 0;
            for (int i = 0; i < N; i++) {
                trees[i] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, trees[i]);
            }

            int odd = 0, even = 0;
            for (int i = 0; i < N; i++) {
                int diff = maxHeight - trees[i];
                odd += diff % 2;
                even += diff / 2;
            }


            int days = 0;
            while (true) {
                int oddDays = (days + 1) / 2; 
                int evenDays = days / 2;      

                if (odd <= oddDays && even * 2 <= evenDays * 2 + (oddDays - odd)) {
                    
                    break;
                }

                days++;
            }

            System.out.println("#" + test_case + " " + days);
        }
    }
}
