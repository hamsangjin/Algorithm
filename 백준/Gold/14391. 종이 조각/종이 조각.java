import java.io.*;

// https://code.plus/course/42
// https://www.acmicpc.net/problem/14391
// 540 - 브루트포스 - 비트마스크 -> 종이 조각
// dfs: O(2^N*M), sum: O(N*M)
// 시간 복잡도:  O(2^N*M x N*M)
public class Main {
    public static int MAX = -1;
    public static int N;
    public static int M;
    public static int[][] numArr;
    public static boolean[][] sliceArr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 0이면 가로, 1이면 세로
        String[] nm = br.readLine().split(" ");
        N = Integer.parseInt(nm[0]);
        M = Integer.parseInt(nm[1]);
        numArr = new int[N][M];
        sliceArr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String[] paper = br.readLine().split("");
            for (int j = 0; j < M; j++)     numArr[i][j] = Integer.parseInt(paper[j]);
        }

        dfs(0, 0);
        System.out.println(MAX);
    }

    // O(2^N*M)
    // 종이를 조각내는 경우의 수를 구하는 함수
    public static void dfs(int x, int y) {
        if (x == N) {
            // 모든 종이를 다 조각냈을 때
            sum();
            return;
        }
        if (y == M) {
            // 다음 행으로 이동
            dfs(x + 1, 0);
            return;
        }
        // 가로로 잘랐을 때
        sliceArr[x][y] = true;
        dfs(x, y + 1);
        // 세로로 잘랐을 때
        sliceArr[x][y] = false;
        dfs(x, y + 1);
    }
    
    // O(N*M)
    // 조각난 종이의 합 구하는 함수
    public static void sum() {
        int result = 0;
        int temp;
        // 가로로 자른 종이들 합 구하기
        for (int i = 0; i < N; i++) {
            temp = 0;
            for (int j = 0; j < M; j++) {
                // 가로로 자른 종이일 때
                if (sliceArr[i][j])     temp = temp * 10 + numArr[i][j];
                // 가로로 자른 종이가 아닐때
                else {
                    result += temp;
                    temp = 0;
                }
            }
            result += temp;
        }

        // 세로로 자른 종이들 합 구하기
        for (int i = 0; i < M; i++) {
            temp = 0;
            for (int j = 0; j < N; j++) {
                // 세로로 자른 종이일 때
                if (!sliceArr[j][i])    temp = temp * 10 + numArr[j][i];
                // 세로로 자른 종이가 아닐때
                else {
                    result += temp;
                    temp = 0;
                }
            }
            result += temp;
        }
        MAX = Math.max(MAX, result);
    }
}