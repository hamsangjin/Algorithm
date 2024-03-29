import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // x를 기준으로 나누고 사전순으로 정렬
        String[] answer = myString.split("x");
        
        Arrays.sort(answer);
        
        // 빈 문자열이 아닌 문자열 개수 세서, 빈 문자열 제외하고 배열 복사
        for(int i = 0; i < answer.length; i++){
            if(!answer[i].equals("")){
                answer = Arrays.copyOfRange(answer, i, answer.length);
                break;
            }
        }
        
        return (answer.length != 0) ? answer : new String[]{};
    }
}