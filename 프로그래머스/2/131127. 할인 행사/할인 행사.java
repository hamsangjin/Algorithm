import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> want_map = new HashMap<>();
        
        for(int i = 0; i < want.length; i++){
            want_map.put(want[i], number[i]);
        }
        
        for(int i = 0; i < discount.length-9; i++){
            HashMap<String, Integer> tempMap = new HashMap<>();
            for(String product : Arrays.copyOfRange(discount, i, i+10)){
                tempMap.put(product, tempMap.getOrDefault(product, 0) + 1);
            }
            
            if(want_map.equals(tempMap)) answer ++;
        }
        return answer;
    }
}