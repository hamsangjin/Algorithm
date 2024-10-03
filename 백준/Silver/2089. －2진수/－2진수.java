import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/2089
// 300 - 수학 1(연습) -> -2진수
// 시간 복잡도: O(log |n|)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력
        int n = Integer.parseInt(br.readLine());
        
        // n이 0인 경우 출력
        // 이 부분이 없으면 아래에서 무한루프에 빠짐
        if (n == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();

        // 2진수는 2로 나눴을 때의 나머지를 가지고 구하는 것이므로
        // -2진수는 -2로 나누기
        // 이때, 2진수는 나누고 소수점 내림하지만, -2진수는 소수점 올림해준다.
        // O(log |n|) -> 계속 반씩 줄어들기 때문에
        while (n != 1) {
            sb.append(Math.abs(n % -2));
            n = (int) Math.ceil(((double) n) / -2);
        }
        System.out.println(sb.append(n).reverse());
    }
}