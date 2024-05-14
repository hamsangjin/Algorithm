import java.io.*;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			for(int i = 1; i <= 10; i++) {
				int n = Integer.parseInt(br.readLine());
				
				String[] temp = br.readLine().split(" ");
				int[] building = new int[n];
				for(int j = 0; j < n; j++)	building[j] = Integer.parseInt(temp[j]);
				
				int result = 0;
				
				for(int j = 2; j < n-2; j++) {
					int max = Math.max(Math.max(building[j+1], building[j+2]), Math.max(building[j-1], building[j-2]));
					int view = building[j] - max;
					if(view > 0)	result += view;
				}
						
				System.out.printf("#%d %d\n", i, result);
			}
		} catch (IOException e) {}
	}
}