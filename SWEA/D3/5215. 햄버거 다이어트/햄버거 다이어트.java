import java.io.*;

public class Solution {
	static int n, l, max;
	static int[][] tk;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				String[] nl = br.readLine().split(" ");
				n = Integer.parseInt(nl[0]);
				l = Integer.parseInt(nl[1]);
				max = 0;
				
				tk = new int[n][2];
				for(int i = 0; i < n; i++) {
					String[] temp = br.readLine().split(" ");
					tk[i][0] = Integer.parseInt(temp[0]);
					tk[i][1] = Integer.parseInt(temp[1]);
				}
				
				dfs(0, 0, 0);
				
				System.out.printf("#%d %d\n", t, max);
			}
		} catch (IOException e) {}
	}
	public static void dfs(int cnt, int taste, int kcal) {
		if (kcal > l)
			return;
		if (cnt == n) {
			max = Math.max(max, taste);
			return;
		}
		
		dfs(cnt + 1, taste + tk[cnt][0], kcal + tk[cnt][1]); 	// 해당 재료 선택 O
		dfs(cnt + 1, taste, kcal); 								// 해당 재료 선택 x
	}
}