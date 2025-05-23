import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] A = new int[N];
            int[] B = new int[M];
            st = new StringTokenizer(br.readLine());
            for(int i = 0; i <N; i++){
            	A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <M; j++){
            	B[j] = Integer.parseInt(st.nextToken());
            }
            
            int max= Integer.MIN_VALUE;
            
            if(N<=M) {
            	for(int i =0; i<=M-N; i++) {
                	int sum =0;
                    for(int j =0; j < N; j++) {
                    	sum += A[j] * B[i + j];
                    }
                    max = Math.max(max, sum);
                }
            }
            else {
            	for(int i =0; i<=N-M; i++) {
                	int sum =0;
                    for(int j =0; j < M; j++) {
                    	sum += B[j] * A[i+j];
                    }
                    max = Math.max(max, sum);
                }
            }
            System.out.println("#" + test_case + " " +max);
		}
	}
}