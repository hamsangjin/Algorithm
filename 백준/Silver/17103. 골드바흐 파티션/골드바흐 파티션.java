import java.io.*;
import java.util.Arrays;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/17103
// 300 - 수학 1(연습) -> 골드바흐 파티션
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 먼저 2 ~ 1,000,000까지의 소수를 표시
        int range = 1000000;
        boolean[] prime = new boolean[range+1];
        Arrays.fill(prime, true);

        for(int i = 2; i <= Math.sqrt(range); i++){
            if(prime[i]){
                // 에라토스테네스의 체 알고리즘 사용
                // O(n * log(log n))
                // 처음에는 2가 나오고, 2의 배수들을 다 소수가 아니라고 표시
                // 그런 식으로 3, 5, 7 등의 소수들의 배수를 소수가 아니라고 표시하는 방법
                for (int j = i*i; j <= range; j += i) prime[j] = false;
            }
        }

        // T 입력
        int T = Integer.parseInt(br.readLine());

        // O(T)
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());

            int cnt = 0;

            // O(T * n)
            // n을 만들 수 있는 경우의 수 세기
            // 두 소수의 순서만 다른 것은 같은 파티션으로 생각
            // 13이 주어지면 아래 순서로 탐색
            // [2, 11] -> [3, 10] -> [4, 9]
            for(int i = 2; i <= n/2; i++){
                if(prime[i] && prime[n-i])      cnt++;
            }

            System.out.println(cnt);
        }
    }
}