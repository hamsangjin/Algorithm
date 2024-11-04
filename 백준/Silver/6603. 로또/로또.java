import java.io.*;
import java.util.*;

public class Main{
    static int n;
    static int[] arr;
    static boolean[] ch;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if(n == 0)    break;

            arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            ch = new boolean[n];
            int[] nums = new int[6];
            dfs(0, -1, nums);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void dfs(int depth, int idx, int[] nums){
        if(depth == 6){
            for(int x : nums)    sb.append(x).append(" ");
            sb.append("\n");
        } else{
            for(int i = idx+1; i < n; i++){
                if(ch[i])    continue;

                ch[i] = true;
                nums[depth] = arr[i];
                dfs(depth+1, i, nums);
                ch[i] = false;
            }
        }
    }
}