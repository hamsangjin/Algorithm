class Solution {
    public int solution(String my_string) {
        int answer = 0;        
        for(char ch : my_string.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                answer += ch - '0';
            }
        }
        return answer;
    }
}