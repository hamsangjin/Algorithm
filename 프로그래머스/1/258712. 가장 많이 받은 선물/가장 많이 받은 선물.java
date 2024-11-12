import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        int n = friends.length;

        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++) list.add(friends[i]);

        int[] giftScore = new int[n];  // 선물 지수
        int[][] graph = new int[n][n];

        for(int i=0; i<gifts.length; i++) {
            String[] fromTo = gifts[i].split(" ");
            String f = fromTo[0];    // 선물 준 사람
            String t = fromTo[1];      // 선물 받은 사람

            // 좌표 (from, to) 에 +1
            int from = list.indexOf(f);
            int to = list.indexOf(t);

            graph[from][to] += 1;
        }

        // 선물 지수 계산
        for(int i=0; i<n; i++) {
            int give = 0;
            int given = 0;
            for(int j=0; j<n; j++) {
                given += graph[j][i];    // 선물을 준 횟수
                give += graph[i][j];  // 선물을 받은 횟수
            }

            giftScore[i] = give - given;    // 선물 지수 = 준 거 - 받은 거
        }

        // 각자 받는 선물 중 최대 갱신
        for(int i=0; i<n; i++) {
            int present = 0;

            for(int j=0; j<n; j++) {
                if(i == j) continue;    // 본인 제외

                // 주고 받은 횟수와 선물 지수를 보고 받을 선물 계산
                if(graph[i][j] == graph[j][i]) {    // 주고 받은 횟수가 같은 경우
                    // 선물 지수 판단
                    if(giftScore[i] > giftScore[j]) {   // 선물 지수가 더 클 때 받기
                        present++;
                    }
                }
                else if(graph[i][j] > graph[j][i]) {    // 선물을 더 줬을 경우
                    present++;
                }
            }

            answer = Math.max(answer, present);  // 최댓값 갱신
        }

        return answer;
    }
}