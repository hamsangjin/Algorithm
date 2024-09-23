import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/2743
// 203 - 자료구조 1(참고) -> 단어 길이 재기
// 시간 복잡도: O(1)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받자마자 길이 출력
        System.out.println(br.readLine().length());
    }
}