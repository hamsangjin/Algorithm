import java.io.*;

// https://www.acmicpc.net/problem/1316
// 시간 복잡도: O(입력된 모든 단어의 문자 수의 총합)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int ans = N;
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            boolean[] visited = new boolean[26];
            char prev = word.charAt(0);

            for (int j = 1; j < word.length(); j++) {
                char curr = word.charAt(j);

                // 현재 문자가 이전 문자와 다르고, 이미 방문한 문자라면 그룹 단어가 아님
                if (curr != prev && visited[curr - 'a']) {
                    ans--;
                    break;
                }

                // 이전 문자를 방문 처리하고, 현재 문자를 다음 비교 대상으로 설정
                visited[prev - 'a'] = true;
                prev = curr;
            }
        }
        System.out.println(ans);
    }
}