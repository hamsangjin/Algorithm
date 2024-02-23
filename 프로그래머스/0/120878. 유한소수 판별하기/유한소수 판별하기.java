import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        // 약분
        for(int i = 2; i <= Math.min(a, b); i ++){
            if(a % i == 0 && b % i == 0){
                a /= i;
                b /= i;
            }
        }
        
        // 소인수 분해
        ArrayList<Integer> list = new ArrayList<>();
        
        while(b != 1){
            for(int i = 2; i <= b; i++){
                if(b % i == 0){
                    list.add(i);
                    b /= i;
                    break;
                }
            }
        }
        
        
        for(int i = 0; i < list.size(); i++){
            if(!list.get(i).equals(new Integer(2)) && !list.get(i).equals(new Integer(5))){
                answer = 2;
                break;
            }    
        }
        
        return answer;
    }
}