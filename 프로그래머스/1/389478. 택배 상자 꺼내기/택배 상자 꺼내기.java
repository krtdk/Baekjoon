class Solution {
    public int solution(int n, int w, int num) {
        int rows = (n + w -1) / w;
        int [][] house = new int[rows][w];
        int boxNum = 1;
        
        for (int r= 0; r < rows; r++) {
            if (r % 2 == 0){
                for (int c = 0; c < w && boxNum <= n; c++){
                    house[r][c] = boxNum++;
                }
            } else {
                for (int c =w -1; c >= 0 && boxNum <= n; c--) {
                    house [r][c] = boxNum++;
                }
            }
        }
        
        int targetRow = -1, targetCol =  -1;
        outerLoop:
        for (int r = 0; r< rows; r++) {
            for (int c = 0 ; c < w; c++){
                if (house[r][c]==num) {
                    targetRow = r;
                    targetCol = c;
                    break outerLoop;
                }
            }
        }
        
        int count = 0;
        for (int r = targetRow; r < rows; r++) {
            if (house[r][targetCol] != 0){
                count++;
            }
        }
        return count;
    }
}