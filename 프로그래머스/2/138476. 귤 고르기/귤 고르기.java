import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        
        // 귤 크기별 개수 세기
        HashMap<Integer, Integer> box = new HashMap<Integer, Integer>();
        for(int t : tangerine){
            box.put(t, box.getOrDefault(t, 0) + 1);
        }
        
        // 개수로 내림차순 정렬한 리스트 저장
        List<Integer> sortList = new ArrayList<>(box.values());
        Collections.sort(sortList, Collections.reverseOrder());
        
        // 가장 많은 개수를 가지고 있는 종류부터 차례대로 더하기
        int answer = 0;
        int total = 0;
        for (Integer value : sortList) {
            // 귤 담기
            total += value;
            // 종류 1개 추가
            answer ++;
            // 담으려는 귤의 개수 k와 같거나 크면 끝
            if(total >= k)  break;
        }
        
        return answer;
    }
}