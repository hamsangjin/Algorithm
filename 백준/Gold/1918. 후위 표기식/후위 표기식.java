import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1918
// 200 - 자료구조 1(참고) -> 후위 표기식
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 중위 표기식 입력
        String infix = br.readLine();

        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char x : infix.toCharArray()) {
            switch (x){
                case '+':
                case '-':
                case '*':
                case '/':
                    while (!s.isEmpty() && priority(s.peek()) >= priority(x))       sb.append(s.pop());
                    s.add(x);
                    break;
                case '(':
                    s.add(x);
                    break;
                case ')':
                    while(!s.isEmpty() && s.peek() != '(')  sb.append(s.pop());
                    s.pop();
                    break;
                default:
                    sb.append(x);
            }
        }
        while (!s.isEmpty())    sb.append(s.pop());

        System.out.println(sb);
    }

    // 연산자 별 우선순위 리턴
    public static int priority(char operator){
        if(operator=='(' || operator==')')              return 0;
        else if (operator == '+' || operator == '-')    return 1;
        else if (operator == '*' || operator == '/')    return 2;
        return -1;
    }
}