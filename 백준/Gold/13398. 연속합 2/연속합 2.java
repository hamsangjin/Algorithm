import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp1 = new int[n]; // 수를 제거하지 않은 경우
        int[] dp2 = new int[n]; // 수를 하나 제거한 경우

        dp1[0] = dp2[0] = arr[0];

        int result = arr[0];

        for (int i = 1; i < n; i++) {
            dp1[i] = Math.max(dp1[i - 1] + arr[i], arr[i]); // 제거하지 않은 경우
            dp2[i] = Math.max(dp2[i - 1] + arr[i], dp1[i - 1]); // 하나 제거한 경우
            result = Math.max(result, Math.max(dp1[i], dp2[i]));
        }

        System.out.println(result);
    }
}