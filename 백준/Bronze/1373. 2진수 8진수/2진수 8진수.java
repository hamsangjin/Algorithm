import java.io.*;
import java.math.BigInteger;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1373
// 300 - 수학 1(연습) -> 2진수 8진수
// 시간 복잡도: O(1)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력(2진수 -> 10진수)
        // 최대 길이가 1,000,000이므로 2**1,000,000-1이므로 BigInteger로 받기
        BigInteger n = new BigInteger(br.readLine(), 2);

        // 10진수 -> 8진수
        System.out.println(n.toString(8));
    }
}