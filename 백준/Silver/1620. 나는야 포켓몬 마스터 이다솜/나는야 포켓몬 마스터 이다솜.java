import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/1620
// 시간 복잡도: O(N + M)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, String> mapInt = new HashMap<>();
        Map<String, Integer> mapStr = new HashMap<>();
        for(int i = 1; i <= N; i++){
            String x = br.readLine();
            mapInt.put(i, x);
            mapStr.put(x, i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            String input = br.readLine();

            if(Character.isAlphabetic(input.charAt(0)))     sb.append(mapStr.get(input)).append("\n");
            else                                            sb.append(mapInt.get(Integer.parseInt(input))).append("\n");
        }
        System.out.println(sb);
    }
}