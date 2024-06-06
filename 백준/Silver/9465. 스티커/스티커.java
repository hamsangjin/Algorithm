import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int T = Integer.parseInt(br.readLine());
            for(int t = 0; t < T ; t++) {
                int n = Integer.parseInt(br.readLine());

                int[][] scores = new int[2][n+1];
                for(int i = 0; i < 2; i++) {
                    String[] temp = br.readLine().split(" ");
                    for(int j = 1; j <= n; j++)      scores[i][j] = Integer.parseInt(temp[j-1]);
                }

                int[][] dp = new int[2][n+1];
                dp[0][1] = scores[0][1];
                dp[1][1] = scores[1][1];
                for(int i = 2; i <= n; i++) {
                    dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + scores[0][i];
                    dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + scores[1][i];
                }

                System.out.println(Math.max(dp[0][n], dp[1][n]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}