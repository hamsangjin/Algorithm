import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/16194
// 400 - 다이나믹 프로그래밍1 -> 카드 구매하기2
// 시간 복잡도: O(n^2)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] p = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++)    p[i] = Integer.parseInt(st.nextToken());

        // 카드 구매하기 1번 문제와 다르게 최소값을 구하는 문제이므로,
        // dp[0]을 제외한 배열의 초기값을 큰값으로 변경해준다.
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        /*
        4개 살 때의 최소값 구하는 과정
        dp[1] = 1개 살 때는 p[1] 값이 무조건 최소값
        dp[2]
            - 1개 살 때 최소값인 dp[1]에 p[1] 값 추가하기
            - p[2] 값
        dp[3]
            - 1개 살 때 최소값인 dp[1]에 p[2] 값 추가하기
            - 2개 살 때 최소값인 dp[2]에 p[1] 값 추가하기
            - p[3] 값
        dp[4]
            - 1개 살 때 최소값인 dp[1]에 p[3] 값 추가하기
            - 2개 살 때 최소값인 dp[2]에 p[2] 값 추가하기
            - 3개 살 때 최소값인 dp[3]에 p[1] 값 추가하기
            - p[4] 값
        */

        // 외부 루프: O(n)
        for(int i = 1; i <= n; i++){
            // 내부 루프: O(n)
            for(int j = 1; j <= i; j++){
                dp[i] = Math.min(dp[i], dp[i-j] + p[j]);
            }
        }
        System.out.println(dp[n]);
    }
}