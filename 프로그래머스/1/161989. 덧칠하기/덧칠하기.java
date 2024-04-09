class Solution {
    public int solution(int n, int m, int[] section) {
        int start = section[0];
        int end = section[0] + (m-1);
        int answer = 1;
            
        for(int i : section){
            // answer번째 롤러칠 범위에 들어가는 경우
            if(i>=start && i<=end)  continue;
            
            // 롤러칠 범위에서 벗어난 경우 새롭게 롤러칠
            else{
                start = i;
                end = i + (m-1);
                answer++;
            }
        }
        return answer;
    }
}