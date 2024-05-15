import java.io.*;

public class Solution {
	static String[][] table;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			for(int t = 1; t <= 10; t++) {
				int n = Integer.parseInt(br.readLine());
				table = new String[n][n];
				int cnt = 0;
				
				for(int i = 0; i < n; i++) {
					String[] temp = br.readLine().split(" ");
					for(int j = 0; j < n; j++) {
						table[i][j] = temp[j];
					}
				}
				
				for(int i = 0; i < n; i++) {
					boolean r = false, b = false;
					for(int j = 0; j < n; j++) {
						
						if(table[j][i].equals("1")) {
							r = true;
							b = false;
						}
						else if(table[j][i].equals("2"))	b = true;
						
						if(b && r) {
							cnt ++;
							b = r = false;
						}
					}
				}
				System.out.printf("#%d %d\n", t, cnt);
			}
		} catch (IOException e) {}
	}
}