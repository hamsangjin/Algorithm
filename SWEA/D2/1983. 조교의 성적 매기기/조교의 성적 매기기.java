import java.io.*;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i = 1; i <= t; i++) {
				String[] nk = br.readLine().split(" ");
				int n = Integer.parseInt(nk[0]);
				int k = Integer.parseInt(nk[1]);
				double[] scores = new double[n];
				
				for (int j = 0; j < n; j++) {
					String[] score = br.readLine().split(" ");
					int x = Integer.parseInt(score[0]);
					int y = Integer.parseInt(score[1]);
					int z = Integer.parseInt(score[2]);
					
					scores[j] = (x * 0.35) + (y * 0.45) + (z * 0.2);
				}
				
				double target = scores[k-1];
				
				Arrays.sort(scores);
				
				int index = 0;
				for(int j = 0; j < n; j++) {
					if(scores[j] == target){
						index = j / (n/10);
						break;
					}
				}
				
				String[] grades = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"}; 
				System.out.println("#" + i + " " + grades[index]);
			}
		} catch (Exception e) {}
	}
}