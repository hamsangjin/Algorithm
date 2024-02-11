import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int len = num_list.length;
        int[] answer = new int[len];
        
        int[] arr1 = Arrays.copyOfRange(num_list, n, len);
        int[] arr2 = Arrays.copyOfRange(num_list, 0, n);
        
        for(int i = 0, j = 0; i < arr1.length; i++, j++){
            answer[i] = arr1[j];
        }
        
        for(int x = arr1.length, y = 0; x < len; x++, y++){
            answer[x] = arr2[y];
        }

        return answer;
    }
}