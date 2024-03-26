class Solution {
    public int solution(int num) {
        
        if (num == 1)   return 0;
        
        for(int i = 0; i <= 500; i++){
            if(num == 1)    return i;
            if(num < 1)     break;
            if(num % 2 == 0) num /= 2;
            else    num = num * 3 + 1;
        }
            
        return -1;
    }
}