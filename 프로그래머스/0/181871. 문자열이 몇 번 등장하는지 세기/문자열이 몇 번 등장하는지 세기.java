class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for(int i = 0; i < myString.length(); i++) {
            if(myString.substring(i).startsWith(pat)){
                answer++;
            }
        }
        
        return answer;
    }
}