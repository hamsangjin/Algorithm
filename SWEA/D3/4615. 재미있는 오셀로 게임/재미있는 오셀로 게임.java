import java.io.*;
import java.util.*;

public class Solution {
	static int n, m;
	static int[] dr = {-1, -1, -1, 0, 1, 1, 1, 0};
	static int[] dc = {-1, 0, 1, 1, 1, 0, -1, -1};
	static int[] stones = {0, 2, 1};
	static int[][] board;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				String[] nm = br.readLine().split(" ");
				n = Integer.parseInt(nm[0]);
				m = Integer.parseInt(nm[1]);
				
				board = new int[n][n];
				
				init();
				
				for (int i = 0; i < m; i++) {
					String[] ijs = br.readLine().split(" ");
					int r = Integer.parseInt(ijs[1])-1;
					int c = Integer.parseInt(ijs[0])-1;
					int s = Integer.parseInt(ijs[2]);
					board[r][c] = s;
					
					check(r, c, s);
					
				}
				
				int x = 0, y = 0;
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						if(board[i][j] == 1) x++;
						if(board[i][j] == 2) y++;
					}
				}
				System.out.printf("#%d %d %d\n", t, x, y);
			}
		} catch (IOException e) {}
	}

	private static void check(int r, int c, int s) {
		for(int i = 0; i < 8; i++) {
			int nr = r, nc = c;
			int cnt = 0;
			
			while(true) {
				nr += dr[i];
				nc += dc[i];
				if(nr >= 0 && nr < n && nc >= 0 && nc < n) {
					if(board[nr][nc] == s) {
						int tr = r, tc = c;
						for(int j = 0; j < cnt; j++) {
							tr += dr[i];
							tc += dc[i];
							board[tr][tc] = s;
						}
						break;
					} else if(board[nr][nc] == stones[s]) cnt++;
					else break;
				} else break;
			}
		}
	}

	private static void init() {
		board[n/2-1][n/2-1] = 2;
		board[n/2][n/2-1] = 1;
		board[n/2-1][n/2] = 1;
		board[n/2][n/2] = 2;
	}
}