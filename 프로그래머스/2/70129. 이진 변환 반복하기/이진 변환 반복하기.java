import java.util.*;

class Solution {
    public int[] solution(String s) {
        String temp = "";
        int zero_cnt = 0, trans_cnt = 0;
        
        while(!s.equals("1")){
            temp = "";
            
            for(String str : s.split("")){
                if(str.equals("1"))   temp += str;
                else zero_cnt += 1;
            }
            
            s = Integer.toBinaryString(temp.length());
            trans_cnt ++;
        }
        
        return new int[]{trans_cnt, zero_cnt};
    }
}