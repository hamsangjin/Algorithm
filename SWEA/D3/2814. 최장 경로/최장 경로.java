import java.io.*;
import java.util.*;

public class Solution {
	static int ans, n, m;
	static List<Integer>[] graph;
	static boolean[] ch;
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int T = Integer.parseInt(br.readLine());
			for(int t = 1; t <= T; t++) {
				String[] temp = br.readLine().split(" ");
				n = Integer.parseInt(temp[0]);
				m = Integer.parseInt(temp[1]);
				
				graph = new List[n+1];
				for (int i = 0; i <= n; i++)	graph[i] = new ArrayList<>();
				
				for(int i = 0; i < m; i++) {
					String[] xy = br.readLine().split(" "); 
					int x = Integer.parseInt(xy[0]);
					int y = Integer.parseInt(xy[1]);
					graph[x].add(y);
					graph[y].add(x);
				}
				
				ans = Integer.MIN_VALUE;
				
				for(int i = 1; i <= n; i++) {
					ch = new boolean[n+1];
					dfs(0, i);
				}
				
				System.out.printf("#%d %d\n", t, ans);
			}
		} catch (IOException e) {}
	}
	
	public static void dfs(int cnt, int v) {
		ch[v] = true;
		cnt++;
		
		for(int nv : graph[v]) {
			if(!ch[nv]) {
				dfs(cnt, nv);
				ch[nv] = false;
			}
		}
		ans = Math.max(cnt, ans);
	}
}