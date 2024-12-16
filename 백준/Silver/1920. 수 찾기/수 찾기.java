import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)  arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++)  sb.append(binarySearch(Integer.parseInt(st.nextToken()))).append("\n");

        System.out.println(sb);
    }
    public static int binarySearch(int t) {
        int start = 0;
        int end = N - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == t)      return 1;
            else if (arr[mid] > t)  end = mid - 1;
            else                    start = mid + 1;
        }

        return 0;
    }
}