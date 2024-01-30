import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        
        return (Arrays.stream(num_list).reduce((num, x) -> num * x).getAsInt() < Math.pow(Arrays.stream(num_list).sum(), 2)) ? 1 : 0;
    }
}