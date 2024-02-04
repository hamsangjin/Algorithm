import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int n = my_string.length();
        String[] str_list = new String[n];
        
        for(int i = 0; i < n; i++){
            str_list[i] = my_string.substring(i);
        }
        
        return (Arrays.asList(str_list).indexOf(is_suffix) != -1) ? 1 : 0;
    }
}