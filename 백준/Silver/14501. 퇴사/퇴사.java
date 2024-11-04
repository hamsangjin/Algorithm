import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, ans = Integer.MIN_VALUE;
    static int[][] tp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        tp = new int[N][2];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            tp[i][0] = Integer.parseInt(st.nextToken());
            tp[i][1] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);
        System.out.println(ans);
    }

    public static void dfs(int t, int p){
        ans = Math.max(ans, p);

        // 해당 일자의 상담을 진행할 수 없는 경우
        if(t >= N)    return;

        dfs(t + 1, p);                          // 해당 일자 상담 X

        if (t + tp[t][0] <= N)  dfs(t + tp[t][0], p + tp[t][1]);
    }
}