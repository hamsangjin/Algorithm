class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] list = my_string.split("");
        
        for(String str : list){
            if(!answer.contains(str)) answer += str;
        }
        
        return answer;
    }
}