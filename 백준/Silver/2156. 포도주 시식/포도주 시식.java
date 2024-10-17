import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/2156
// 401 - 다이나믹 프로그래밍1(연습) -> 포도주 시식
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] w = new int[n];
        for (int i = 0; i < n; i++)     w[i] = Integer.parseInt(br.readLine());

        int[] dp = new int[n];
        dp[0] = w[0];

        for(int i = 1; i < n; i++){
            // n이 2인 경우
            if(i == 1){
                dp[i] = w[i-1] + w[i];
                continue;
            }
            // n이 3인 경우
            if(i == 2){
                dp[i] = Math.max(dp[i-1], Math.max(w[i-2] + w[i], w[i-1] + w[i]));
                continue;
            }
            // 1. 현재 와인을 제외한 왼쪽 두 개의 와인을 먹는 경우
            // 2. 현재 와인과 왼쪽 두 번째의 와인을 먹는경우
            // 3. 현재 와인과 왼쪽 와인을 먹는경우(이 경우 왼쪽에서 세 번째 dp값을 더해야 누적된 값을 구할 수 있음)
            // 위 값들의 최대값을 구하는 것
            dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + w[i], dp[i-3] + w[i-1] + w[i]));
        }

        System.out.println(dp[n-1]);
    }
}