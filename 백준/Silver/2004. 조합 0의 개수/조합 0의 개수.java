import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/2004
// 300 - 수학 1 -> 조합 0의 개수
// 시간 복잡도: O(log n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n, r 입력
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int r = Integer.parseInt(nm[1]);

        // 2와 5의 개수 세기
        // 약분 생각
        int countTwo = countFac(n, 2) - countFac(r, 2) - countFac(n - r, 2);
        int countFive = countFac(n, 5) - countFac(r, 5) - countFac(n - r, 5);

        // 2와 5 중 작은 값을 결과로 출력
        // 2 * 5가 짝이 지어지려면 두 개 중 작은 개수로 짝이 지어지기 때문에
        System.out.println(Math.min(countTwo, countFive));
    }

    // n!에서 k의 등장 횟수를 세는 함수
    public static int countFac(int n, int k) {
        int count = 0;
        while (n >= k) {
            count += n / k;
            n /= k;
        }
        return count;
    }
}