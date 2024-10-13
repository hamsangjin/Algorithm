
import java.io.*;
import java.util.StringTokenizer;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1912
// 400 - 다이나믹 프로그래밍1 -> 연속합
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)    arr[i] = Integer.parseInt(st.nextToken());

        int[] dp = new int[n+1];
        int ans = arr[0];
        dp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            // 현재 값과, 이전 값에 현재 값을 더하는 경우 둘 줄 큰 값
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            ans = Math.max(dp[i], ans);
        }
        System.out.println(ans);
    }
}