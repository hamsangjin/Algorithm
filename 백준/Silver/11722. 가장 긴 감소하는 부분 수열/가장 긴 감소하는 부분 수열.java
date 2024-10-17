import java.io.*;
import java.util.StringTokenizer;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/11722
// 401 - 다이나믹 프로그래밍1(연습) -> 가장 긴 감소하는 부분 수열
// 시간 복잡도: O(n^2)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        // O(n)
        for (int i = 0; i < n; i++) nums[i] = Integer.parseInt(st.nextToken());

        int[] dp = new int[n];
        dp[0] = 1;
        int ans = 1;
        // O(n)
        for (int i = 1; i < n; i++) {
            int max = 0;
            // O(n)
            for (int j = 0; j < i; j++) {
                if(nums[i] < nums[j])   max = Math.max(max, dp[j]);
            }
            dp[i] = max + 1;
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
}