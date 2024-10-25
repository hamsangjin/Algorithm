import java.io.*;
import java.util.*;

// https://code.plus/course/42
// https://www.acmicpc.net/problem/15663
// 510 - 브루트포스(N과 M) -> N과 M(9)
// 최대 N개의 선택이 이루어지며, 깊이 M까지 진행되므로, 총 경우의 수는 N * N * ... * N (M번)
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

    // 1
    // 1 1(ch에서 넘어감)
    // 1 7(출력)
    // 1 9(출력)
    // 1 9(pre가 9이기 때문에 넘어감)

    // ch = [true, false, false, false]
    // 처음 호출 pre = 1
    // 두 번째 호출 - 1번째 for문 pre = 0(ch배열로 넘어감)
    // 두 번째 호출 - 2번째 for문 pre = 7(출력)
    // 두 번째 호출 - 3번째 for문 pre = 9(출력)
    // 두 번째 호출 - 4번째 for문 pre = 9(ch에선 안 걸리지만 이전 값이 9이고 4번째 값도 9이기 때문에 넘어감)

    public static void dfs(int depth){
        if(depth == m){
            for(int i = 0; i < m; i++)     sb.append(arr[i] + " ");
            sb.append("\n");
        } else{
            int pre = 0;
            for(int i = 0; i < n; i++) {
                if(ch[i] || pre == nums[i]) continue;

                ch[i] = true;
                arr[depth] = nums[i];
                pre = nums[i];
                dfs(depth+1);
                ch[i] = false;
            }
        }
    }
}