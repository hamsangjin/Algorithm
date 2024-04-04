import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        // 원하는 품목의 개수를 hashmap을 이용해 저장함
        // ex) "banana: 3"
        HashMap<String, Integer> want_map = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            want_map.put(want[i], number[i]);
        }
        
        // number의 원소의 합은 10이므로,
        // discount 배열의 원소를 0~9, 1~10, 2~11 이런 식으로 확인
        for(int i = 0; i < discount.length-9; i++){
            // i ~ i+9까지의 품목의 개수 구하기
            HashMap<String, Integer> tempMap = new HashMap<>();
            for(int j = i; j < i+10; j++){
                tempMap.put(discount[j], tempMap.getOrDefault(discount[j], 0) + 1);
            }
            
            // 원하는 품목의 개수와 같은 경우
            if(want_map.equals(tempMap)) answer ++;
        }
        return answer;
    }
}