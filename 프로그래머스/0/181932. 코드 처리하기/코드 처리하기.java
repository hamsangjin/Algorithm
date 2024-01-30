class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            char x = code.charAt(i);
            if (x == '1'){
                mode = mode == 1 ? 0 : 1;
                continue;
            }
            
            if (i % 2 == mode){
                answer += x;
            }
            
        }
        return answer.length() >= 1 ? answer : "EMPTY";
    }
}