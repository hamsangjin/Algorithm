import java.util.*;

class Solution {
    public long solution(int n) {

//         1 = 1
//             (1)
//         2 = 2
//             (1, 1) (2) 
//         3 = 3
//             (1, 1, 1) (1, 2) (2, 1)
//         4 = 5
//             (1, 1, 1, 1) (1, 1, 2) (1, 2, 1) (2, 1, 1) (2, 2)
//         
//         n = n-1 + n-2
        
        int[] dp = new int[2001];
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i = 3; i <= 2000; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }
        
        return dp[n];
    }
}