class Solution {
    public int solution(int a, int b) {
        String ab_str = a + "" + b;
        int ab_int = Integer.parseInt(ab_str);
        
        if (ab_int >= (2 * a * b)){
            return ab_int;
        } else{
            return 2 * a * b;
        }   
    }
}