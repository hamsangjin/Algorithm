class Solution {
    public int[] solution(int n, int m) {
        int nm = n * m;
        
        if(n < m){
            int temp = n;
            n = m;
            m = temp;
        }
        
        while(m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        
        return new int[]{n, nm / n};
        
    }
}