class Solution {
    public int solution(String my_string) {
        int answer = 0;        
        for(int i = 0; i < my_string.length(); i++){
            int n = (int) my_string.charAt(i);
            if(n >= 48 && n <= 57){
                answer += n - 48;
            }
        }
        return answer;
    }
}