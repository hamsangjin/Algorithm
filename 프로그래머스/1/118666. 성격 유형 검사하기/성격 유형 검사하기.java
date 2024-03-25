import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        // 선택과 매칭되는 점수 정의
        HashMap<Integer, Integer> scores = new HashMap<Integer, Integer>();
        // for(int i = 1; i <= 7; i++){
        //     if(i <= 3)      scores.put(i, 4-i);
        //     if(i >= 5)      scores.put(i, i-4);
        // }
        scores.put(1, 3);scores.put(2, 2);scores.put(3, 1);scores.put(4, 0);
        scores.put(5, 1);scores.put(6, 2);scores.put(7, 3);
        
        // 유형별 누적 점수 저장
        HashMap<String, Integer> categories = new HashMap<String, Integer>();
        for(String category : new String[]{"R", "T", "C", "F", "J", "M", "A", "N"}){
            categories.put(category, 0);
        }
        
        for(int i = 0; i < survey.length; i++){
            // 유형 두 개 나누기
            String c1 = "" + survey[i].charAt(0);
            String c2 = "" + survey[i].charAt(1);
            
            // c1 유형에 더해지는 선택이냐?
            if(choices[i] <= 3){
                // 그렇다면 c1의 점수를 꺼내서 해당 선택과 매칭되는 점수를 더해라
                categories.put(c1, categories.get(c1) + scores.get(choices[i]));
            // c2 유형에 더해지는 선택이냐 ?
            } else if(choices[i] >= 3){
                // 그렇다면 c2의 점수를 꺼내서 해당 선택과 매칭되는 점수를 더해라
                categories.put(c2, categories.get(c2) + scores.get(choices[i]));
            }
        }
        
        // 유형별 더 큰 점수로 저장하되, 같은 경우 사전 순으로 빠른 유형으로 저장
        String answer = "";
        answer += (categories.get("R") < categories.get("T")) ? "T" : "R";
        answer += (categories.get("C") < categories.get("F")) ? "F" : "C";
        answer += (categories.get("J") < categories.get("M")) ? "M" : "J";
        answer += (categories.get("A") < categories.get("N")) ? "N" : "A";
        
        return answer;
    }
}