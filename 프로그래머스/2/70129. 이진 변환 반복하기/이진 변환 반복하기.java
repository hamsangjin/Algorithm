class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int temp;
        
        while(!s.equals("1") ) {
            answer[1] += s.length();
            
            s = s.replaceAll("0", "");
            answer[1] -= s.length();
            
            s = Integer.toBinaryString(s.length());
            answer[0]++;
            
        }
        return answer;  
    }
}