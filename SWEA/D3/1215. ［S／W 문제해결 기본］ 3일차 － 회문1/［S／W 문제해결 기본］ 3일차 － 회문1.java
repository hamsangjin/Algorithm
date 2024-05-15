import java.io.*;

public class Solution {
	static String[][] words;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			for(int t = 1; t <= 10; t++) {
				int n = Integer.parseInt(br.readLine());
				words = new String[8][8];
				for(int i = 0; i < 8; i++) {
					String[] temp = br.readLine().split("");
					for(int j = 0; j < 8; j++) {
						words[i][j] = temp[j];
					}
				}
				
				int cnt = 0;
				
				for(int i = 0; i < 8; i++) {
					for(int j = 0; j < 8-n+1; j++) {
						boolean flag1 = true;
						boolean flag2 = true;
						for(int k = 0; k < n/2; k++) {
							if(!words[i][j+k].equals(words[i][j+n-1-k]))	flag1 = false;
							if(!words[j+k][i].equals(words[j+n-1-k][i]))	flag2 = false;
						}
						if(flag1)	cnt++;
						if(flag2)	cnt++;
					}
				}
				System.out.printf("#%d %d\n", t, cnt);
			}
		} catch (IOException e) {}
	}
}