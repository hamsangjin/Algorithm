class Solution {
    public int solution(String t, String p) {
        int n = p.length();
        int answer = 0;
        
        for(int i = 0; i <= t.length() - n; i++){
            if(Long.parseLong(t.substring(i, i+n)) <= Long.parseLong(p)) 
                answer ++;
        }
        
        return answer;
    }
}