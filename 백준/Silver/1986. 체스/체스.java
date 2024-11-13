import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/1890
public class Main {
    static int N, M;
    static int[][] board;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        // 체스말(-1), 이동 범위(1), 안전한 칸(0)
        board = new int[N][M];

        // 퀸 위치 저장
        st = new StringTokenizer(br.readLine());
        List<Integer[]> Queenlist = new ArrayList<>();
        int q = Integer.parseInt(st.nextToken());
        for(int i = 0; i < q; i++) {
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            board[x][y] = -1;
            Queenlist.add(new Integer[]{x, y});
        }

        // 나이트 위치 저장
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
        st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        for(int i = 0; i < k; i++) {
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            board[x][y] = -1;

            // 나이트 이동경로 확인
            for(int j = 0; j < 8; j++) {
                int nx = x + dx[j];
                int ny = y + dy[j];
                if(nx >= 0 && nx < N && ny >= 0 && ny < M && board[nx][ny] == 0)    board[nx][ny] = 1;
            }
        }

        // 폰 위치 저장
        st = new StringTokenizer(br.readLine());
        int p = Integer.parseInt(st.nextToken());
        for(int i = 0; i < p; i++) {
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            board[x][y] = -1;
        }

        // 퀸 이동경로 확인
        for(Integer[] queen : Queenlist) {
            int x = queen[0];
            int y = queen[1];

            checkQueen(x, y);
        }

        int ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(board[i][j] == 0) ans++;
            }
        }

        System.out.println(ans);
    }

    private static void checkQueen(int x, int y){

        // 왼쪽
        int ny = y-1;
        while(ny >= 0 && board[x][ny] != -1){
            board[x][ny] = 1;
            ny -= 1;
        }

        // 오른쪽
        ny = y+1;
        while(ny < M && board[x][ny] != -1){
            board[x][ny] = 1;
            ny += 1;
        }

        // 위쪽
        int nx = x-1;
        while(nx >= 0 && board[nx][y] != -1){
            board[nx][y] = 1;
            nx -= 1;
        }

        // 아래쪽
        nx = x+1;
        while(nx < N && board[nx][y] != -1){
            board[nx][y] = 1;
            nx += 1;
        }

        // 왼쪽 위 대각선
        nx = x-1;
        ny = y-1;
        while(nx >= 0 && ny >= 0 && board[nx][ny] != -1){
            board[nx][ny] = 1;
            nx -= 1;
            ny -= 1;
        }

        // 오른쪽 위 대각선
        nx = x-1;
        ny = y+1;
        while(nx >= 0 && ny < M && board[nx][ny] != -1){
            board[nx][ny] = 1;
            nx -= 1;
            ny += 1;
        }

        // 왼쪽 아래 대각선
        nx = x+1;
        ny = y-1;
        while(nx < N && ny >= 0 && board[nx][ny] != -1){
            board[nx][ny] = 1;
            nx += 1;
            ny -= 1;
        }

        // 오른쪽 아래 대각선
        nx = x+1;
        ny = y+1;
        while(nx < N && ny < M && board[nx][ny] != -1){
            board[nx][ny] = 1;
            nx += 1;
            ny += 1;
        }
    }
}