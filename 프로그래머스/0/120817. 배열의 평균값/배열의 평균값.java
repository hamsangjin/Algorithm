import java.util.*;

class Solution {
    public double solution(int[] numbers) {
        return (double) Arrays.stream(numbers).sum() / numbers.length;
    }
}