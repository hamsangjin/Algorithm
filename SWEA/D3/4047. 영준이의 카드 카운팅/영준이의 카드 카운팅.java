import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			
			Map<String, Integer> map = new HashMap<>();
			map.put("S", 0);
			map.put("D", 1);
			map.put("H", 2);
			map.put("C", 3);
			
			for(int i = 1; i <= t; i++) {
				String[] cardInfo = br.readLine().split("");
				boolean[][] ch = new boolean[4][14];
				int[] result = {13, 13, 13, 13};
				boolean flag = true;
				
				for(int j = 0; j <= cardInfo.length-3; j+=3) {
					String str = cardInfo[j];
					int n = Integer.parseInt(cardInfo[j+1] + cardInfo[j+2]);
					
					if(ch[map.get(str)][n]) {
						flag = false;
						break;
					} else {
						ch[map.get(str)][n] = true;
						result[map.get(str)]--;
					}
				}
				
				if(flag) System.out.printf("#%d %d %d %d %d\n", i, result[0], result[1], result[2], result[3]);
				else	System.out.printf("#%d ERROR\n", i);
			}
		} catch (IOException e) {}
	}
}