import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());

            boolean[][] ch = new boolean[N][N];

            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            Queue<int[]> q = new LinkedList<>();
            q.add(new int[]{x1, y1});
            ch[x1][y1] = true;

            int L = 0;
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    int[] arr = q.poll();
                    int x = arr[0];
                    int y = arr[1];

                    if(x == x2 && y == y2){
                        sb.append(L).append("\n");
                        q = new LinkedList<>();
                        break;
                    }

                    for(int j = 0; j < 8; j++){
                        int nx = x + dx[j];
                        int ny = y + dy[j];

                        if(nx < 0 || nx >= N || ny < 0 || ny >= N || ch[nx][ny]) continue;

                        q.add(new int[]{nx, ny});
                        ch[nx][ny] = true;
                    }
                }
                L++;
            }
        }
        System.out.println(sb);
    }
}