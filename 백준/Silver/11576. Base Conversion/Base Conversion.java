import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/2745
// 300 - 수학 1(참고) -> 진법 변환
// 시간 복잡도: O(m + log A)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);
        int m = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");

        // num을 A진법으로 변환
        int ans = 0;
        int temp = 1;       // a^0부터 시작
        for (int i = m - 1; i >= 0; i--) {
            ans += Integer.parseInt(nums[i]) * temp;
            temp *= a;
        }

        // A진법으로 변환한 값을 B진법으로 변환
        List<String> list = new ArrayList();
        while(ans != 0) {
            list.add(Integer.toString(ans%b));
            ans /= b;
        }

        Collections.reverse(list);
        System.out.println(String.join(" ", list));
    }
}