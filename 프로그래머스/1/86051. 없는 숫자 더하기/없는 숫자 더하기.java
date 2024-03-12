class Solution {
    public int solution(int[] numbers) {
        int[] list = new int[10];
        int answer = 0;
        
        for(int num : numbers){
            list[num] += 1;
        }
        
        for(int i = 1; i <= 9; i++){
            if (list[i] == 0) answer += i;
        }
        
        return answer;
    }
}