import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        // 배열 크기 찾기
        for (int i = 1; i <= (int) Math.pow(2, 10); i *= 2){
            if(arr.length <= i){
                answer = new int[i];
                break;
            }
        }
        
        // int len = 1
        // while (len < arr.length) {
        //     targetLength *= 2;
        // }
        
        System.arraycopy(arr, 0, answer, 0, arr.length);
        
        return answer;
    }
}