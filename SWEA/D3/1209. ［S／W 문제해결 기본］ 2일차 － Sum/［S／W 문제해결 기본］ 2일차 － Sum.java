import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			for(int t = 1; t <= 10; t++) {
				int n = Integer.parseInt(br.readLine());
				int[][] arr = new int[100][100];
				int max = Integer.MIN_VALUE;
				
				for(int i = 0; i < 100; i++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					for(int j = 0; j < 100; j++) {
						arr[i][j] = Integer.parseInt(st.nextToken());
					}
				}
				
				int left = 0;
				int right = 0;
				
				for(int i = 0; i < 100; i++) {
					int sum1 = 0;
					int sum2 = 0;
					for(int j = 0; j < 100; j++) {
						if(i == j) left += arr[i][j];
						if(i+j == 99)	right += arr[i][j];
						sum1 += arr[i][j];
						sum2 += arr[j][i];
					}
					max = Math.max(max, Math.max(sum1, sum2));
				}
				
				max = Math.max(max, Math.max(left, right));
				
				System.out.printf("#%d %d\n", t, max);
			}
		} catch (IOException e) {}
	}
}