import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int n = score.length;
        int[] answer = new int[n];
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int s = score[i];
            
            if(list.size() < k){
                list.add(s);
                answer[i] = Collections.min(list);
                Collections.sort(list, Collections.reverseOrder());
            }else{
                if(s > Collections.min(list)){
                    list.set(k-1, s);
                    Collections.sort(list, Collections.reverseOrder());
                }
                answer[i] = Collections.min(list);
            }
        }
        return answer;
    }
}