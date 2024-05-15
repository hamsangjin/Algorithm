class Solution {
    static int answer;
    public int solution(int[] number) {
        answer = 0;
        
        dfs(0, 0, 0, number);
        return answer;
    }
    
    public static void dfs(int cnt, int sum, int ch, int[] number){
        if(ch == 3){
            if(sum == 0)    answer++;
            return;
        } else if(cnt == number.length) return;
        
        dfs(cnt+1, sum+number[cnt], ch + 1, number);
        dfs(cnt+1, sum, ch, number);
    }
}