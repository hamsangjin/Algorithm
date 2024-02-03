import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] str = my_string.toCharArray();
        
        for(int[] query : queries){
            // query[0], [1] 저장
            int s = query[0], e = query[1];
            
            // 배열 복사
            char[] temp = Arrays.copyOf(str, str.length);
            
            // 뒤집기
            // s부터 e에 e부터 s까지를 복사
            for (int i = e, j = s; i >= s; i--, j++) {            
                str[j] = temp[i];        
            }
            
        }
        return String.valueOf(str);
    }
}