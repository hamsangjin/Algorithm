class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(String s : babbling){
            if(!s.contains("ayaaya") && !s.contains("yeye") && !s.contains("woowoo") && !s.contains("mama")){
                for(int i = 0; i < 4; i++)  s = s.replace(words[i], " ");
                s = s.replace(" ", "");
            }
            if(s.length() == 0)    answer++;
        }
        return answer;
    }
}