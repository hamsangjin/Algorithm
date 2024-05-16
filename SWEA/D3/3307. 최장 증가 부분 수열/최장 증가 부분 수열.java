import java.io.*;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				int n = Integer.parseInt(br.readLine());
				
				String[] temp = br.readLine().split(" ");
				int[] nums = new int[n];
				for(int i = 0; i < n; i++) {
					nums[i] = Integer.parseInt(temp[i]);
				}
				
				int[] dp = new int[n];
				int max = -1;
				
				for (int i = 0; i < n; i++){
					dp[i] = 1;
				    for (int j = 0; j < i; j++){
				        if(nums[i] > nums[j]){
				            dp[i] = Math.max(dp[i], dp[j] + 1);
				        }
				    }
				    max = Math.max(max, dp[i]);
				}
				
				System.out.printf("#%d %d\n", t, max);
			}
		} catch (IOException e) {}
	}
}