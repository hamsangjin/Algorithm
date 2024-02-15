class Solution {
    public String solution(int age) {
        String answer = "";
        
        for(char ch : Integer.toString(age).toCharArray()){
            answer += (char) ((int) ch + 49);
        }
        
        return answer;
    }
}