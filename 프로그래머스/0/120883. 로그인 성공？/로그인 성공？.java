class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        String answer = "fail";
        
        for(String[] db_load : db){
            if(db_load[0].equals(id_pw[0])){
                if(db_load[1].equals(id_pw[1])){
                    answer = "login";
                    break;
                } else{
                    answer = "wrong pw";
                }
            }
        }
        
        return answer;
    }
}