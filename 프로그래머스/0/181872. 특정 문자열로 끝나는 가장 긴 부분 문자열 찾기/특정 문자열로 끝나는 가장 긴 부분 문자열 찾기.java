class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++){
            if(myString.substring(0, myString.length()-i).endsWith(pat)){
                answer = myString.substring(0, myString.length()-i);
                break;
            }
        }
        
        return answer;
    }
}