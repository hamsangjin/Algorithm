import java.io.*;
import java.util.*;

// https://code.plus/course/41
// https://www.acmicpc.net/problem/1158
// 200 - 자료구조 1 -> 요세푸스 문제
// 시간 복잡도: O(n**2)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n, k 입력
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        // 큐 선언
        List<String> q = new LinkedList<>();

        // O(n)의 시간복잡도
        for (int i = 1; i <= n; i++)        q.add(Integer.toString(i));
        int cur = 0;

        // 1 2 3 4 5 6 7
        List<String> result = new ArrayList<>();
        // O(n**2)의 시간복잡도
        for(int i = 0; i < n; i++) {
            // 원소가 하나씩 줄기 때문에 -1 해줘야하며,
            // 리스트의 사이즈를 벗어날 경우도 있으므로 % q.size()해줘야함
            cur = (cur + (k - 1)) % q.size();
            // 원소를 제거하기위해 그 원소(인덱스)까지 접근해야 하므로 O(n)
            result.add(q.remove(cur));
        }

        // O(n)의 시간복잡도
        System.out.println("<" + String.join(", ", result) + ">");
    }
}