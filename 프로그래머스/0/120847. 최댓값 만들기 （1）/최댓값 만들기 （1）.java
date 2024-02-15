class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[][] ch = new int[numbers.length][numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(ch[i][j] == 0 && ch[j][i] == 0 && i != j){
                    answer = Math.max(numbers[i]*numbers[j], answer);
                    ch[i][j] = 1;
                    ch[j][i] = 1;
                }
            }
        }
        
        return answer;
    }
}