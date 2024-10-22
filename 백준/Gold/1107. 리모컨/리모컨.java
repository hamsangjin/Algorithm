import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1107
// 500 - 브루트포스 -> 리모컨
// 시간 복잡도: O(N * N.length)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        boolean[] broken = new boolean[10];
        // 고장난 버튼 처리
        if(M != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) broken[Integer.parseInt(st.nextToken())] = true;
        }

        int ans = Math.abs(100 - N);

        // 0 ~ 1000000까지의 채널을 검사
        // -로 이동하는 게 더 빠른 경우를 위해서 500,000까지하는 게 아닌 2배로 설정
        for (int x = 0; x <= 1000000; x++) {
            String num = String.valueOf(x);

            boolean flag = true;
            for (int i = 0; i < num.length(); i++) {
                int digit = num.charAt(i) - '0';
                if (broken[digit]) { // 고장난 버튼이면
                    flag = false;
                    break;
                }
            }

            // 고장난 버튼이 없어서 유효한 채널이면
            if (flag) {
                // 최소 횟수 = min(현재 최소 횟수, abs(목표 채널 - x 채널) + x 채널의 길이(버튼 누르는 횟수)
                ans = Math.min(ans, Math.abs(x - N) + num.length());
            }
        }

        System.out.println(ans);
    }
}