import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> answer = new ArrayList<>();

        int day = 1;
        int temp = 0;
        // 하나씩 기능 해결
        for(int i = 0; i < progresses.length; i++){
            // 기능이 현재 day로 해결가능하냐 ?
            if(progresses[i] + speeds[i]*day >= 100){
                // 그렇다면 현재날짜까지 기능이 해결가능한 개수 +1
                temp ++;
            // 현재 기능이 해결 불가능이냐? 
            } else{
                // 현재 날짜까지 해결된 기능이 하나라도 있냐 ?
                if(temp > 0){
                    // 그렇다면 return할 리스트에 현재 날짜까지 해결한 기능의 개수인 temp를 추가해주고 0으로 초기화.
                    answer.add(temp);
                    temp = 0;
                }
                
                // 다시 해당 기능을 해결하기 위해 날짜(day)는 늘리고, 
                // i-- 연산을 통해 같은 기능을 또 비교
                i--;
                day++;
            }
        }
        
        // 마지막으로 해결된 기능 else문 실행이 안되므로 여기서 추가
        if(temp != 0)   answer.add(temp);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}