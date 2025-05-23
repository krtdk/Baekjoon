
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
            
            StringBuilder sb = new StringBuilder();
            
            for (int i =0; i < N; i++){
            	StringTokenizer st = new StringTokenizer(br.readLine());
                char Ci = st.nextToken().charAt(0);
                int Ki = Integer.parseInt(st.nextToken()); 
                
                for(int j = 0 ; j < Ki; j++) {
                	sb.append(Ci);
                }
            }
            System.out.print("#" + test_case+ "\n");
            for(int i =0; i < sb.length(); i++) {
            	System.out.print(sb.charAt(i));
                if( (i+1) % 10 == 0) {
                	System.out.println();
                } 
            }
            if (sb.length() % 10 !=0) {
                	System.out.println(); 
                } 

		}
	}
}