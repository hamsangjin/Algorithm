class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        int n = code.length();
        for(int i = r; i < n; i+=q){
            answer += code.charAt(i);
        }
        
        return answer;
    }
}