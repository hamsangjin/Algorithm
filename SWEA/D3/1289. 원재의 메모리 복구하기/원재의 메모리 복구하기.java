import java.io.*;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				String[] num = br.readLine().split("");
				String[] start = new String[num.length];
				for(int i = 0; i < num.length; i++)	start[i] = "0";
				
				int cnt = 0;
				for(int i = 0; i < num.length; i++) {
					if(!start[i].equals(num[i])) {
						cnt++;
						for(int j = i; j < num.length; j++)	start[j] = num[i];
					}
				}
				
				System.out.printf("#%d %d\n", t, cnt);
			}
		} catch (IOException e) {}
	}
}