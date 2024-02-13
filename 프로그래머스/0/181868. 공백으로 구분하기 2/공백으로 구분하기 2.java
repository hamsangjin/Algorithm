import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        
        String temp = "";
        
        for(char ch : my_string.toCharArray()){
            String str = Character.toString(ch);
            
            if(str.equals(" ") && !temp.equals("")){
                answer.add(temp);
                temp = "";
            } else if(!str.equals(" ")){
                temp += str;
            }
        }
        
        if(!temp.equals("")){
                answer.add(temp);
        }
        
        
        return answer.toArray(new String[0]);
    }
}