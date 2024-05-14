import java.io.*;

public class Solution {
	static int max;
	static int changeCnt;
	static char[] nums;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i = 1; i <= t; i++) {
				String[] temp = br.readLine().split(" ");
				
				nums = temp[0].toCharArray();
				changeCnt = Integer.parseInt(temp[1]);
				max = Integer.MIN_VALUE;
				
				dfs(0, 0);

				System.out.printf("#%d %d\n", i, max);
			}
		} catch (IOException e) {}
	}
	
	public static void dfs(int start, int cnt) {
		if(cnt == changeCnt) {
			max = Math.max(max, Integer.parseInt(new String(nums)));
			return;
		}
		for(int i = start; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				swap(nums, i, j);
				dfs(i, cnt+1);
				swap(nums, i, j);
			}
		}
	}
	
	public static void swap(char[] nums, int i, int j) {
		char temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}