import java.io.*;
import java.math.BigInteger;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1676
// 300 - 수학 1 -> 팩토리얼 0의 개수
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력
        int n = Integer.parseInt(br.readLine());

        // n이 500까지 있어서, Long의 범위에서도 벗어나기 때문에 BigInteger 사용해야함
        BigInteger fac = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }

        int cnt = 0;
        char[] arr = fac.toString().toCharArray();
        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] != '0')   break;
            cnt++;
        }
        System.out.println(cnt);
    }
}