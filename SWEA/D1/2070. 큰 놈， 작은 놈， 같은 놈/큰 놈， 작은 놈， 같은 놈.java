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
			StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            char result;
            
            if ( a> b){
            	result = '>';
            } else if ( a < b) {
            	result = '<'; 	
            } else {
            	result = '=';
            }
            System.out.print("#" + test_case + " " + result + "\n"); 
		}
	}
}