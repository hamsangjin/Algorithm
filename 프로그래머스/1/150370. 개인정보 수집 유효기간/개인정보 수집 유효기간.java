import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> ans = new ArrayList<>();
        // 개인정보 n개가 주어짐
        // 약관별로 개인정보 보관 유효기간이 정해짐
        // 유효기간이 지났으면 파기되어야 함
        // 파기해야할 개인정보 번호를 구하려고 함
        
        // 약관별 개인정보 보관 유효기간 저장
        Map<String, Integer> map = new HashMap<>();
        for(String term : terms){
            String[] temp = term.split(" ");
            map.put(temp[0], Integer.parseInt(temp[1]));
        }
        
        // 오늘 날짜 Calendar 타입으로 변환
        Calendar todayCal = toCalendar(today);
        
        for(int i = 0; i < privacies.length; i++){
            String[] privacy = privacies[i].split(" ");
            
            // 해당 날짜 Calendar로 변환
            Calendar date = toCalendar(privacy[0]);
            
            // 해당 날짜에 유효기간 더하기
            date.add(Calendar.MONTH, map.get(privacy[1]));
            // 1월 5일날 수집된 개인정보면 1월 4일까지 보관가능하므로 -1일
            date.add(Calendar.DAY_OF_MONTH, -1);
            System.out.println(date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DATE));
            // 오늘 날짜보다 이전이면 만료된 것이므로 ans에 추가
            if(date.before(todayCal))       ans.add(i+1);
        }
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
    
    public Calendar toCalendar(String stringDate){
        String[] dateSplit = stringDate.split("\\.");
        int y = Integer.parseInt(dateSplit[0]);
        int m = Integer.parseInt(dateSplit[1]);
        int d = Integer.parseInt(dateSplit[2]);
        Calendar date = Calendar.getInstance();
        date.set(y, m, d);
        return date;
    }
}