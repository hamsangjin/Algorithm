import java.io.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/10808
// 200 - 자료구조 1(참고) -> 알파벳 개수
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // w 입력
        String w = br.readLine();

        // cntArr 생성
        int[] cntArr = new int[26];

        // 단어를 돌면서 각 알파벳의 개수 세기
        for(char c : w.toCharArray())       cntArr[c - 'a']++;

        // 각 알파벳의 개수 출력
        for(int n : cntArr)                 System.out.print(n + " ");
    }
}