import java.io.*;
import java.util.StringTokenizer;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/6064
// 500 - 브루트포스 -> 카잉 달력
// 시간 복잡도: O(N)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            System.out.println(cal(M, N, x, y));
        }
    }

    public static int cal(int M, int N, int x, int y) {
        // k를 x로 초기화
        int k = x;
        // k의 범위는 m*n을 넘을 수 없음
        // O(M*N)같지만 k가 M의 배수로 증가하기 때문에 N으로 볼 수 있음
        while(k <= M * N){
            // 2개의 조건을 만족하는 k값을 찾는다.
            if ((k - x) % M == 0 && (k - y) % N == 0)   return k;
            
            // k는 x로 초기화해주었기 때문에 m만 더해준다.
            k += M;
        }
        // 마지막 해인 경우
        return -1;
    }
}