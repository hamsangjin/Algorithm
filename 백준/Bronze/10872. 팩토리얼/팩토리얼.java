import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/10872
// 300 - 수학 1 -> 팩토리얼
// 시간 복잡도: O(1)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력
        int n = Integer.parseInt(br.readLine());

        Long[] fac = new Long[13];
        fac[0] = 1L;
        fac[1] = 1L;
        for (int i = 2; i < 13; i++) {
            fac[i] = fac[i - 1] * i;
        }

        System.out.println(fac[n]);
    }
}