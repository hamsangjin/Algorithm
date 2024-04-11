import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String key : keymap){
            String[] keySplit = key.split("");
            for(int i = 0; i < keySplit.length; i++){
                if(map.get(keySplit[i]) != null){
                    if(map.get(keySplit[i]) > i+1){
                        map.replace(keySplit[i], i+1);
                    }
                } else{
                    map.put(keySplit[i], i+1);
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            int sum = 0;
            for(String str : targets[i].split("")){
                if(map.containsKey(str)){
                    sum += map.get(str);
                } else{
                    sum = -1;
                    break;
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}