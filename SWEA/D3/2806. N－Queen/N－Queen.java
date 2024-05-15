import java.io.*;

public class Solution {
	static int[] arr;
	static int n, result;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i = 1; i <= t; i++) {
				n = Integer.parseInt(br.readLine());
				arr = new int[n];
                result = 0;

				dfs(0);
				
				System.out.printf("#%d %d\n", i, result);
			}
		} catch (IOException e) {}
	}
	
public static void dfs(int depth) {
		
		if(depth == n) {
			result++;
			return;
		}
		
		for(int i = 0 ; i < n; i++) {
			arr[depth] = i;
			if(possible(depth)) {
				dfs(depth+1);
			}
		}	
	}
	
	public static boolean possible(int col) {
		for(int i = 0 ; i < col ; i++) {
			if(arr[i]==arr[col])	return false;
			else if(Math.abs(col-i) == Math.abs(arr[col]-arr[i]))	return false;
		}
		return true;
	}
}

