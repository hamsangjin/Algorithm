import java.io.*;
import java.util.Arrays;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/6588
// 300 - 수학 1 -> 골드바흐의 추측
// 시간 복잡도: O(r * log(log r) + (T*n))
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int range = 1000000;
        // 먼저 6 ~ 1,000,000까지의 소수를 표시
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

        int n;
        while ((n = Integer.parseInt(br.readLine())) != 0){
            boolean flag = false;

            // O(T * n)
            // n을 만들 수 있는 방법이 여러가지라면, b-a가 큰 것을 출력
            // 따라서 만들 수 있는 경우의 수중 최대값과 최소값으로 구성해야 함
            // 13이 주어지면 아래 순서로 탐색
            // [2, 11] -> [3, 10] -> [4, 9]
            for(int i = 2; i <= n/2; i++){
                if(prime[i] && prime[n-i]){
                    System.out.println(n + " = " + i + " + " + (n-i));
                    flag = true;
                    break;
                }
            }

            if(!flag) System.out.println("Goldbach's conjecture is wrong.");
        }
    }
}
