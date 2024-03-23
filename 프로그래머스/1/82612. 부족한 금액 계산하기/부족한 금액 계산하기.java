class Solution {
    public long solution(int price, int money, int count) {
        long n = 0;
        
        for(int i = 1; i <= count; i++){
            n += price * i;
        }
        
        return (money - n) >= 0 ? 0 :  n - money;
    }
}