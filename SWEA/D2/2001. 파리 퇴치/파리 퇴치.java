import java.io.*;

public class Solution {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				String[] nm = br.readLine().split(" ");
				int n = Integer.parseInt(nm[0]);
				int m = Integer.parseInt(nm[1]);
				
				
				int[][] arr = new int[n][n];
				for(int i = 0; i < n; i++) {
					String[] temp = br.readLine().split(" ");
					for(int j = 0; j < n; j++) {
						arr[i][j] = Integer.parseInt(temp[j]);
					}
				}
				
				int result = 0;
				for(int i = 0; i <= n-m; i++) {
					for(int j = 0; j <= n-m; j++) {
						int sum = 0;
						for(int k = i; k < i+m; k++) {
							for(int l = j; l < j+m; l++) {
								sum += arr[k][l];
							}
						}
						result = Math.max(result, sum);
					}
				}
				
				System.out.printf("#%d %s\n", t, result);
			}
		} catch (IOException e) {}
	}
}