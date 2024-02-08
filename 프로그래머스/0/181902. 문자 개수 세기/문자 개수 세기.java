class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(char ch : my_string.toCharArray()){
            answer[(int)ch - (int)'A' - ((int)ch < 97 ? 0 : 6)] += 1;
        }
        //
            
        return answer;
        
    }
}