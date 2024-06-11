class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1단계
        answer = new_id.toLowerCase();
        
        // 2단계
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        
        // 3단계
        answer = answer.replaceAll("\\.{2,}", ".");
        
        // 4단계
        answer = answer.replaceAll("^[.]|[.]$", "");
        
        // 5단계
        answer = answer.length() == 0 ? "a" : answer;
        
        // 6단계
        answer = answer.length() >= 16 ? answer.substring(0, 15) : answer;
        answer = answer.replaceAll("[.]$", "");
        
        // 7단계
        answer = answer.length() <= 2 ? answer + answer.substring(answer.length() - 1).repeat(3-answer.length()) : answer;
        
        return answer;        
    }
}