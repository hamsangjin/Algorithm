class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        
        for(char ch : myString.toCharArray()){
            if(Character.toString(ch).equals("A")){
                answer += "B";
            } else{
                answer += "A";
            }
        }
        
        return answer.contains(pat) ? 1 : 0;
    }
}