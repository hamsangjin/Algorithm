import java.io.*;
import java.util.*;

// https://code.plus/course/42
// https://www.acmicpc.net/problem/2529
// 530 - 브루트포스 - 재귀 -> 부등호
// 10개 중에서 K+1개를 고르는 경우의 수 = 10P(K+1) = 10! / (10−(k+1))!
// = 10^k+1로 근사할 수 있다고 함(챗 휘비리 의견)
// 시간 복잡도: O(10^k+1)
public class Main {
    static int K;
    static String minVal = null, maxVal = null;
    static String[] arr;
    static int[] nums;
    static boolean[] ch = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        K = Integer.parseInt(br.readLine());
        arr = new String[K];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) arr[i] = st.nextToken();

        nums = new int[K + 1];
        for (int i = 0; i < 10; i++) {
            ch[i] = true;
            nums[0] = i;          // 초기 값 설정
            dfs(1);
            ch[i] = false;
        }

        System.out.println(maxVal);
        System.out.println(minVal);
    }

    public static void dfs(int depth) {
        if (depth == K + 1) {
            StringBuilder num = new StringBuilder();
            for (int i = 0; i <= K; i++) num.append(nums[i]);

            String numStr = num.toString();
            if (minVal == null || minVal.compareTo(numStr) > 0) minVal = numStr;
            if (maxVal == null || maxVal.compareTo(numStr) < 0) maxVal = numStr;
        } else {
            for (int i = 0; i < 10; i++) {
                if (ch[i]) continue;

                if ((arr[depth - 1].equals("<") && nums[depth - 1] < i) ||
                    (arr[depth - 1].equals(">") && nums[depth - 1] > i)) {

                    ch[i] = true;
                    nums[depth] = i;
                    dfs(depth + 1);
                    ch[i] = false;
                }
            }
        }
    }
}