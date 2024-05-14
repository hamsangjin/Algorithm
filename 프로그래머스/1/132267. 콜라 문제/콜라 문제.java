class Solution {
    public int solution(int a, int b, int n) {
        int result = 0;
        while(n > a-1){
            result += (n/a) * b;
            n = (n%a) + ((n/a) * b);
        }
        return result;
    }
}