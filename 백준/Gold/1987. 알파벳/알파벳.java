import java.io.*;

public class Main {
    static char[][] board;
    static int n, m;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        board = new char[n][m];
        for (int i = 0; i < n; i++) {
            char[] temp = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                board[i][j] = temp[j];
            }
        }

        boolean[] ch = new boolean[26];
        ch[board[0][0] - 'A'] = true;
        dfs(0, 0, 0, ch);

        System.out.println(answer);
    }

    public static void dfs(int r, int c, int cnt, boolean[] ch) {
        cnt ++;
        answer = Math.max(answer, cnt);

        for(int i = 0; i < 4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(nr >= 0 && nr < n && nc >= 0 && nc < m && !ch[board[nr][nc] - 'A']) {
                ch[board[nr][nc] - 'A'] = true;
                dfs(nr, nc, cnt, ch);
                ch[board[nr][nc] - 'A'] = false;
            }
        }
    }
}