class Solution {
    public int solution(int[] citations) {
        
        for(int i = citations.length; i >= 1; i--){
            int cnt = 0;
            
            for(int citation : citations){
                if(citation >= i)   cnt ++;
            }
            
            if(cnt >= i)    return i;
        }
        
        return 0;
    }
}