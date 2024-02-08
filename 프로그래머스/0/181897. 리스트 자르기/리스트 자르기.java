import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0], b = slicer[1], c = slicer[2];
        int n_4 = ((b-a) % 2 == 0) ? (b-a)/2 + 1 : (b-a+1)/2;
        int[] answer_4 = new int[n_4];
        
        switch(n){
            case 1: return Arrays.copyOfRange(num_list, 0, b+1);
            case 2: return Arrays.copyOfRange(num_list, a, num_list.length);
            case 3: return Arrays.copyOfRange(num_list, a, b+1);
            case 4: for(int i = a, j = 0; i <= b; i+=2, j++){
                answer_4[j] = num_list[i];
            }
        }
        return answer_4;
    }
}