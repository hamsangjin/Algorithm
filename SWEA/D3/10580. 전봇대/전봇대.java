import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= t; i++) {
				int n = Integer.parseInt(br.readLine());
				int sum = 0;
				List<Integer[]> list = new ArrayList<>();
				
				for(int j = 0; j < n; j ++) {
					String[] temp = br.readLine().split(" ");
					int a = Integer.parseInt(temp[0]);
					int b = Integer.parseInt(temp[1]);
					
					list.add(new Integer[] {a, b});
				}
				
				for(int j = 0; j < list.size(); j++) {
					int a = list.get(j)[0];
					int b = list.get(j)[1];
					for(int k = j+1; k < list.size(); k++) {
						int x = list.get(k)[0];
						int y = list.get(k)[1];
						
						if((a < x && b > y) || (a > x && b < y))	sum++; 
					}
					
				}
				System.out.printf("#%d %d\n", i, sum);
			}
		} catch (IOException e) {}
	}
}