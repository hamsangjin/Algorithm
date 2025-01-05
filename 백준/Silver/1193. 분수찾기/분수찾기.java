import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        int sum = 0;
        int cnt = 1;

        // 홀수번째 대각선이면 아래서 위로         -> 분자가 큰 수부터
        // 짝수번째 대각선이면 위에서 아래로       -> 분모가 큰 수부터
        while (true) {
            // 해당 대각선이냐 ?
            if (X <= sum + cnt) {

                // 홀수번째 대각선인 경우
                if (cnt % 2 == 1) {
                    // 분자는 cnt - (X - sum - 1), 분모는 X - sum
                    System.out.print((cnt - (X - sum - 1)) + "/" + (X - sum));
                    break;
                // 짝수번째 대각선인 경우
                } else {
                    System.out.print((X - sum) + "/" + (cnt - (X - sum - 1)));
                    break;
                }
            // 다음 대각선 보기
            } else {
                sum += cnt;
                cnt++;
            }
        }
    }
}