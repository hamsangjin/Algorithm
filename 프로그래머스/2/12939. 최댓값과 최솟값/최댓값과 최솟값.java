class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String c : s.split(" ")){
            int n = Integer.parseInt(c);
            if (n > max) max = n;
            if (n < min) min = n;
        }
        
        return min + " " + max;
    }
}