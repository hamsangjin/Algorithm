import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] list = my_string.toLowerCase().toCharArray();
        
        Arrays.sort(list);
        
        return new String(list);
    }
}