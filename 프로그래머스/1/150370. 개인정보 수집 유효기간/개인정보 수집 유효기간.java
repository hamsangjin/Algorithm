import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        
        // 약관별 유효기간 저장
        Map<String, Integer> map = new HashMap<>();
        for(String term : terms){
            String[] termSplit = term.split(" ");
            map.put(termSplit[0], Integer.parseInt(termSplit[1]));     
        }
        
        // today Calendar로 변환
        Calendar todayCal = toCalendar(today);
        
        // 개인정보들마다 일자와 약관 확인하고 지났는지 확인
        for(int i = 0; i < privacies.length; i++){
            String[] privacySplit = privacies[i].split(" ");
            Calendar date = toCalendar(privacySplit[0]);
            
            date.add(Calendar.MONTH, map.get(privacySplit[1]));
            date.add(Calendar.DAY_OF_MONTH, -1);
            if (date.before(todayCal))   answer.add(i+1);

        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
    
    public Calendar toCalendar(String today){
        String[] todaySplit = today.split("\\.");
        int y = Integer.parseInt(todaySplit[0]);
        int m = Integer.parseInt(todaySplit[1]);
        int d = Integer.parseInt(todaySplit[2]);
        Calendar date = Calendar.getInstance();
        date.set(y, m, d);
        return date;
    }
    
}