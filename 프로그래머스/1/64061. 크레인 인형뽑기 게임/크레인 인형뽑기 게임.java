import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> st = new Stack<>();
        int answer = 0;
        
        int n = board.length;
        
        int[] ch = new int[n];
        for(int i = 0; i < n; i++)  ch[i] = -1;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[j][i] != 0){
                    ch[i] = j;
                    break;
                }
            }
        }
        
        for(int m : moves){
            m -= 1;
            int x = 0;
            if(ch[m] != -1 && ch[m] < n){
                x = board[ch[m]][m];
                ch[m] += 1;
            } else  continue;
            
            if(!st.isEmpty() && st.peek() == x){
                st.pop();
                answer += 2;
            }
            else    st.push(x);
        }
        
        
        return answer;
    }
}