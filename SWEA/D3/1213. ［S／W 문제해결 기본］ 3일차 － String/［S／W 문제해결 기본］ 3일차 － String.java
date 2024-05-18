import java.io.*;

public class Solution {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
//			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= 10; t++) {
				int n = Integer.parseInt(br.readLine());
				String findStr = br.readLine();
				String target = br.readLine();
				
				int result = 0;
				for(int i = 0; i <= target.length() - findStr.length(); i++) {
					String str = target.substring(i, i+findStr.length());
					if(str.equals(findStr))	result++;
				}
				
				System.out.printf("#%d %d\n", t, result);
			}
		} catch (IOException e) {}
	}
}