import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/1931
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 끝나는 시간으로 오름차순 정렬하되, 같은 경우에 시작하는 시간으로 오름차순 정렬
        Arrays.sort(arr, (o1, o2) -> o1[1] == o2[1] ? o1[0]-o2[0] : o1[1]-o2[1]);

        int temp = 0;
        int ans = 0;
        for(int[] a : arr){
            // 회의를 진행하지 못하는 경우
            if(a[0] < temp)     continue;

            ans++;
            temp = a[1];
        }
        System.out.println(ans);
    }
}