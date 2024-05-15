import java.io.*;
import java.util.*;

public class Solution {
	static int ans, n, k;
	static int[] arr;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				String[] temp = br.readLine().split(" "); 
				n = Integer.parseInt(temp[0]);
				k = Integer.parseInt(temp[1]);
				
				arr = new int[n];
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int i = 0; i < n; i++)	arr[i] = Integer.parseInt(st.nextToken());
			
				ans = 0;
				
				dfs(0, 0);
				
				System.out.printf("#%d %d\n", t, ans);
			}
		} catch (IOException e) {}
	}
	
	public static void dfs(int sum, int cnt) {
		
		if(sum == k) {
			ans++;
			return;
		} else if(sum > k || cnt == n)	return;
		
		dfs(sum+arr[cnt], cnt+1);
		dfs(sum, cnt+1);
	}
}