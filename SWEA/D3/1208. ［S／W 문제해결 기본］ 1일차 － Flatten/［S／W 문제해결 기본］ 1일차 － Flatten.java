import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
	static int max, cnt;
	static char[] nums;
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
//			int t = Integer.parseInt(br.readLine());
			for(int i = 1; i <= 10; i++) {
				int n = Integer.parseInt(br.readLine());
				List<Integer> boxes = 
						new ArrayList<>(Arrays
								.stream(br.readLine().split(" "))
								.map(Integer::parseInt)
								.collect(Collectors.toList()));
				
				for(int j = 0; j < n; j++) {
					int maxV = Collections.max(boxes);
					boxes.set(boxes.indexOf(maxV), maxV-1);
					
					int minV = Collections.min(boxes);
					boxes.set(boxes.indexOf(minV), minV+1);
				}

				System.out.printf("#%d %d\n", i, Collections.max(boxes) - Collections.min(boxes));
			}
		} catch (IOException e) {}
	}
}