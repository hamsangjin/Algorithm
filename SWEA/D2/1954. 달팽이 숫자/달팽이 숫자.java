import java.io.*;

public class Solution {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dr = {-1, 0, 1, 0};
		int[] dc = {0, 1, 0, -1};
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				int n = Integer.parseInt(br.readLine());
				
				
				int[][] arr = new int[n][n];
				int r = 0, c = 0, d = 1, idx = 1;
				while(true) {
					arr[r][c] = idx++;
					
					int nr = r + dr[d];
					int nc = c + dc[d];
					if(nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] != 0) {
						d = (d+1) % 4;
						r = r + dr[d];
						c = c + dc[d];
					} else {
						r = nr;
						c = nc;
					}
					if(idx > n*n)	break;
				}
				
				System.out.printf("#%d\n", t);
				for (int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
			}
		} catch (IOException e) {}
	}
}
