import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/10824
// 203 - 자료구조 1(참고) -> 네 수
// 시간 복잡도: O(1)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // abcd 입력
        String[] abcd = br.readLine().split(" ");

        System.out.println(Long.parseLong(abcd[0]+abcd[1]) + Long.parseLong(abcd[2]+abcd[3]));
    }
}