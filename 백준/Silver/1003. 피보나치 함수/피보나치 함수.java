import java.io.*;

// https://www.acmicpc.net/problem/1003
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] zeros = new int[41];
        zeros[0] = 1;
        zeros[1] = 0;

        int[] ones = new int[41];
        ones[0] = 0;
        ones[1] = 1;

        for(int i = 2; i <= 40; i++){
            zeros[i] = zeros[i - 1] + zeros[i - 2];
            ones[i] = ones[i - 1] + ones[i - 2];
        }

        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(zeros[N]).append(" ").append(ones[N]).append("\n");
        }
        System.out.println(sb);
    }
}