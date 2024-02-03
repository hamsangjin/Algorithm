import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] my_string_list = my_string.toCharArray();
        
        for(int idx : index_list){
            answer += my_string_list[idx];
        }
        
        return answer;
    }
}