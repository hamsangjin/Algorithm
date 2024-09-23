import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/11656
// 203 - 자료구조 1(참고) -> 접미사 배열
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // s 입력
        String s = br.readLine();

        // 접미사 배열 생성
        List<String> sList = new ArrayList<>();
        for(int i = 0; i < s.length(); i++)     sList.add(s.substring(i, s.length()));

        // 정렬 후 출력
        sList.sort(String::compareTo);
        sList.forEach(System.out::println);
    }
}