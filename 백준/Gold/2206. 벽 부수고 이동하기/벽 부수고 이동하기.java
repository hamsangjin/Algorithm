import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/2206
public class Main {
    public static void main(String[] args) throws IOException {
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // nm 입력
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        // map 입력
        // 0: 이동 가능
        // 1: 이동 불가
        int[][] map = new int[n][m];
        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split("");
            for(int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        Queue<int[]> q = new LinkedList<>();
        boolean[][][] ch = new boolean[n][m][2];

        // x, y, d(거리), b(부순 여부)
        q.offer(new int[]{0, 0, 0});
        ch[0][0][0] = true;
        int answer = 1;

        while(!q.isEmpty()) {
//            for (int[] arr : q) {
//                System.out.print(Arrays.toString(arr) + " ");
//            }
//            System.out.println();

            int len = q.size();
            for(int i = 0; i < len; i++) {
                int[] cur = q.poll();
                int r = cur[0];
                int c = cur[1];
                int b = cur[2];

                if(r == n-1 && c == m-1){
                    System.out.println(answer);
                    return;
                }

                for(int j = 0; j < 4; j++) {
                    int nr = r + dr[j];
                    int nc = c + dc[j];
                    if(nr >= 0 && nr < n && nc >= 0 && nc < m){
                        // 벽이 아닌 경우: 0
                        if(map[nr][nc] == 0){
                            if(!ch[nr][nc][b]){
                                ch[nr][nc][b] = true;
                                q.offer(new int[]{nr, nc, b});
                            }
                        // 벽인 경우: 1
                        } else{
                            // 벽을 부수지 않고, 벽을 부순 상태로 방문하지 않은 경우
                            if(b == 0 && !ch[nr][nc][1]){
                                ch[nr][nc][1] = true;
                                q.offer(new int[]{nr, nc, 1});
                            }
                        }
                    }
                }
            }
            answer++;
        }
        System.out.println(-1);
    }
}