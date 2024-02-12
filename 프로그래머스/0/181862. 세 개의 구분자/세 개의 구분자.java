import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        ArrayList<String> strs = new ArrayList<>();
        String temp = "";
        
        for(char ch : myStr.toCharArray()){
            // 구분자가 아닌 경우
            if(ch != 'a' && ch != 'b' && ch != 'c'){
                temp += String.valueOf(ch);             // 글자 추가해
                
            // 구분자이면서, temp가 비어있지 않은 경우
            } else if(temp.length() != 0){
                strs.add(temp);                         // 현재 temp 배열에 추가
                temp = "";                              // temp 초기화
            }
        }
        
        // 마지막에 구분자가 안 나왔을 경우 남아있는 temp 추가
        if(temp.length() != 0){
            strs.add(temp);
        }
        
        String[] answer = strs.toArray(new String[0]);
        
        return (answer.length != 0) ? answer : new String[]{"EMPTY"};
    }
}