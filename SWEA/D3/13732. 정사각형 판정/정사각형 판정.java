import java.util.*;
import java.io.*;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());
            char[][] grid = new char[n][n];
            int minX = n, maxX = 0;
            int minY = n, maxY = 0;

            for (int i = 0; i < n; i++) {
                grid[i] = br.readLine().toCharArray();
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '#') {
                        minX = Math.min(minX, i);
                        maxX = Math.max(maxX, i);
                        minY = Math.min(minY, j);
                        maxY = Math.max(maxY, j);
                    }
                }
            }

            String result = "yes";
            for (int x = minX; x <= maxX; x++) {
                for (int y = minY; y <= maxY; y++) {
                    if (grid[x][y] != '#') {
                        result = "no";
                    }
                }
            }

            if (maxX - minX != maxY - minY) {
                result = "no";
            }

            sb.append("#").append(test_case).append(" ").append(result).append("\n");
        }
        System.out.print(sb);
    }
}
