import java.io.*;

public class Solution {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i = 1; i <= n; i++) {
				String[] temp = br.readLine().split(" ");
				
				int sum = 0;
				int max = -1;
				int min = 10001;
				for(String str : temp) {
					int x = Integer.parseInt(str);
					max = Math.max(max, x);
					min = Math.min(min, x);
					sum += x;
				}
				
				System.out.printf("#%d %d\n", i, Math.round(((sum - max - min) * 1.0) /8));
			}
		} catch (Exception e) {}
	}
}