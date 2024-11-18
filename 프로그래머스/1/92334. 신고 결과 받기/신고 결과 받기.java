import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        Map<String, HashSet<String>> map = new HashMap<>(); // 신고당한 user - 신고한 user
        Map<String, Integer> nameMap = new HashMap<>(); // 이용자id-신고당한횟수

        // 값 초기화
        int n = id_list.length;
        for(int i = 0; i < n; i++) {
            map.put(id_list[i], new HashSet<>());
            nameMap.put(id_list[i], i);
        }

        // 신고 목록 돌면서 map 채워주기
        for(String s : report) {
            String[] str = s.split(" ");
            map.get(str[1]).add(str[0]);
        }

      
        int[] result = new int[n];

        // 나 : muzi 
        // 유저들 돌아
        for(int i = 0; i < id_list.length; i++) {
            // 본인을 신고한 리스트 받아와
            // 길동과 무개
            HashSet<String> emailSet = map.get(id_list[i]); // 신고한id 저장
            // 본인이 k개 이상으로 신고받았어 ?
            if(emailSet.size() >= k) {
                for(String name : emailSet) { // 신고한id 에게 이메일 전송
                    result[nameMap.get(name)]++;
                }
            }
        }

        return result;
    }
}