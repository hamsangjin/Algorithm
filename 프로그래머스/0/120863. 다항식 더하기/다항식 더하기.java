import java.util.*;

class Solution {
    public String solution(String polynomial) {

        int x = 0, n = 0;
        
        for(String str : polynomial.split(" ")){
            if(str.contains("x")){
                x += str.equals("x") ? 1 : Integer.parseInt(str.replace("x", ""));   
            } else if(!str.equals("+")){
                n += Integer.parseInt(str);
            }
        }
        
        return (x != 0 ? x > 1 ? x + "x" : "x" : "") 
        		+ (n != 0 ? (x != 0 ? " + " : "") 
                + n : x == 0 ? "0" : "");
    }
}