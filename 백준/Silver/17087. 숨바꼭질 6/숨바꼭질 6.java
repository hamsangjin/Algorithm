import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/17087
// 300 - 수학 1(연습) -> 숨바꼭질 6
// 시간 복잡도: O(n * log(M))
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n, s 입력
        String[] ns = br.readLine().split(" ");
        int n = Integer.parseInt(ns[0]);
        int s = Integer.parseInt(ns[1]);

        String[] aArr = br.readLine().split(" ");

        // 거리 계산 O(n)
        // 첫 번째 거리 계산
        int gcdValue = Math.abs(Integer.parseInt(aArr[0]) - s);

        // 나머지 거리들과의 GCD 계산
        for (int i = 1; i < n; i++) {
            int distance = Math.abs(Integer.parseInt(aArr[i]) - s);
            gcdValue = gcd(gcdValue, distance);
        }

        System.out.println(gcdValue);
    }

    // 유클리드 호제법으로 GCD 구하기
    // O(log(M)) -> M은 가장 큰 값
    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}