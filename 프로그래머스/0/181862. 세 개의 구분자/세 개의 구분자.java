import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        ArrayList<String> list = new ArrayList<>();
        String[] my_split = myStr.split("a|b|c");
        
        for(String str : my_split){
            if(!str.isEmpty()){
                list.add(str);
            }
        }
        
        String[] answer = list.toArray(new String[0]);
        
        return (answer.length != 0) ? answer : new String[]{"EMPTY"};
    }
}