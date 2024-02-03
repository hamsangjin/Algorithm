import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] arr = new int[1000];
        int cnt = 1;
        arr[0] = n;
        
        for(int i = 1; i < 1000; i++){
            
            // 1이냐 ?
            if (arr[i-1] == 1){
                break;
            }
            
            if(arr[i-1] % 2 == 0){               // 짝수냐 ?
                arr[i] = arr[i-1] / 2;    
            } else{                                 // 홀수냐 ?
                arr[i] = (3 * arr[i-1]) + 1;
            }
            
            // 배열 길이
            cnt += 1;
        }
        
        int[] answer = Arrays.copyOf(arr, cnt);
        
        return answer;
    }
}