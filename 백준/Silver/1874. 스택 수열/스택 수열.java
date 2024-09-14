import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1874
// 200 - 자료구조 1 -> 스택 수열
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        List<String> results = new ArrayList<>();
        int cur = 1;
        // n번 반복
        for(int i = 0; i < n; i++) {

            // 숫자 입력
            int num = Integer.parseInt(br.readLine());
            // 이 부분도 최대 n까지
            // 스택이 비었거나, 스택의 가장 최상단 값이 num보다 작은 경우
            while(s.empty() || s.peek() < num){
                s.push(cur++);
                results.add("+");
            }
            
            // while문을 돌고난 후
            // 스택의 최상단 값이 num과 같은 경우
            if(s.peek() == num){
                s.pop();
                results.add("-");
            // 스택의 최상단 값이 num과 같지 않은 경우
            } else{
                System.out.println("NO");
                return;
            }
        }
        results.forEach(System.out::println);
    }
}