import java.io.*;
import java.util.*;

// https://code.plus/course/42
// https://www.acmicpc.net/problem/10819
// 520 - 브루트포스 - 순열 -> 차이를 최대로
// 최대 N개의 선택이 이루어지며, 깊이 M까지 진행되므로, 총 경우의 수는 N * N * ... * N (M번)
// 최악의 경우: N=8, M=8일 경우 O(8^8) = 16,777,216
// 시간 복잡도: O(n^m)
public class Main {
    static int n, ans = 0;
    static boolean[] ch;
    static int[] arr, nums;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)     nums[i] = Integer.parseInt(st.nextToken());

        ch = new boolean[n];
        arr = new int[n];
        dfs(0);
        System.out.println(ans);
    }

    public static void dfs(int depth){
        if(depth == n)  cal(arr);
        else{
            for(int i = 0; i < n; i++) {
                if(ch[i]) continue;

                ch[i] = true;
                arr[depth] = nums[i];
                dfs(depth + 1);
                ch[i] = false;
            }
        }
    }

    public static void cal(int[] arr){
        int sum = 0;
        for(int i = 0; i < n-1; i++){
            sum += Math.abs(arr[i] - arr[i+1]);
        }
        ans = Math.max(ans, sum);
    }
}