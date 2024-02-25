class Solution {
    public int solution(int[][] lines) {
        int[] ch = new int[200];
        int answer = 0;
        
        for (int[] line : lines) {
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) {
                ch[j]++;
            }
        }
       
        for (int value : ch) {
            if (value > 1) answer++;
        }
        
        return answer;
    }
}