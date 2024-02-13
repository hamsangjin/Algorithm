class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char ch : myString.toCharArray()){
            answer += (int)ch < (int) 'l' ? "l" : ch;
        }
        
        return answer;
    }
}