class Solution {
    public String solution(String my_string, int num1, int num2) {
        
        String[] list = my_string.split("");
        
        String temp = list[num1];
        list[num1] = list[num2];
        list[num2] = temp;
        
        String answer = "";
        for(String str : list){
            answer += str;
        }
        
        return answer;
    }
}