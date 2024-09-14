import java.io.*;
import java.util.Stack;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/9012
// 200 - 자료구조 1 -> 괄호
// 시간 복잡도: O(n * L)
// - L: 입력된 괄호들의 길이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력
        int n = Integer.parseInt(br.readLine());

        // n번 반복
        for(int i = 0; i < n; i++) {
            Stack<String> s = new Stack<>();

            // 괄호 입력
            String[] in = br.readLine().split("");
            for(String str : in) {
                // 입력이 )인 경우, 스택이 비어있지 않고 가장 최상단의 괄호가 (이면 괄호가 쌍이 이루어진 것이므로 괄호 쌍 제거
                if(str.equals(")") && !s.isEmpty() && s.peek().equals("("))     s.pop();
                // 아니면 스택에 추가
                else                                                        s.push(str);
            }

            if(s.isEmpty())     System.out.println("YES");
            else                System.out.println("NO");
        }
    }
}