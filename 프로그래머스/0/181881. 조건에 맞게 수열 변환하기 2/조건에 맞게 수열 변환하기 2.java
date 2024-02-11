import java.util.*;

class Solution {
    public int solution(int[] arr) {
        
        int[] temp = Arrays.copyOf(arr, arr.length);
        int x = 0;
        
        while(true){
            
            // 연산 전 배열 저장
            temp = Arrays.copyOf(arr, arr.length);
            
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] /= 2;
                } else if(arr[i] < 50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            
            // 연산 후 배열 비교
            if(Arrays.equals(temp, arr)){
                break;
            };
            
            x++;
        }
        
        return x;
    }
}