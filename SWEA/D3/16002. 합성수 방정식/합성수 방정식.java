import java.io.*;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine().trim());
			
			for(int i = 1; i <= t; i++) {
				int n = Integer.parseInt(br.readLine().trim());
				
				int x = n * 9;
				int y = n * 8;
				System.out.printf("#%d %d %d\n", i, x, y);
			}
		} catch (IOException e) {}
	}
}