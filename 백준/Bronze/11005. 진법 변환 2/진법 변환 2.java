import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/11005
// 300 - 수학 1(참고) -> 진법 변환 2
// 시간 복잡도: O(log_b(n))
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n, b 입력
        String[] nb = br.readLine().split(" ");
        int n = Integer.parseInt(nb[0]);
        int b = Integer.parseInt(nb[1]);

        // b보다 작아질 때까지 n을 b로 계속 나누기
        // 나머지가 10보다 큰 경우 알파벳으로 변환
        // O(log_b(n))
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            numberToLetter(n%b, sb);
            n /= b;
        }
        System.out.println(sb.reverse());
    }

    // O(1)
    // 알파벳 변환 메소드
    private static void numberToLetter(int n, StringBuilder sb) {
        // 대문지의 아스키 코드가 65 ~ 90인 걸 이용해서
        // 10이상인 경우 10을 뺀 55를 더해주기
        if(n >= 10)     sb.append((char)(n + 55));
        else            sb.append(n);
    }
}