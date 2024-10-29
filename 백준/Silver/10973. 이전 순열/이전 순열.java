import java.io.*;
import java.util.StringTokenizer;

// https://code.plus/course/42
// https://www.acmicpc.net/problem/10973
// 520 - 브루트포스 - 순열 -> 이전 순열
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)     nums[i] = Integer.parseInt(st.nextToken());

        int c1 = n-1;
        while(c1 > 0 && nums[c1-1] < nums[c1]) {
            c1 -= 1;
        }

        // 마지막 순열인 경우
        if (c1 <= 0){
            System.out.println(-1);
            return;
        }

        // 2.  j >= i 이면서 A[j] > A [i-1]을 만족하는 가장 큰 j를 찾는다.
        int c2 = n-1;
        while(nums[c1-1] < nums[c2]) {
            c2 -= 1;
        }

        // 3. A[i-1]과 A [j]를 swap 한다.
        int temp = nums[c1-1];
        nums[c1-1] = nums[c2];
        nums[c2] = temp;
        c2 = n-1;

        while(c1 < c2) {
            temp = nums[c1];
            nums[c1] = nums[c2];
            nums[c2] = temp;
            c1 += 1;
            c2 -= 1;
        }

        for(int a : nums) System.out.print(a + " ");
    }
}