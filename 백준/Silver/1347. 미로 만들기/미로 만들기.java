import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/1347
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] map = new String[N*3][N*3];
        for (int i = 0; i < N*3; i++)     Arrays.fill(map[i], "#");

        String[] moves = br.readLine().split("");

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int dir = 2;
        int x = (N*3)/2, y = (N*3)/2;
        map[x][y] = ".";
        int maxN = x, maxS = x, maxE = y, maxW = y;

        for(int i = 0; i < N; i++){
            switch(moves[i]){
                case "F":
                    x += dx[dir];
                    y += dy[dir];
                    map[x][y] = ".";
                    maxN = Math.min(maxN, x);
                    maxS = Math.max(maxS, x);
                    maxW = Math.min(maxW, y);
                    maxE = Math.max(maxE, y);
                    break;
                case "R":   dir = (dir + 1) % 4;    break;
                case "L":   dir = (dir + 3) % 4;    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = maxN; i <= maxS; i++){
            for(int j = maxW; j <= maxE; j++)   sb.append(map[i][j]);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}