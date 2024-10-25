import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/15654
// 400 - 다이나믹 프로그래밍1 -> N과 M(5)
// 모든 깊이에서 각각 최대 N개의 선택이 이루어지며, 깊이  𝑀 M까지 진행되므로, 총 경우의 수는 N * N * ... * N (M번)
// 최악의 경우: N=8, M=8일 경우 O(8^8) = 16,777,216
// 시간 복잡도: O(n^m)
public class Main {
    static int n, m;
    static int[] nums;
    static int[] arr;
    static boolean[] ch;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)     nums[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(nums);

        ch = new boolean[n];
        arr = new int[m];
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth){
        if(depth == m){
            for(int i = 0; i < m; i++)     sb.append(arr[i] + " ");
            sb.append("\n");
        } else{
            for(int i = 0; i < n; i++) {
                if(ch[i]) continue;

                ch[i] = true;
                arr[depth] = nums[i];
                dfs(depth+1);
                ch[i] = false;
            }
        }
    }
}