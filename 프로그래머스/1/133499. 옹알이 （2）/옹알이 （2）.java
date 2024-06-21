class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String s : babbling){
            if(!s.contains("ayaaya") && !s.contains("yeye") && !s.contains("woowoo") && !s.contains("mama")){
                s = s.replaceAll("aya|ye|woo|ma", " ").replace(" ", "");
            }
            if(s.length() == 0)    answer++;
        }
        return answer;
    }
}