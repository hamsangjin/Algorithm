import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        // hashMap<String, Set<String> 묶어서 저장 - set으로 중복처리
        Map<String, Set<String>> map = new HashMap<>();
        
        
        for(String id : id_list){
            map.put(id, new HashSet<>());
        }
        for(String r : report){
            String[] temp = r.split(" ");
            map.get(temp[0]).add(temp[1]);
        }
        
        // 유저별 신고당한 횟수 카운트
        Map<String, Integer> reportCountMap = new HashMap<>();
        for(String id : id_list){
            for(String str : map.get(id)){
                reportCountMap.put(str, reportCountMap.getOrDefault(str, 0) + 1);
            }
        }
        
        // key값 별로 신고한 사람들이 처리된 횟수 구하기
        for(int i = 0; i < id_list.length; i++){
            for(String str : map.get(id_list[i])){
                if(reportCountMap.get(str) >= k)    answer[i] ++;
            }
        }
        
        return answer;
    }
}