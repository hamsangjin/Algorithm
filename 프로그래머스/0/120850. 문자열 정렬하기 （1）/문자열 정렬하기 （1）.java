import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        char[] list = my_string.toCharArray();
        Arrays.sort(list);
        
        for(char c : list){
            if(!Character.isDigit(c)){
                break;
            } else{
                answer.add((int) c - '0');
            }
        }
            
        return answer.stream().mapToInt(i -> i).toArray();
    }
}