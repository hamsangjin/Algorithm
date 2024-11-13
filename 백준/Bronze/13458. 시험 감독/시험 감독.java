import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/13458
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] aArr = new int[N];
        for(int i = 0; i < N; i++)  aArr[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        // 총감독관을 미리 배치
        long ans = N;
        for(int i = 0; i < N; i++){
            // 총감독관 빼주기
            int a = aArr[i] - B;

            // 부감독관 배치
            if(a <= 0)      continue;
            ans += (a / C) + (a % C == 0 ? 0 : 1);
        }

        System.out.println(ans);
    }
}