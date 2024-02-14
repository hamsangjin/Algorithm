class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] list = my_string.toCharArray();
        for(int i = list.length-1; i >= 0; i--){
            answer += list[i];
        }
        return answer;
    }
}