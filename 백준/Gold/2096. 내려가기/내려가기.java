import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());

            int[][][] dp = new int[n+1][3][2];

            for(int i = 1; i <= n; i++) {
                String[] temp = br.readLine().split(" ");
                int a = Integer.parseInt(temp[0]);
                int b = Integer.parseInt(temp[1]);
                int c = Integer.parseInt(temp[2]);

                // 최대값
                dp[i][0][0] = Math.max(dp[i-1][0][0], dp[i-1][1][0]) + a;
                dp[i][1][0] = Math.max(Math.max(dp[i-1][0][0], dp[i-1][1][0]), dp[i-1][2][0]) + b;
                dp[i][2][0] = Math.max(dp[i-1][1][0], dp[i-1][2][0]) + c;

                // 최대값
                dp[i][0][1] = Math.min(dp[i-1][0][1], dp[i-1][1][1]) + a;
                dp[i][1][1] = Math.min(Math.min(dp[i-1][0][1], dp[i-1][1][1]), dp[i-1][2][1]) + b;
                dp[i][2][1] = Math.min(dp[i-1][1][1], dp[i-1][2][1]) + c;
            }

            int max = Math.max(Math.max(dp[n][0][0], dp[n][1][0]), dp[n][2][0]);
            int min = Math.min(Math.min(dp[n][0][1], dp[n][1][1]), dp[n][2][1]);
            System.out.println(max + " " + min);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

