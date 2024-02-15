import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] list = my_string.toCharArray();
        
        for(int i = 0; i < list.length; i++){
            list[i] = Character.toLowerCase(list[i]);
        }
        
        Arrays.sort(list);
        
        return new String(list);
    }
}