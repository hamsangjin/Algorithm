class Solution {
    static boolean[] ch;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        ch = new boolean[n+1];
        
        for(int v = 0; v < n; v++){
            if(!ch[v]){
                dfs(v, n, computers);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int v, int n, int[][] computers){
        ch[v] = true;
        
        for(int nv = 0; nv < n; nv++){
            if(!ch[nv] && computers[v][nv] == 1){
                dfs(nv, n, computers);
            }
        }
    }
}