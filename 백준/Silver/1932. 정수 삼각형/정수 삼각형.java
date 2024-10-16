import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1932
// 401 - 다이나믹 프로그래밍1(연습) -> 정수 삼각형
// 시간 복잡도: O(n^2)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 삼각형 정보 입력
        int[][] tri = new int[N][N];
        for (int n = 0; n < N; n++) {
            String[] temp = br.readLine().split(" ");
            for (int i = 0; i < temp.length; i++)   tri[n][i] = Integer.parseInt(temp[i]);
        }

        // 아래서 두 번째 줄부터 시작
        for (int i = N-2; i >= 0; i--) {
            // 아래 대각선 왼쪽과 아래 대각선 오른쪽 값 중 큰 값을 현재 값에 더해주기
            for(int j = 0; j <= i; j++)     tri[i][j] += Math.max(tri[i+1][j], tri[i+1][j+1]);
        }
        
        System.out.println(tri[0][0]);
    }
}