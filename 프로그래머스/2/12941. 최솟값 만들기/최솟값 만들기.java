import java.util.*;
class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i = 0, j = A.length - 1; i < A.length; i++, j--){
            answer += A[i] * B[j];
        }

        return answer;
    }
}