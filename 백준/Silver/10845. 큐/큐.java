import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/10845
// 200 - 자료구조 1 -> 큐
// 시간 복잡도: O(n)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 큐 선언
        LinkedList<Integer> q = new LinkedList<>();

        // n 입력
        int n = Integer.parseInt(br.readLine());

        // n번 반복
        for(int i = 0; i < n; i++) {
            // 명령어 입력(cmds[0]에는 명령어, cmds[1]에는 정수)
            String[] cmds = br.readLine().split(" ");

            // 전부 O(1)의 시간
            // LinkedList는 삭제를 하더라도 인덱스를 새로 정렬하지 않고, 링크를 재구성하는 것이기 때문에
            switch(cmds[0]) {
                case "push":
                    q.add(Integer.parseInt(cmds[1]));
                    break;
                case "pop":
                    System.out.println(q.isEmpty() ? -1 : q.remove(0));
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    System.out.println(q.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    System.out.println(q.isEmpty() ? -1 : q.getFirst());
                    break;
                case "back":
                    System.out.println(q.isEmpty() ? -1 : q.getLast());
                    break;
            }
        }
    }
}