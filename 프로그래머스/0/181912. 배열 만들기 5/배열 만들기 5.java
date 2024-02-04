import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // 1. "0123456789"
        for(String intStr : intStrs){
            
            // 2. 56789
            int n = Integer.parseInt(new String(Arrays.copyOfRange(intStr.toCharArray(), s, s+l)));
            
            // 3. 56789 > k
            if (n > k){
            
                // 4. answer에 56789 추가
                answer.add(n);
            }
        }
        // 5. int 배열로 변환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}