import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       	int T = Integer.parseInt(br.readLine()); 
       

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = Integer.parseInt(br.readLine());
            int [][] matrix = new int [N][N];
            
            //입력 행렬
            for(int i =0; i <N; i++){
            	StringTokenizer st = new StringTokenizer(br.readLine());
            	for(int j= 0; j < N; j++) {
                	matrix[i][j] = Integer.parseInt(st.nextToken());
                }
            }
				System.out.println("#" + test_case);
            
            for (int i =0; i < N; i++) {
            	StringBuilder sb90 = new StringBuilder();
                StringBuilder sb180 = new StringBuilder();
                StringBuilder sb270 = new StringBuilder();
                
                
                //90 
                for(int j = 0; j < N; j++) {
                	sb90.append(matrix[N - 1 -j][i]);
                }
                
                //180
                for(int j = 0; j < N; j++) {
                	sb180.append(matrix[N -1 -i] [N-1-j]);
                }
                
                //270 
                for(int j = 0; j < N; j++) {
                	sb270.append(matrix[j] [N-1-i]);
                }
			System.out.println(sb90 + " " + sb180 + " " + sb270);
            }

		}
	}
}