import java.io.*;
public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= t; i++) {
				String[] temp = br.readLine().split(" ");
				int x1 = Integer.parseInt(temp[0]);
				int y1 = Integer.parseInt(temp[1]);
				int x2 = Integer.parseInt(temp[2]);
				int y2 = Integer.parseInt(temp[3]);
				
				int r1 = 0;
				int r2 = 0;
				int r3 = 0;
				
				int n = Integer.parseInt(br.readLine());
				for(int j = 0; j < n; j++) {
					String[] xy = br.readLine().split(" ");
					int x = Integer.parseInt(xy[0]);
					int y = Integer.parseInt(xy[1]);
					
					// 1. 점이 완전히 직사각형 내부에 있다.
					if(x > x1 && x < x2 && y > y1 && y < y2)			r1 ++;
					else if(x < x1 || x > x2 || y < y1 || y > y2)		r3 ++;
					else												r2 ++;
				}
				System.out.printf("#%d %d %d %d\n", i, r1, r2, r3);
			}
		} catch (IOException e) {}
	}
}