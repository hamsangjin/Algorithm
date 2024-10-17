import java.io.*;
import java.util.StringTokenizer;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/11054
// 401 - 다이나믹 프로그래밍1(연습) -> 가장 긴 바이토닉 부분 수열
// 시간 복잡도: O(n^2)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        // O(n)
        for (int i = 0; i < n; i++) nums[i] = Integer.parseInt(st.nextToken());

        int[] dp1 = new int[n];
        dp1[0] = 1;
        for(int i = 1; i < n; i++){
            dp1[i] = 1;
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i])   dp1[i] = Math.max(dp1[i], dp1[j] + 1);
            }
        }

        int[] dp2 = new int[n];
        dp2[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            dp2[i] = 1;
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[i])   dp2[i] = Math.max(dp2[i], dp2[j] + 1);
            }
        }

        int[] dp = new int[n];
        int ans = 1;
        for(int i = 0; i < n; i++){
            dp[i] = dp1[i] + dp2[i] - 1;
            ans = Math.max(ans, dp[i]);
        }
        System.out.println(ans);
    }
}