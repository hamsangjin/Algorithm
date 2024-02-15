class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i < s1.length; i++){
            for(int j = 0; j < s2.length; j++){
                answer += (s1[i].equals(s2[j])) ? 1 : 0;
            }
        }
        
        return answer;
    }
}