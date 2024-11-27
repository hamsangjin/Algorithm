import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        for(int i = 0; i < N; i++){
            String[] line = br.readLine().split("");
            for(int j = 0; j < M; j++)    map[i][j] = Integer.parseInt(line[j]);
        }

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        boolean[][] ch = new boolean[N][M];

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        ch[0][0] = true;
        int ans = 1;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int[] xy = q.poll();
                int x = xy[0];
                int y = xy[1];

                if(x == N-1 && y == M-1){
                    System.out.println(ans);
                    return;
                }

                for(int j = 0; j < 4; j++){
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if(nx < 0 || nx >= N || ny < 0 || ny >= M || ch[nx][ny] || map[nx][ny] == 0)    continue;

                    q.add(new int[]{nx, ny});
                    ch[nx][ny] = true;
                }
            }
            ans ++;
        }
    }
}