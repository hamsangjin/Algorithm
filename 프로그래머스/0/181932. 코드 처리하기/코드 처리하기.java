class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        
        for(int i = 0; i < code.length(); i++){
            if (code.charAt(i) == '1'){
                mode = mode == 1 ? 0 : 1;
                continue;
            }
            
            if (mode == 0){
                answer += (i % 2 == 0) ? code.charAt(i) : "";
            } else if (mode == 1){
                answer += (i % 2 == 1) ? code.charAt(i) : "";
            }
            
        }
        return answer.length() >= 1 ? answer : "EMPTY";
    }
}