import java.util.*;

class Solution {
    public int solution(String num_str) {
        
        return Arrays.stream(Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).toArray()).sum();
    }
}