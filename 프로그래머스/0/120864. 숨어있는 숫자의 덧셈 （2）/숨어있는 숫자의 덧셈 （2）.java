class Solution {
    public int solution(String my_string) {
        
        int answer = 0;
        
        for(String str : my_string.replaceAll("[a-zA-Z]", " ").split(" ")){
            answer += (!str.equals("")) ? Integer.parseInt(str) : 0;
        }
        
        return answer;
    }
}