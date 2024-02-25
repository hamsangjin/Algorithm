class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String b : babbling){
            String str = b.replace("aya", ".").replace("ye", ".").replace("woo", ".").replace("ma", "");
            if(str.equals(".") || str.equals("..") || str.equals("...") || str.equals("....") || str.equals("")){
                answer += 1;
            }
        }
        return answer;
    }
}