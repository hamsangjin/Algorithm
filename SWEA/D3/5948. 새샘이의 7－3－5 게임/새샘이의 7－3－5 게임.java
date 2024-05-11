import java.io.*;
import java.util.*;

public class Solution {
	static List<Integer> temp = new ArrayList<>();
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int t = Integer.parseInt(br.readLine());
			for(int i = 1; i <= t; i++) {
				
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int[] nums = new int[7];
				
				for(int j = 0; j < 7; j++) {
					nums[j] = Integer.parseInt(st.nextToken());
				}
				
				Set<Integer> set = new TreeSet<>();
				boolean[] ch = new boolean[101];
				temp.clear();
				
				dfs(0, set, nums, ch);
				
				int n = set.size();
				int[] result = new int[n];
				int idx = 0;
				for (int num : set) {
					result[idx++] = num;
				}
				
				System.out.println("#" + i + " " + result[n-5]);
			}
		} catch (Exception e) {}
	}
	
	public static void dfs(int sum, Set<Integer> set, int[] nums, boolean[] ch) {
		if(temp.size() == 3) {
			set.add(sum);
			return;
		}
		for(int num : nums) {
			if(!ch[num]) {
				sum += num;
				temp.add(num);
				ch[num] = true;
				dfs(sum, set, nums, ch);
				sum -= num;
				temp.remove(temp.size()-1);
				ch[num] = false;
			}
		}
	}
}