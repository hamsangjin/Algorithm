class Solution {
    public int solution(int n) {
        return (n == (int)Math.pow((int)Math.sqrt(n), 2)) ? 1 : 2;
    }
}