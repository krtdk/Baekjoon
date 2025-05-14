import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
        int x = b-a;
        int y = c-b;
             
        double answer = Math.abs((x-y) /2.0);
            
        System.out.printf("#%d %.1f\n", test_case, answer);
		}
	}
}