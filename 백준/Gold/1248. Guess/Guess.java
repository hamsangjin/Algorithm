import java.io.*;

public class Main {
    static int N;
    static int[] nums;
    static char[][] sign;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        sign = new char[N][N];
        String signInput = br.readLine();
        int idx = 0;
        for (int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                sign[i][j] = signInput.charAt(idx++);
            }
        }
        nums = new int[N];
        dfs(0);
    }
    public static void dfs(int depth) {
        if (depth == N) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++)     sb.append(nums[i]).append(" ");
            System.out.println(sb);
            System.exit(0);
        } else{
            for (int i = -10; i <= 10; i++) {
                nums[depth] = i;
                if(check(depth))    dfs(depth + 1);
            }
        }
    }

    public static boolean check(int depth) {
        for (int i = 0; i <= depth; i++) {
            int sum = 0;
            for (int j = i; j <= depth; j++) {
                sum += nums[j];
                // 부호 맞는지 검사
                if (sign[i][j] != (sum == 0 ? '0' : (sum > 0 ? '+' : '-'))) {
                    return false;
                }
            }
        }
        return true;
    }
}