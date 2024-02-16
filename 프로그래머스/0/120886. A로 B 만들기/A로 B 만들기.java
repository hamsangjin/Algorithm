import java.util.*;

class Solution {
    public int solution(String before, String after) {
        
        String[] list1 = before.split("");
        String[] list2 = after.split("");
        Arrays.sort(list1);
        Arrays.sort(list2);
        
        return Arrays.compare(list1, list2) == 0 ? 1 : 0;
    }
}