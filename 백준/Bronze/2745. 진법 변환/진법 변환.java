import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/2745
// 300 - 수학 1(참고) -> 진법 변환
// 시간 복잡도: O(n.length)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n, b 입력
        String[] nb = br.readLine().split(" ");
        String n = nb[0];
        int b = Integer.parseInt(nb[1]);

        int ans = 0;
        // 36^0부터 시작
        int temp = 1;
        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            if(Character.isAlphabetic(c))   ans += (c - 55) * temp;
            else                            ans += (c - 48) * temp;
            // 36^m+1
            temp *= b;
        }
        System.out.println(ans);
    }
}