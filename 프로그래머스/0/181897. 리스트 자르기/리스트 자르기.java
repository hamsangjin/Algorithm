import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0], b = slicer[1], c = slicer[2];
        
        int[] answer = null;
        
        switch(n){
            case 1: 
                answer = Arrays.copyOfRange(num_list, 0, b+1);
                break;
                
            case 2: 
                answer = Arrays.copyOfRange(num_list, a, num_list.length);
                break;
                
            case 3: 
                answer = Arrays.copyOfRange(num_list, a, b+1);
                break;
                
            case 4: 
                answer = new int[((b-a) % 2 == 0) ? (b-a)/2 + 1 : (b-a+1)/2];
                
                for(int i = a, j = 0; i <= b; i+=2, j++){
                    answer[j] = num_list[i];
                }
                break;
        }
        
        return answer;
    }
}