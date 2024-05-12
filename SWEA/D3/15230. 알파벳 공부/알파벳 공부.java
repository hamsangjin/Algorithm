import java.io.*;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= t; i++) {
				char[] temp = br.readLine().toCharArray();
				int[] words = new int[temp.length];
				for(int j = 0; j < words.length; j++)	words[j] = (int) temp[j]%(int)'a';
				
				int cnt = 0;
				int next = 0;
				for(int w : words) {
					if(w == next) {
						cnt++;
						next = (next + 1) % 26;
					} else	break;
				}
				
				System.out.printf("#%d %d\n", i, cnt);
			}
		} catch (IOException e) {}
	}
}