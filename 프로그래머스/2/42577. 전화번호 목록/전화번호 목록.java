import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        
        String temp = "";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(phone_book));
        
        for(String phone : phone_book){
            temp = "";
            for(String x : phone.split("")){
                temp += x;
                if(!phone.equals(temp) && list.contains(temp))   return false; 
            }
        }
        return true;
    }
}