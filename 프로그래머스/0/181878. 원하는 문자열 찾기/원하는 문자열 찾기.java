import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        char[] pat_ch = pat.toLowerCase().toCharArray(), my_ch = myString.toLowerCase().toCharArray();
        char[] temp = new char[pat.length()];
        
        for(int i = 0; i < myString.length() - pat.length() + 1; i++){
        
            temp = new char[pat.length()];
            
            for(int j = i, k = 0; j < i+pat.length(); j++, k++){
                temp[k] = my_ch[j];
            }
            
            // System.out.println(Arrays.toString(temp));
            
            if(Arrays.equals(temp, pat_ch)){
                answer = 1;
                break;
            }
        }
        return answer;
    }
}