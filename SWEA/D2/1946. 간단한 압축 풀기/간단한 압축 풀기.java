import java.io.*;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i = 1; i <= t; i++) {
				System.out.println("#" + i);
				int n = Integer.parseInt(br.readLine());
				String line = "";
				for(int j = 0; j < n; j++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					String c = st.nextToken();
					int k = Integer.parseInt(st.nextToken());
					
					for(int l = 0; l < k; l++) {
						line += c;
						
						if(line.length() == 10) {
							System.out.println(line);
							line = "";
						}
					}
				}
				System.out.println(line);
			}
			
		} catch (Exception e) {}
	}
}