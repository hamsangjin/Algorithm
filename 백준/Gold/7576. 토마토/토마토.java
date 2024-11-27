import java.io.*;
import java.util.*;

// https://code.plus/course/42
// https://www.acmicpc.net/problem/7576
// 600 - 그래프 1 -> 토마토
// 각 노드를 한 번씩 확인하고, 노드마다 각 간선을 최대 4개까지 확인하므로 N*M + 4(N*M) = O(5(N*M))
// 시간 복잡도: O(N*M)
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[][] ch = new boolean[N][M];
        Queue<int[]> q = new LinkedList<>();
        int[][] box = new int[N][M];

        // 토마토 입력과 동시에 익은 토마토 큐에 넣기
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                int x = Integer.parseInt(st.nextToken());

                if(x == 1){
                    q.add(new int[]{i, j});
                    ch[i][j] = true;
                }

                box[i][j] = x;
            }
        }

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int[] xy = q.poll();
                int x = xy[0];
                int y = xy[1];

                for(int j = 0; j < 4; j++){
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if(nx < 0 || nx >= N || ny < 0 || ny >= M || ch[nx][ny] || box[nx][ny] >= 1 || box[nx][ny] == -1)    continue;

                    q.add(new int[]{nx, ny});
                    ch[nx][ny] = true;
                    box[nx][ny] = box[x][y] + 1;
                }
            }
        }

        boolean flag = true;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(box[i][j] == 0){
                    System.out.println(-1);
                    return;
                }

                max = Math.max(max, box[i][j]);
            }
        }

        // 익은 토마토(1)로 시작했기 때문에 1을 빼주기
        System.out.println(max - 1);
    }
}