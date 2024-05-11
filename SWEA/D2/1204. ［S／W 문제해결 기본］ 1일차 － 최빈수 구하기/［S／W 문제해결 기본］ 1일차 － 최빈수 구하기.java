import java.io.*;

public class Solution {
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i = 1; i <= n; i++) {
				String t = br.readLine();
				String[] temp = br.readLine().split(" ");
				int[] ch = new int[101];
				int[] mode = {-1, -1};
				
				for(String str : temp) {
					int x = Integer.parseInt(str);
					ch[x] ++;
					if(ch[x] > mode[0]) {
						mode[0] = ch[x];
						mode[1] = x;
					} else if(ch[x] == mode[0]) {
						if(mode[1] < x) {
							mode[0] = ch[x];
							mode[1] = x;
						}
					}
				}
				
				System.out.printf("#%d %d\n", i, mode[1]);
			}
		} catch (Exception e) {}
	}
}