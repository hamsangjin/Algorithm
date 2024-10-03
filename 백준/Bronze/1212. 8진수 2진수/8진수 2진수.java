import java.io.*;
import java.math.BigInteger;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1212
// 300 - 수학 1(연습) -> 8진수 2진수
// 시간 복잡도: O(1)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력(8진수 -> 10진수)
        // 최대 길이가 333,334이므로 8**333,334-1이므로 BigInteger로 받기
        BigInteger n = new BigInteger(br.readLine(), 8);

        // 10진수 -> 2진수
        System.out.println(n.toString(2));
    }
}