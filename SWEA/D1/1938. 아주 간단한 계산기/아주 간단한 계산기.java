import java.io.*;
import java.util.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		String[] tokens = br.readLine().split(" ");
        int a = Integer.parseInt(tokens[0]);
        int b = Integer.parseInt(tokens[1]);

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);  

		
	}
}