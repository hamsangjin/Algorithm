class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] s = new int[n];

        for(int l : lost)   s[l-1] --;
        for(int r : reserve)   s[r-1] ++;
        for(int i = 1; i < n-1; i++){
            if(s[i] == 1){
                if(s[i-1] == -1){
                    s[i-1] ++;
                    s[i]--;
                } else if(s[i+1] == -1){
                    s[i+1]++;
                    s[i]--;
                }
            } else if(s[i] == -1){
                if(s[i-1] == 1){
                    s[i-1] --;
                    s[i]++;
                } else if(s[i+1] == 1){
                    s[i+1]--;
                    s[i]++;
                }
            }
        }

        for(int i : s)  if(i == -1) answer--;

        return answer;
    }
}