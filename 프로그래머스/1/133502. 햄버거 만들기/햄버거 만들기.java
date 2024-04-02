// 햄버거를 포장해야한다.
// 햄버거는 빵(1) - 야채(2) - 고기(3) - 빵(1) 순으로만 포장한다.
// 포장할 수 있는 개수는 몇 개냐 ?

// 1
// 3
// 2
// 1
import java.util.*;

class Solution {  
    public int solution(int[] ingredient) {
        Stack<Integer> st = new Stack<>();
        int answer = 0;
        for(int x : ingredient){
            st.push(x);
            int n = st.size();
            if(n >= 4){
                if(st.get(n-1) == 1 && st.get(n-2) == 3 && st.get(n-3) == 2 && st.get(n-4) == 1){
                    answer ++;
                    st.pop();
                    st.pop();
                    st.pop();
                    st.pop();
                }
            }
        }
        
        return answer;
    }
}