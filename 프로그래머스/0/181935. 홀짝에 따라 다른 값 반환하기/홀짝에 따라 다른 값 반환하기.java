class Solution {
    public static int get_Square(int n){
        return n*n;
    }
    
    public int solution(int n) {
        int odd_sum = 0, even_sum = 0;
        
        for(int i = 1; i <= n; i++){
            if (i % 2 == 0){
                even_sum += get_Square(i);
            } else{
                odd_sum += i;
            }
        }
        
        return (n % 2 == 0) ? even_sum : odd_sum;
    }
}