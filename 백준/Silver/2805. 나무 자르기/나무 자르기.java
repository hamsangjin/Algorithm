import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/2805
// 시간 복잡도: O(N * log(max(trees)))
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)  trees[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(trees);

        long start = 1;
        long end = trees[N-1];

        while(start <= end) {
            long mid = (start + end) / 2;
            long cnt = 0;

            for(int tree : trees){
                if(tree >= mid)     cnt += tree - mid;
            }

            if (cnt >= M)  start = mid + 1;
            else           end = mid - 1;
        }
        System.out.println(end);
    }
}