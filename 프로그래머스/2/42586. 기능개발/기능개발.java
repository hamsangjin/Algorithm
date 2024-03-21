import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> answer = new ArrayList<>();

        int day = 1;
        int index = 0;
        int temp = 0;
        while(index < progresses.length){
            if(progresses[index] + speeds[index]*day >= 100){
                temp ++;
                index ++;
                continue;
            }
            if(temp != 0){
                answer.add(temp);
                temp = 0;
            }
            day ++;
        }

        if(temp != 0)   answer.add(temp);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}