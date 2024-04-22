import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            q.add(new int[]{i, priorities[i]});
        }

        int answer = 0;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            boolean flag = false;
            for (int[] p : q) {
                if (cur[1] < p[1]) {
                    flag = true;
                    break;
                }
            }
            
            if (flag) {
                q.add(cur);
            } else {
                answer++;
                if (cur[0] == location) {
                    return answer;
                }
            }
        }
        return -1;
    }
}