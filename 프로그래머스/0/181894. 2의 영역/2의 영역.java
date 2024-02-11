import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = -1, end = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(start == -1 && arr[i] == 2){
                start = i;
            }
            
            if(start != -1 && arr[i] == 2){
                end = i;
            }
        }
        
        return (start != -1 && end != -1) ? Arrays.copyOfRange(arr, start, end+1) : new int[]{-1};
    }
}