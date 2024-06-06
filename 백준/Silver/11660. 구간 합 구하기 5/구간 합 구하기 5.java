import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);

            int[][] arr = new int[n][n];
            int[][] dp = new int[n+1][n+1];
            for(int i = 0; i < n; i++) {
                String[] temp = br.readLine().split(" ");
                for(int j = 1; j <= n; j++){
                    arr[i][j-1] = Integer.parseInt(temp[j-1]);
                    dp[i+1][j] = + dp[i+1][j-1] + arr[i][j-1];
                }
            }

            for(int i = 0; i < m; i++) {
                String[] temp = br.readLine().split(" ");
                int x1 = Integer.parseInt(temp[0]);
                int y1 = Integer.parseInt(temp[1]);
                int x2 = Integer.parseInt(temp[2]);
                int y2 = Integer.parseInt(temp[3]);

                int sum = 0;
                for(int x = x1; x <= x2; x++)   sum += dp[x][y2] - dp[x][y1-1];
                System.out.println(sum);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}