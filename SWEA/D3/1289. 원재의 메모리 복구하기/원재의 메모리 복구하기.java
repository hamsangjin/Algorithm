import java.io.*;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				String[] num = br.readLine().split("");
				String state = "0";
				
				int cnt = 0;
				for(int i = 0; i < num.length; i++) {
					if(!state.equals(num[i])) {
						cnt++;
						state = num[i];
					}
				}
				
				System.out.printf("#%d %d\n", t, cnt);
			}
		} catch (IOException e) {}
	}
}