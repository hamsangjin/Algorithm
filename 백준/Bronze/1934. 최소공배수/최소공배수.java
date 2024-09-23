import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1934
// 300 - 수학 1 -> 최소공배수
// 시간 복잡도: O(N * log(m))
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            // n, m 입력
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);

            if(n < m){
                int temp = n;
                n = m;
                m = temp;
            }

            // 유클리드 알고리즘 사용
            // 작은 수가 0이 될 때까지 아래 연산 적용
            // 그러면 n에 최대공약수가 저장
            int mod = 0;
            while (m != 0){
                mod = n % m;
                n = m;
                m = mod;
            }
            // n*m한 값에 최대 공약수를 나누면 최소공배수가 나옴
            System.out.println(Integer.parseInt(nm[0])*Integer.parseInt(nm[1]) / n);
        }
    }
}