import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/14002
// 400 - 다이나믹 프로그래밍1 -> 가장 긴 증가하는 부분 수열 4
// 시간 복잡도: O(n^2)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)    arr[i] = Integer.parseInt(st.nextToken());

        int[] dp = new int[n];
        dp[0] = 1;
        int lis = 1;
        // O(n)
        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            // O(n)
            for (int j = 0; j < i; j++) {
                // 현재 값보다 작거나 같은 이전 원소들 중 가장 큰 dp값 + 1
                if (arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                    lis = Math.max(lis, dp[i]);
                }
            }
        }
        System.out.println(lis);

        Stack<Integer> s = new Stack<>();
        // O(n)
        for(int i = n - 1; i >= 0; i--) {
            if(dp[i] == lis) {
                s.push(arr[i]);
                lis--;
            }
        }

        while(!s.isEmpty())     System.out.print(s.pop() + " ");
    }
}