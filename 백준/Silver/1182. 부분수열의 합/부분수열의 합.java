import java.io.*;
import java.util.*;

public class Main {
    static int N, S, ans;
    static int[] nums;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        nums = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++)  nums[i] = Integer.parseInt(st.nextToken());

        dfs(0, 0, 0);
        System.out.println(ans);
    }

    public static void dfs(int depth, int idx, int sum){
        if(depth >= 1 && sum == S)    ans ++;

        if(depth == N)    return;

        for(int i = idx; i < N; i++){
            dfs(depth+1, i+1, sum+nums[i]);
        }
    }
}