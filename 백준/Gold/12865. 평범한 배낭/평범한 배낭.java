import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/12865
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int[] w = new int[n+1];
        int[] v = new int[n+1];

        for (int i = 1; i <= n; i++) {
            String[] wv = br.readLine().split(" ");
            w[i] = Integer.parseInt(wv[0]);
            v[i] = Integer.parseInt(wv[1]);
        }

        int[][] dp = new int[n+1][k+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                // i번째 무게를 더 담을 수 없는 경우 -> 현재 물건의 무게보다 현재 인덱스 무게(j)가 가벼운 경우를 의미
                // 그럼 이전 행으로 가서, 현재 무게의 가치 가져옴
                if(w[i] > j)    dp[i][j] = dp[i-1][j];
                // i번째 무게를 더 담을 수 있는 경우
                // 이전 행의 가치와, 
                // 이전 행의 현재 인덱스 무게(j) - 현재 물건의 무게의 가치(즉, 최대 j 배낭에서 현재 물건을 들고 남은 무게의 가치) + 현재 물건의 가치를 비교
                else            dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]] + v[i]);
            }
        }
//        for (int[] arr : dp)      System.out.println(Arrays.toString(arr));
        System.out.println(dp[n][k]);
    }
}