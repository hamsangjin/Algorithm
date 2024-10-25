import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/15657
// 400 - 다이나믹 프로그래밍1 -> N과 M(8)
// 오름차순으로 숫자를 선택하며 중복 없이 순열을 구하는 방식으로,
// 최대 N개의 선택이 이루어지며, 깊이 M까지 진행되므로, 총 경우의 수는 N * N * ... * N (M번)
// 최악의 경우: N=8, M=8일 경우 O(8^8) = 16,777,216
// 시간 복잡도: O(n^m)
public class Main {
    static int n, m;
    static int[] nums;
    static int[] arr;
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

        arr = new int[m];
        dfs(0, 0);
        System.out.println(sb);
    }

    public static void dfs(int depth, int idx){
        if(depth == m){
            for(int i = 0; i < m; i++)     sb.append(arr[i] + " ");
            sb.append("\n");
        } else{
            for(int i = idx; i < n; i++) {
                arr[depth] = nums[i];
                dfs(depth+1, i);
            }
        }
    }
}