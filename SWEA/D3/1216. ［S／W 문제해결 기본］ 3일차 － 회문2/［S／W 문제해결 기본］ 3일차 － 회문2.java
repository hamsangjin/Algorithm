import java.io.*;

public class Solution {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
//			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= 10; t++) {
				int n = Integer.parseInt(br.readLine());
				
				String[][] words = new String[100][100];
				
				for(int i = 0; i < 100; i++) {
					String[] temp = br.readLine().split("");
					for (int j = 0; j < 100; j++)	words[i][j] = temp[j];
				}
				
				int max = 1;
				for(int l = 2; l <= 100; l++) {
					for (int i = 0; i < 100; i++) {
						for (int j = 0; j <= 100-l; j++) {
							boolean flag1 = true;
							boolean flag2 = true;
							for(int k = 0; k < l/2; k++) {
								if(!words[i][j+k].equals(words[i][j+l-1-k]))	flag1 = false;
								if(!words[j+k][i].equals(words[j+l-1-k][i]))	flag2 = false;
							}
							if(flag1) max = l;
							if(flag2) max = l;
						}
					}
				}
				
				System.out.printf("#%d %d\n", n, max);
			}
		} catch (IOException e) {}
	}
}