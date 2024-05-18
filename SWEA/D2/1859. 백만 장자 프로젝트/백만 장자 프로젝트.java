import java.io.*;

public class Solution {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				int n = Integer.parseInt(br.readLine());
				
				String[] temp = br.readLine().split(" ");
				int[] arr = new int[n];
				for(int i = 0; i < n; i++)	arr[i] = Integer.parseInt(temp[i]);
				
				int max = 0;
                long result = 0l;
				for(int i = n-1; i >= 0; i--) {
					if(max < arr[i]) {
						max = arr[i];
                    }else result += max-arr[i];
				}
				
				System.out.printf("#%d %d\n", t, result);
			}
		} catch (IOException e) {}
	}
}