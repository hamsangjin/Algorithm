import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/10820
// 203 - 자료구조 1(참고) -> 문자열 분석
// 시간 복잡도: O(n + L)
// n: 입력 횟수
// L: 문자열 길이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력이 null일 때까지 문자열 입력받기
        String input;
        while ((input = br.readLine()) != null){
            // 소문자, 대문자, 숫자, 공백 초기화
            int l = 0, u = 0, n = 0, s = 0;

            for(char c : input.toCharArray()){
                if(Character.isLowerCase(c))        l++;
                else if(Character.isUpperCase(c))   u++;
                else if(Character.isDigit(c))       n++;
                else s++;
            }

            System.out.println(l + " " + u + " " + n + " " + s);
        }
    }
}