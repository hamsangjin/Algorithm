class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        int[] ch = new int[26];
        for(int i = 0; i < 26; i++) ch[i] = -2;
        
        for(int i = 0; i < s.length(); i++){
            int x = ((int) s.charAt(i)) - 97;
            
            // 처음 나온 경우: answer[i]에 -1로 표현
            if(ch[x] == -2) answer[i] = -1;
            // 처음 나오지 않은 경우: answer[i]에 자신의 위치 - 가장 가까운 같은 글자 위치
            else            answer[i] = i - ch[x];
            
            ch[x] = i;
        }
        return answer;
    }
}

