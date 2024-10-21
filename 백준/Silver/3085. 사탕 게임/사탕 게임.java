import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/3085
// 500 - 브루트포스 -> 사탕 게임
// 시간 복잡도: O(n^4)
// - 연산횟수: 50^4 = 6,250,000번
public class Main {
    static String[][] board;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        board = new String[n][n];
        // O(n)
        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split("");
            for (int j = 0; j < n; j++)     board[i][j] = temp[j];
        }

        int max = 0;
        // O(n^4)
        // O(n)
        for(int i = 0; i < n; i++){
            // O(n)
            for(int j = 0; j < n; j++){
                if(j < n - 1){
                    swap(i, j, i, j + 1);
                    // O(n^2)
                    max = Math.max(max, calMaxCandy());
                    swap(i, j, i, j + 1);
                }

                if (i < n - 1){
                    swap(i, j, i + 1, j);
                    max = Math.max(max, calMaxCandy());
                    swap(i, j, i + 1, j);
                }
            }
        }
        System.out.println(max);
    }

    // O(n^2)
    private static int calMaxCandy() {
        int max = 0;
        // O(n)
        for(int i = 0; i < n; i++){
            int rowMax = 1;
            int colMax = 1;
            // O(n)
            for(int j = 1; j < n; j++){
                if(board[i][j-1].equals(board[i][j])){
                    rowMax ++;
                } else{
                    max = Math.max(max, rowMax);
                    rowMax = 1;
                }
                if(board[j-1][i].equals(board[j][i])){
                    colMax ++;
                } else{
                    max = Math.max(max, colMax);
                    colMax = 1;
                }
            }

            max = Math.max(max, Math.max(rowMax, colMax));
        }
        return max;
    }

    private static void swap(int x1, int y1, int x2, int y2){
        String temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }
}