import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        HashMap<String, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            tempMap.put(discount[i], tempMap.getOrDefault(discount[i], 0) + 1);
        }

        int cur1 = 0;
        int cur2 = 9;
        if (wantMap.equals(tempMap)) answer++;
        
        while (cur2 < discount.length-1) {
            tempMap.put(discount[cur1], tempMap.getOrDefault(discount[cur1], 0) - 1);
            if (tempMap.get(discount[cur1]) == 0) tempMap.remove(discount[cur1]);
            cur1++;
            cur2++;
            tempMap.put(discount[cur2], tempMap.getOrDefault(discount[cur2], 0) + 1);

            if (wantMap.equals(tempMap)) answer++;
        }
        return answer;
    }
}