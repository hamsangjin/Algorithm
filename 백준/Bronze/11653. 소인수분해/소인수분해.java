import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/11653
// 300 - 수학 1(참고) -> 소인수분해
// 시간 복잡도: O(√n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int n = Integer.parseInt(br.readLine());

        for(int i = 2; i <= Math.sqrt(n); i++) {
            while(n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }

        if(n != 1) System.out.println(n);
    }
}