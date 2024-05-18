import java.io.*;
import java.util.*;

import javax.print.attribute.HashAttributeSet;

public class Solution {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Map<String, Integer> locMap = new HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		StringBuilder sb;
		int a = 1;
		int b = 2;
		for (int i = 1; i <= 300; i++) {
			int c = a;
			int d = b;
			for (int j = 1; j <= 300; j++) {
				sb = new StringBuilder();
				sb.append(j).append(",").append(i);
				String xy = sb.toString();
				locMap.put(xy, c);
				map.put(c, xy);
				c += d++;
			}
			a+=i;
			b++;
		}
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				String[] pq = br.readLine().split(" ");
				int p = Integer.parseInt(pq[0]);
				int q = Integer.parseInt(pq[1]);
				
				String[] xy1 = map.get(p).split(",");
				String[] xy2 = map.get(q).split(",");
				
				int x = Integer.parseInt(xy1[0]) + Integer.parseInt(xy2[0]);
				int y = Integer.parseInt(xy1[1]) + Integer.parseInt(xy2[1]);
				String xy = x + "," + y;
				
				int result = locMap.get(xy);
				
				System.out.printf("#%d %s\n", t, result);
			}
		} catch (IOException e) {}
	}
}