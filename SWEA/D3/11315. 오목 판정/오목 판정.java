import java.io.*;
import java.util.Arrays;

public class Solution {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				int n = Integer.parseInt(br.readLine());
				
				String[][] board = new String[n][n];
				for(int i = 0; i < n; i++) {
					String[] line = br.readLine().split("");
					for(int j = 0; j < n; j++) {
						board[i][j] = line[j];
					}
				}
				
				String result = "NO";
				
				Loop:
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < n; j++) {
						if(board[i][j].equals("o")) {
							boolean flag1 = true, flag2 = true, flag3 = true, flag4 = true;
							// 가로
							if(j+4 < n) {
								for(int k = j; k < j+5; k++) {
									if(!board[i][k].equals("o"))	flag1 = false;
								}
								if(flag1) {
									result = "YES";
									break Loop;
								}
							}
							
							// 세로
							if(i+4 < n) {
								for(int k = i; k < i+5; k++) {
									if(!board[k][j].equals("o"))	flag2 = false;
								}
								if(flag2) {
									result = "YES";
									break Loop;
								}
							}
							
							// 대각선 왼->우
							if(i+4 < n && j+4 < n) {
								for(int r = i, c = j; r < i+5; r++, c++) {
									if(!board[r][c].equals("o")) {
										flag3 = false;
										break;
									}
								}
								if(flag3) {
									result = "YES";
									break Loop;
								}
							}
							
							// 대각선 우->왼
							if(i+4 < n && j-4 >= 0) {
								for(int r = i, c = j; r < i+5; r++, c--) {
									if(!board[r][c].equals("o")) {
										flag4 = false;
										break;
									}
								}
								if(flag4) {
									result = "YES";
									break Loop;
								}
							}
						}
					}
				}
				System.out.printf("#%d %s\n", t, result);
			}
		} catch (IOException e) {}
	}
}