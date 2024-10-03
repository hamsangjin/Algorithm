import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/9613
// 300 - 수학 1(연습) -> GCD 합
// 시간 복잡도: O(T * n² * log M)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // T 입력
        int T = Integer.parseInt(br.readLine());

        // O(T)
        for (int t = 0; t < T; t++) {
            String[] temp = br.readLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            int[] nums = new int[n];
            for (int i = 1; i <= n; i++)    nums[i-1] = Integer.parseInt(temp[i]);

            long sum = 0;
            // O(n**2)
            for (int i = 0; i < n-1; i++) {
                for (int j = i+1; j < n; j++)   sum += gcd(nums[i], nums[j]);
            }
            System.out.println(sum);
        }
    }

    // O(log(M)) -> M은 가장 큰 값
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}