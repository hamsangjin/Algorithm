import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] lines = new int[K];
        for(int i = 0; i < K; i++)  lines[i] = Integer.parseInt(br.readLine());
        Arrays.sort(lines);

        long start = 1;
        long end = lines[K-1];

        while(start <= end) {
            long mid = (start + end) / 2;
            long cnt = 0;

            for(int line : lines)     cnt += line / mid;

            if (cnt >= N)  start = mid + 1;
            else           end = mid - 1;
        }
        System.out.println(end);
    }
}