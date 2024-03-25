import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        
        scores.put("1", 3);scores.put("2", 2);scores.put("3", 1);scores.put("4", 0);
        scores.put("5", 1);scores.put("6", 2);scores.put("7", 3);
        
        HashMap<String, Integer> categories = new HashMap<String, Integer>();
        categories.put("R", 0);categories.put("T", 0);categories.put("C", 0);categories.put("F", 0);
        categories.put("J", 0);categories.put("M", 0);categories.put("A", 0);categories.put("N", 0);
        
        for(int i = 0; i < survey.length; i++){
            String c1 = "" + survey[i].charAt(0);
            String c2 = "" + survey[i].charAt(1);
            
            if(choices[i] <= 3){
                categories.put(c1, categories.get(c1) + scores.get(Integer.toString(choices[i])));
            } else if(choices[i] >= 3){
                categories.put(c2, categories.get(c2) + scores.get(Integer.toString(choices[i])));
            }
        }
        
        String answer = "";
        answer += (categories.get("R") < categories.get("T")) ? "T" : "R";
        answer += (categories.get("C") < categories.get("F")) ? "F" : "C";
        answer += (categories.get("J") < categories.get("M")) ? "M" : "J";
        answer += (categories.get("A") < categories.get("N")) ? "N" : "A";
        
        return answer;
    }
}