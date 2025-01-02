import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if(N < 100){
            System.out.println(N);
            System.exit(0);
        }

        // 100 이상이 가질 수 있는 한수의 개수
        int ans = 99;

        for (int i = 100; i <= N; i++) {
            String[] x = Integer.toString(i).split("");
            int a = Integer.parseInt(x[0]);
            int b = Integer.parseInt(x[1]);
            int c = Integer.parseInt(x[2]);

            if(a - b == b - c)  ans++;
        }
        System.out.println(ans);
    }
}