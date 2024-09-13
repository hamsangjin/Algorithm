import java.io.*;
import java.util.Stack;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/10828
// 200 - 자료구조 1 -> 스택
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();

        // n번 반복
        for(int i = 0; i < n; i++) {
            // 명령어 입력
            String[] c = br.readLine().split(" ");

            switch (c[0]){
                case "push":
                    s.push(Integer.parseInt(c[1]));
                    break;
                case "pop":
                    System.out.println(s.isEmpty() ? -1 : s.pop());
                    break;
                case "size":
                    System.out.println(s.size());
                    break;
                case "top":
                    System.out.println(s.isEmpty() ? -1 : s.peek());
                    break;
                case "empty":
                    System.out.println(s.empty() ? 1 : 0);
                    break;
            }
        }
    }
}