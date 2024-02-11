import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        
        int start = 0, end = str_list.length;
        
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                end = i;
                break;
            } else if(str_list[i].equals("r")){
                start = i+1;
                break;
            } 
        }
        
        return (start == 0 && end == str_list.length) ? new String[]{} : Arrays.copyOfRange(str_list, start, end);
    }
}