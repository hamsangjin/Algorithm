import java.io.*;
import java.util.*;

public class Solution {
	static List<Integer> temp = new ArrayList<>();
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i = 1; i <= t; i++) {
				
				String[] input = br.readLine().split(" ");
				int d = Integer.parseInt(input[0]);
				int h = Integer.parseInt(input[1]);
				int m = Integer.parseInt(input[2]);
				
				int x = ((11 * 24) + 11) * 60 + 11;
				int y = ((d * 24) + h) * 60 + m;
				
				if((y - x) >= 0) System.out.println("#" + i + " " + (y - x));
				else System.out.println("#" + i + " -1");
				
			}
		} catch (Exception e) {}
	}
}