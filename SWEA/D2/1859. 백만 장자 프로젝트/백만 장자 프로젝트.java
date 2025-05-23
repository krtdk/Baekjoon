
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
            int[] price = new int[N];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i =0; i < N; i++) {
            	price[i] = Integer.parseInt(st.nextToken());
            }
            
            long profit =0; 
            int maxPrice= 0;
            
            for(int i = N-1; i >=0; i--){
            	if(price[i]>maxPrice) {
                	maxPrice = price[i];
                }else {
                	profit += maxPrice - price[i];
                }
            }
            
           System.out.println("#" + test_case + " " + profit);
			

		}
	}
}