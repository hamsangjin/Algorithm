import java.io.*;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				String[] nmk = br.readLine().split(" ");
				int n = Integer.parseInt(nmk[0]);
				int m = Integer.parseInt(nmk[1]);
				int k = Integer.parseInt(nmk[2]);
				
				String[] temp = br.readLine().split(" ");
				int[] arr = new int[n];
				for(int i = 0; i < n; i++) {
					arr[i] = Integer.parseInt(temp[i]);
				}
				
				Arrays.sort(arr);
				
				int f = 0;
				String result = "Possible";
				for(int i = 0; i < n; i++) {
					f = (arr[i] / m) * k; 		// 손님이 온 시간이 됐을 때 붕어빵 몇 개 만들어졌는지
					
					if(f-i-1 < 0 ) { 			// i는 앞에 손님들의 수 
						result = "Impossible";
						break;
					}
				}
				
				System.out.printf("#%d %s\n", t, result);
			}
		} catch (IOException e) {}
	}
}