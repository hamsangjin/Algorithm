import java.util.*;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> answer = new ArrayList<>();
        int temp = 0;
        
        for(char ch : myString.toCharArray()){
            if(Character.toString(ch).equals("x")){
                answer.add(temp);
                temp = 0;
            } else{
                temp ++;
            }
        }
        
        answer.add(temp);
               
        return answer.stream().mapToInt(i -> i).toArray();
    }
}