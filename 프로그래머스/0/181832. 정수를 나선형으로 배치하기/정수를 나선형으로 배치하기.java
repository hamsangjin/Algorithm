class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int x = 0 , y = 0, dir = 0, num = 1;
        
        while(num <= n*n){
            answer[x][y] = num++;
            
            if (dir == 0){
                if (y == n-1 || answer[x][y+1] != 0){
                    dir = 1;
                    x += 1;
                } else{
                    y += 1;
                }
            } else if (dir == 1){
                if (x == n-1 || answer[x+1][y] != 0){
                    dir = 2;
                    y -= 1;
                } else{
                    x += 1;
                }
            } else if (dir == 2){
                if (y == 0 || answer[x][y-1] != 0){
                    dir = 3;
                    x -= 1;
                } else{
                    y -= 1;
                }
            } else if (dir == 3){
                if (x == 0 || answer[x-1][y] != 0){
                    dir = 0;
                    y += 1;
                } else{
                    x -= 1;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}