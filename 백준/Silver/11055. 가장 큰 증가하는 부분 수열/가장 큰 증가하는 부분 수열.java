import java.io.*;
import java.util.StringTokenizer;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/11055
// 401 - 다이나믹 프로그래밍1(연습) -> 가장 큰 증가하는 부분 수열
// 시간 복잡도: O(n^2)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)      nums[i] = Integer.parseInt(st.nextToken());

        int[] dp = new int[n];
        int ans = 0;
        for(int i = 0; i < n; i++){
            dp[i] = nums[i];
            int max = 0;
            for (int j = 0; j < i; j++){
                if(nums[i] > nums[j])   max = Math.max(dp[j], max);
            }
            dp[i] += max;
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
}