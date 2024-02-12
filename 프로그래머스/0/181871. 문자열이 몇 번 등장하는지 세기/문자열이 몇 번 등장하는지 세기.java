import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0, i = 0;
        
        while(i < myString.length()){
            if(myString.indexOf(pat, i) != -1){
                answer++;                        
                i = myString.indexOf(pat, i) + 1; 
            } else{
                i++;
            }
        }
        
        return answer;
    }
}