import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int num = 0, L = 0;

        Map<String, Boolean> map = new HashMap<>();
        int[] answer = new int[]{0, 0};
        
        for(int i = 0; i < words.length; i++){
            // 첫 번째인 경우 아무 제약이 없으므로 단어만 추가하고 넘어가기
            // 이미 단어를 말했거나 이전 단어의 마지막 문자로 시작하지 않는 경우
            if(i >= 1 &&  (map.containsKey(words[i]) || words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0))){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }else{
                map.put(words[i], true);
                continue;
            }
        }
        return answer;
    }
}