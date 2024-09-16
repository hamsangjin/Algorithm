import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1874
// 200 - 자료구조 1 -> 에디터
// 시간 복잡도: O(m * L)
// L: 문자열의 길이
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 입력해서 리스트로 변환해 저장
        List<String> list = new LinkedList<>(List.of(br.readLine().split("")));

        // ListIterator로 커서 위치 설정(양방향 이동 가능)
        ListIterator<String> cur = list.listIterator(list.size());

        // m 입력
        int m = Integer.parseInt(br.readLine());

        // m번 반복
        for(int i = 0; i < m; i++) {
            // 명령어 입력
            String[] cmds = br.readLine().split(" ");

            switch (cmds[0]) {
                case "L":
                    if (cur.hasPrevious()) cur.previous();
                    break;
                case "D":
                    if (cur.hasNext()) cur.next();
                    break;
                case "B":
                    if (cur.hasPrevious()) {
                        cur.previous();
                        cur.remove();
                    }
                    break;
                case "P":
                    cur.add(cmds[1]);
                    break;
            }
        }
        System.out.println(String.join("", list));
    }
}