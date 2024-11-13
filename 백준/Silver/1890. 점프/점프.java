import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/1890
// 시간 복잡도: O(n^2)
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)     board[i][j] = Integer.parseInt(st.nextToken());
        }

        long[][] dp = new long[N][N];
        dp[0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int r = board[i][j];
                if(r == 0)  continue;
                
                if(i + r < N)   dp[i+r][j] += dp[i][j];
                if(j + r < N)   dp[i][j+r] += dp[i][j];
            }
        }

        System.out.println(dp[N-1][N-1]);
    }
}