import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/10815
// O(N + M)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[] cards = new boolean[20000001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)     cards[Integer.parseInt(st.nextToken()) + 10000000] = true;

        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++)     sb.append(cards[Integer.parseInt(st.nextToken()) + 10000000] ? "1" : "0").append(" ");

        System.out.println(sb);
    }
}