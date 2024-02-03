import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        int n = picture.length;
        
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            String str = picture[i];
            String x = "";
            
            for(char ch : str.toCharArray()){
                x += (ch == 'x') ? "x".repeat(k) : ".".repeat(k);
            }
            for(int j = 0; j < k; j++){
                answer.add(x);
            }
        }
        
        return answer.toArray(new String[answer.size()]);
    }
}