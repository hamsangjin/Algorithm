import java.io.*;

public class Solution {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i = 1; i <= t; i++) {
				int n = Integer.parseInt(br.readLine());
				int[][] farm = new int[n][n];
				int result = 0;
				
				for(int j = 0; j < n; j++) {
					String[] line = br.readLine().split("");
					for(int k = 0; k < n; k++) {
						farm[j][k] = Integer.parseInt(line[k]);
					}
				}
				
				int mid = n/2;
				
				for(int j = 0; j < n; j++) {
					if(j <= mid) {
						for(int k = mid - j; k < mid+j+1; k++) {
							result += farm[j][k];
						}
					} else {
						for(int k = j - mid; k < n+mid-j; k++) {
							result += farm[j][k];
						}
					}
				}
				
				System.out.printf("#%d %d\n", i, result);
			}
		} catch (IOException e) {}
	}
}