import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 한 명이 여러명을 신고할 순 있지만 1회로 처리
        // k번 이상 신고된 유저는 정지당함
        // 그래서 본인이 신고한 유저가 정지된 횟수를 각각 리턴해주면 됨
        int n = id_list.length;
        
        Map<String, Set<String>> rMap = new HashMap<>();
        for(String id : id_list)        rMap.put(id, new HashSet<>());
        
        // 누가 누구를 신고했는지 저장
        for(String r : report){
            String[] rs = r.split(" ");
            
            rMap.get(rs[0]).add(rs[1]);
        }

        
        // 유저별 신고당한 횟수 저장
        Map<String, Integer> cMap = new HashMap<>();
        for(String id : id_list){
            // i번째 id가 신고한 사람들 불러오기
            for(String user : rMap.get(id)){
                // 그 사람들 + 1
                cMap.put(user, cMap.getOrDefault(user, 0) + 1);
            }
        }
        
        // id_list를 돌면서 
        // 본인이 신고한 사람이 k 이상의 신고건을 받은지 확인
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            for(String user : rMap.get(id_list[i])){
                if(cMap.get(user) >= k)    answer[i] ++;
            }
        }
        
        return answer;
    }
}