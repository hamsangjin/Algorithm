import java.io.*;

public class Solution {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				String[] nk = br.readLine().split(" ");
				int n = Integer.parseInt(nk[0]);
				int k = Integer.parseInt(nk[1]);
				
				String[][] puzzle = new String[n][n];
				for(int i = 0; i < n; i++) {
					String[] temp = br.readLine().split(" ");
					for(int j = 0; j < n; j++) {
						puzzle[i][j] = temp[j];
					}
				}
				
				int result = 0;
				boolean[][] ch = new boolean[n][n];
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						int cnt = 0;
						if(puzzle[i][j].equals("1") && !ch[i][j]) {
							cnt++;
							for(int l = j+1; l < n; l++) {
								if(puzzle[i][l].equals("0"))	break;
								else{
									cnt++;
									ch[i][l] = true;
								}
							}
							if(cnt == k)	result ++;	
						}
					}
				}
				
				ch = new boolean[n][n];
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						int cnt = 0;
						if(puzzle[j][i].equals("1") && !ch[j][i]) {
							cnt++;
							for(int l = j+1; l < n; l++) {
								if(puzzle[l][i].equals("0"))	break;
								else{
									cnt++;
									ch[l][i] = true;
								}
							}
							if(cnt == k)	result ++;	
						}
					}
				}
				
				System.out.printf("#%d %d\n", t, result);
			}
		} catch (IOException e) {}
	}
}