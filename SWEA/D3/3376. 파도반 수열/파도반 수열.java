import java.io.*;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= t; i++) {
				int n = Integer.parseInt(br.readLine());
				Long[] nums = new Long[100];
				for(int j = 0; j < 3; j++)	nums[j] = 1l;
				
				for(int j = 3; j < n; j++)	nums[j] = nums[j-2] + nums[j-3];
				
				System.out.printf("#%d %d\n", i, nums[n-1]);
			}
		} catch (IOException e) {}
	}
}