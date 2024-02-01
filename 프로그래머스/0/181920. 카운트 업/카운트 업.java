import java.util.ArrayList;

class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = start_num; i <= end_num; i++){
            answer.add(i);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();

    }
}