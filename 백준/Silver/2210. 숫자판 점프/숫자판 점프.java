import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/2210
// 숫자판 탐색 = O(25)
// DFS 호출 = 깊이 6까지 호출되며 4방향으로 이동가능하지만 깊이 1에서 시작하므로 4^5 = O(1024)
// = 25 * 1024 = 25600번
// 시간 복잡도: O(1)
public class Main {
    static int[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[] nums = new int[6];
    static Set<String> ans = new HashSet<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        board = new int[5][5];
        for(int i = 0; i < 5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 5; j++)  board[i][j] = Integer.parseInt(st.nextToken());

        }
        
        // for문 25번 반복
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                nums[0] = board[i][j];

                // 4^5번의 호출
                dfs(i, j, 1);
            }
        }

        System.out.println(ans.size());
    }

    public static void dfs(int x, int y, int depth){
        if(depth == 6){
            StringBuilder sb = new StringBuilder();
            for(int num : nums)     sb.append(num);
            ans.add(sb.toString());
            return;
        }

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 숫자판에서 벗어난 경우 넘어감
            if(nx < 0 || ny < 0 || nx >= 5 || ny >= 5) continue;

            nums[depth] = board[nx][ny];
            dfs(nx, ny, depth + 1);
        }
    }
}