import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        
        queue.offer(new int[]{0,0});
        visited[0][0] = true;
        
        maps[0][0] = 1;
        
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            if (x== n-1 && y== m-1) {
                return maps[x][y];
            }
            
            for (int i = 0; i <4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = true;
                        maps[nx][ny] = maps[x][y] + 1; 
                    }
                }
            }
        }
        
        return -1;
    }
}