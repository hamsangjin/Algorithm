import java.io.*;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= t; i++) {
				int n = Integer.parseInt(br.readLine());
				String temp = br.readLine();
				if(n > 1) {
					String str1 = temp.substring(0, n/2);
					String str2 = temp.substring(n/2, n);
					if(str1.equals(str2))	System.out.printf("#%d Yes\n", i);
					else					System.out.printf("#%d No\n", i);
				} else System.out.printf("#%d No\n", i);
			}
		} catch (IOException e) {}
	}
}