import java.io.*;
import java.util.*;

public class Solution {
	static List<Integer> temp = new ArrayList<>();
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i = 1; i <= t; i++) {
				int n = Integer.parseInt(br.readLine());
				
				String result = "No";
				for(int j = 1; j <= 9; j++) {
					if(n % j == 0 && (n / j) <= 9) {
						result = "Yes";
						break;
					}
				}
				System.out.println("#" + i + " " + result);
			}
		} catch (Exception e) {}
	}
}