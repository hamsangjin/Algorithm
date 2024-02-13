class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char ch : myString.toLowerCase().toCharArray()){
            answer += (ch == 'a') ? Character.toString(ch).toUpperCase() : ch;
        }
        
        return answer;
    }
}