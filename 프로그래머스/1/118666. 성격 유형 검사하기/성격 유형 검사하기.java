import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
    
        // 선택에 따른 성격 유형 점수 저장
        int[] scores = {0, 3, 2, 1, 0, 1, 2, 3};
        
        // 유형별 점수 저장
        Map<String, Integer> categories = new HashMap<>();
    
        for(int i = 0; i < survey.length; i++){
            String c1 = survey[i].split("")[0];
            String c2 = survey[i].split("")[1];
            int choice = choices[i];
            
            // 비동의 선택
            if(choice <= 3)     categories.put(c1, categories.getOrDefault(c1, 0) + scores[choice]);
            // 동의 선택
            else                categories.put(c2, categories.getOrDefault(c2, 0) + scores[choice]);
        }
        
        System.out.println(categories);
        
        /*
        1번 지표	라이언형(R), 튜브형(T)
        2번 지표	콘형(C), 프로도형(F)
        3번 지표	제이지형(J), 무지형(M)
        4번 지표	어피치형(A), 네오형(N)
        */
        
        // T가 R보다 큰 경우에만 T로 하고, 같거나(사전순) 작은 경우엔 R로 설정
        String rt = (categories.getOrDefault("R", 0) < categories.getOrDefault("T", 0)) ? "T" : "R";
        String cf = (categories.getOrDefault("C", 0) < categories.getOrDefault("F", 0)) ? "F" : "C";
        String jm = (categories.getOrDefault("J", 0) < categories.getOrDefault("M", 0)) ? "M" : "J";
        String an = (categories.getOrDefault("A", 0) < categories.getOrDefault("N", 0)) ? "N" : "A";
        
        return rt + cf + jm + an;
    }
}