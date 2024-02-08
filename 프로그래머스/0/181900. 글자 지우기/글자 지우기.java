import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        
        char[] str_list = my_string.toCharArray();
        Arrays.sort(indices);
        String answer = "";
        
        for(int i = 0, j = 0; i < str_list.length; i++){
            
            // indices에 포함 안 된 인덱스
            if (i != indices[j]){
                answer += Character.toString(str_list[i]);
            
            // indices에 포함된 인덱스
            } else if(j < indices.length-1){
                j++;
            }
        }
        
        
        return answer;
    }
}