import java.io.*;
import java.util.*;

// https://www.acmicpc.net/problem/14888
// 각 단계에서 4가지 연산자를 사용할 수 있고, depth는 최대 n-1
// 시간 복잡도: O(4^n-1)
public class Main {
    static int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    static int[] nums, op;
    static boolean[] ch;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)        nums[i] = Integer.parseInt(st.nextToken());

        op = new int[4];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++)    op[i] = Integer.parseInt(st.nextToken());


        ch = new boolean[n];
        dfs(1, nums[0]);
        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int depth, int sum){
        if(depth == n){
            min = Math.min(min, sum);
            max = Math.max(max, sum);
        } else{
            for(int i = 0; i < 4; i++){
                if(op[i] == 0) continue;

                op[i]--;
                switch(i){
                    case 0:
                        dfs(depth + 1, sum + nums[depth]);
                        break;
                    case 1:
                        dfs(depth + 1, sum - nums[depth]);
                        break;
                    case 2:
                        dfs(depth + 1, sum * nums[depth]);
                        break;
                    case 3:
                        dfs(depth + 1, sum / nums[depth]);
                        break;
                }
                op[i]++;

            }
        }
    }
}