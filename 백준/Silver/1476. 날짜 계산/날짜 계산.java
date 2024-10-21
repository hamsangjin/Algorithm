import java.io.*;
import java.util.StringTokenizer;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1476
// 500 - 브루트포스 -> 날짜 계산
// 시간 복잡도: O(15*28*19) = O(1)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int e = 0, s = 0, m = 0;
        int year = 0;
        while(e != E || m != M || s != S) {
            e = e + 1 >= 16 ? 1 : e + 1;
            s = s + 1 >= 29 ? 1 : s + 1;
            m = m + 1 >= 20 ? 1 : m + 1;
            year++;
        }

        System.out.println(year);
    }
}