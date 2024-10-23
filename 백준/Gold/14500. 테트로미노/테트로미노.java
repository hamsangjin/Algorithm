import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] board;
    static boolean[][] visited;
    static int maxValue = 0;

    // 상, 하, 좌, 우
    static int[][] move = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // INPUT
        N = scanner.nextInt();
        M = scanner.nextInt();
        board = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        // 모든 셀에 대해 DFS 및 예외 모양 계산
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                dfs(i, j, board[i][j], 1);
                visited[i][j] = false;

                exce(i, j);
            }
        }

        System.out.println(maxValue);
    }

    // 모양 완성시 최대값 계산
    static void dfs(int i, int j, int dsum, int cnt) {
        if (cnt == 4) {
            maxValue = Math.max(maxValue, dsum);
            return;
        }

        // 상, 하, 좌, 우로 이동
        for (int n = 0; n < 4; n++) {
            int ni = i + move[n][0];
            int nj = j + move[n][1];
            if (0 <= ni && ni < N && 0 <= nj && nj < M && !visited[ni][nj]) {
                visited[ni][nj] = true;
                dfs(ni, nj, dsum + board[ni][nj], cnt + 1);
                visited[ni][nj] = false;
            }
        }
    }

    // ㅗ, ㅜ, ㅓ, ㅏ 모양의 최대값 계산
    static void exce(int i, int j) {
        for (int n = 0; n < 4; n++) {
            // 초기값은 시작지점의 값으로 지정
            int tmp = board[i][j];
            boolean valid = true;
            for (int k = 0; k < 3; k++) {
                // move 배열의 요소를 3개씩 사용할 수 있도록 인덱스 계산
                int t = (n + k) % 4;
                int ni = i + move[t][0];
                int nj = j + move[t][1];

                if (!(0 <= ni && ni < N && 0 <= nj && nj < M)) {
                    valid = false;
                    break;
                }
                tmp += board[ni][nj];
            }
            // 최대값 계산
            if (valid) {
                maxValue = Math.max(maxValue, tmp);
            }
        }
    }
}