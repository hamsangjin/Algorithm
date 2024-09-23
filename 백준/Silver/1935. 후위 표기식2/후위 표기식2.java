import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1935
// 200 - 자료구조 1(참고) -> 후위 표기식2
// 시간 복잡도: O(n + L)
// n: 피연산자의 개수
// L: 후위표기식의 길이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 입력
        int n = Integer.parseInt(br.readLine());

        // 후위 표기식 입력
        String postfix = br.readLine();

        // 피연산자에 대응하는 값 입력
        Map<String, Double> map = new HashMap<>();
        // O(n)
        for(int i = 0 ; i < n ; i++)    map.put(Character.toString((char) (65+i)), Double.parseDouble(br.readLine()));

        Stack<Double> s = new Stack<>();
        // O(L)
        for(char x : postfix.toCharArray()) {
            // 피연산자는 스택에 그냥 추가
            if((int) x >= (int) 'A' && (int) x <= (int) 'Z')    s.push(map.get(Character.toString(x)));
            else{
                double n2 = s.pop();
                double n1 = s.pop();

                // 연산자인 경우 최상단의 피연산자 두 개 꺼내서 계산 후 결과를 스택에 삽입
                switch(Character.toString(x)){
                    case "+":
                        s.push(n1 + n2);
                        break;
                    case "-":
                        s.push(n1 - n2);
                        break;
                    case "*":
                        s.push(n1 * n2);
                        break;
                    case "/":
                        s.push(n1 / n2);
                        break;
                    case "%":
                        s.push( n1 % n2);
                        break;
                }
            }
        }
        // 소수점 둘째자리까지 출력
        System.out.printf("%.2f", s.pop());
    }
}