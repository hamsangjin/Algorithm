import java.io.*;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= t; i++) {
				String[] temp = br.readLine().split(" ");
				int n = Integer.parseInt(temp[0]);
				int k = Integer.parseInt(temp[1]);
				
				if(n % k == 0)	System.out.printf("#%d 0\n", i);
				else			System.out.printf("#%d 1\n", i);
			}
		} catch (IOException e) {}
	}
}