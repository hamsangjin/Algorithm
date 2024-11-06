import java.util.*;
import java.io.*;

class Solution{
    static int N, L, ans;
    static int[][] tk;
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for(int t = 1; t <= T; t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());
            
            tk = new int[N][2];
            for(int i = 0; i < N; i++){
                st = new StringTokenizer(br.readLine());
                tk[i][0] = Integer.parseInt(st.nextToken());
                tk[i][1] = Integer.parseInt(st.nextToken());
            }
            
            ans = Integer.MIN_VALUE;
            dfs(0, 0, 0, 0);
            
            System.out.printf("#%d %d\n", t, ans);
        }
	}
    
    public static void dfs(int depth, int idx, int point, int kal){
        if(kal > L || depth > N)		return; 	
        
        ans = Math.max(ans, point);
        
        for(int i = idx; i < N; i++){
            dfs(depth+1, i+1, point + tk[i][0], kal + tk[i][1]);
        }
    }
}